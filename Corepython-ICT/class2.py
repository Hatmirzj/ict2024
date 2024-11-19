class Employee:
    def __init__(self,id,name,sal):
        self.id=id
        self.name=name
        self.sal=sal
    
    def show(self):
        print(self.id,'  ', self.name,'   ',self.sal)
    

emp1=Employee(101,'Ram',99999)
emp1.show()
print(emp1.id)
print(emp1.sal)