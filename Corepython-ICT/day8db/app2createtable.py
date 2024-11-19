import mysql.connector # type: ignore
#pip install mysql-connector-python

mydb = mysql.connector.connect(
 host="localhost",
  user="root",
  password="root",
  port='3306',
  database='training'
)

mycursor = mydb.cursor()


mycursor.execute("CREATE TABLE customers1 (name VARCHAR(10), address VARCHAR(20))")