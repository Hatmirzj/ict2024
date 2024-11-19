
list = [1,2,3,4,5,6,7,4,5,6,4,5,6]    
print(list.count(4))    
print(list[1])    
print(list[2])    
print(list[3])    
# Slicing the elements    
print(list[0:6])    
# By default, the index value is 0 so its starts from the 0th element and go for index -1.    
print(list[:])    
print(list[2:5])    
print(list[1:6:2])   
list.insert(2,99) 
list.append(23)
print(len(list))

List = [1, 2, 'Geeks', 4, 'For', 6, 'Geeks']

# accessing an element using
# negative indexing
print("Accessing element using negative indexing")

# print the last element of list
print(List[-1])

# print the third last element of list
print(List[-3])