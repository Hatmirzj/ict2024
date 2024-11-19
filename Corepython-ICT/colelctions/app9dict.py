state_capitals = {
  'Tanzania':'Dodoma',
 'Arkansas': 'Little Rock',
 'Colorado': 'Denver',
 'California': 'Sacramento',
 'Georgia': 'Atlanta'
}
state_capitals.get('Georgia')
for k in state_capitals.keys():
 #   print(k)

   print(state_capitals[k],'-', k)
for k in state_capitals.items():
 print(k)

for k in state_capitals.values():
 print(k)

# print('{} is the capital of {}'.format(state_capitals[k], k))

Dict = {1: 'python', 2: 'Flask', 3: 'Django'}
print("\nDictionary with the use of Integer Keys: ")
print(Dict)


Dict = {}
print("Empty Dictionary: ")
print(Dict)


Dict = dict({1: 'Geeks', 2: 'For', 3: 'Geeks'})
print("\nDictionary with the use of dict(): ")
print(Dict)


print(Dict[2])
print(Dict.get(3))
