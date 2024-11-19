import mysql.connector

#install mysql connector
#python -m pip install mysql-connector-python

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  password="root",
  port='3307'
)
print('connected')

print(' this is mydb details',mydb)

mycursor = mydb.cursor()

mycursor.execute("CREATE DATABASE pythontraining1")