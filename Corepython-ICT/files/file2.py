with open("emptylist.py", "r") as file:
   lines = file.readlines()
   for l in lines:
      print(l, end='')
      