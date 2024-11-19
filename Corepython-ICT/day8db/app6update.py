import mysql.connector

mydb = mysql.connector.connect(
 host="localhost",
  user="root",
  password="root",
  port='3307',
  database='pythondb'
)

mycursor = mydb.cursor()
sql = "UPDATE customers SET address = 'Canyon 123' WHERE address = 'Valley 345'"
mycursor.execute(sql)
mydb.commit()

print(mycursor.rowcount, "record(s) affected")