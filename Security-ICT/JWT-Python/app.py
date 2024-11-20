from flask import Flask, jsonify, request
from flask_jwt_extended import (
    JWTManager, create_access_token, jwt_required, get_jwt_identity
)

app = Flask(__name__)

# Configure the JWT secret key
app.config["JWT_SECRET_KEY"] = "your-secret-key"  # Change this to a strong key
jwt = JWTManager(app)

# Mock user database
users = {
    "testuser": {"password": "testpassword"}
}

@app.route("/login", methods=["POST"])
def login():
    """
    Login endpoint to authenticate users and generate JWT.
    """
    username = request.json.get("username", None)
    password = request.json.get("password", None)

    if not username or not password:
        return jsonify({"msg": "Missing username or password"}), 400

    # Check if the user exists and the password matches
    user = users.get(username)
    if not user or user["password"] != password:
        return jsonify({"msg": "Bad username or password"}), 401

    # Create access token
    access_token = create_access_token(identity=username)
    return jsonify(access_token=access_token)

@app.route("/protected", methods=["GET"])
@jwt_required()
def protected():
    """
    Protected endpoint that requires a valid JWT token to access.
    """
    current_user = get_jwt_identity()
    return jsonify(logged_in_as=current_user), 200

if __name__ == "__main__":
    app.run(debug=True)
