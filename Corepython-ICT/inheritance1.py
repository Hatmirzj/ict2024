# parent class
class Parent: 
   def parentMethod(self):
      print ("Calling parent method")
      print('super')


# child class
class Child(Parent): 
   def childMethod(self):
      print ("Calling child method")
      print('sub')

p=Parent()
p.parentMethod()

# instance of child
c = Child()  
# calling method of child class
c.childMethod() 
# calling method of parent class
c.parentMethod() 