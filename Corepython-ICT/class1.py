# defining class
#constructor   __inti__

'''

class Course:
   def __init__(self):
      self.id=101
      self.cname='python'
   def show(self):
      print(self.id,self.cname)
 # object1 
c=Course()
print('Id is {}'.format(c.id))
print('course is {}'.format(c.cname))
c.show()
c1=Course()
c1.show()


#Object2
c1=Course()
print('Id is {}'.format(c1.id))
print('course is {}'.format(c1.cname))
c1.show()

class Employee:
   'Common base class for all employees'
   def __init__(self):  #default 
      self.name = "Bhavana"
      self.age = 24
   def disp(self):
      print(self.name,self.age)
#object
e1 = Employee()
e1.disp()
e2=Employee()
e2.disp()

#print ("Name: {}".format(e1.name))
#print ("age: {}".format(e1.age))



# parameterized constructor  __init__
class Smartphone:
   # constructor    
   def __init__(self, device, brand):
      self.device = device
      self.brand = brand
   
   # method of the class
   def description(self):  #instance method
      return 'DEvice:'+self.device+'   BRand is :'+self.brand
      #return f"{self.device} of {self.brand} supports Android 14"

# creating object of the class
phoneObj = Smartphone("Smartphone", "Samsung")
iosObj=Smartphone("compactPhone","OPPO")
print(phoneObj.description()) 
print(iosObj.description())
'''
class Account:
   def __init__(self,acno,name,balance):
      self.acno=acno
      self.name=name
      self.balance=balance
   def disp(self):
      print(self.acno,self.name,self.balance)
   def deposit(self,amt):
      self.balance=self.balance+amt
   def withdraw(self,amt):
      self.balance=self.balance-amt
   def getbalance(self):
      print(self.balance) 

a=Account(12345,'pythondev',10000)
a.disp()
a.deposit(2000)
a.getbalance()
a.withdraw(5000)
a.disp()

