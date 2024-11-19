import mysql.connector

mydb = mysql.connector.connect(
 host="localhost",
  user="root",
  password="root",
  port='3307',
  database='pythontraining1'
)

mycursor = mydb.cursor()


mycursor.execute("CREATE TABLE customers (name VARCHAR(10), address VARCHAR(20))")