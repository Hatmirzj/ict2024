import numpy as np 
a = np.array([1,2,3]) 
print(a)

print('2 dimensional array')
b = np.array([[1, 2], [3, 4]]) 
print(b)

print('3 array with complex type')
c = np.array([1, 2, 3], dtype = complex) 
print(c)


# matrix dimension - shape
a1 = np.array([[1,2,3],[4,5,6]]) 
print(a1.shape)

a2 = np.array([[1,2,3],[4,5,6]]) 
a2.shape = (3,2) 
print(a2)
print('\n')
a3 = np.array([[1,2,3],[4,5,6]]) 
a31=a3.reshape(3,2)
print(a31)