d={1:"abc",2:"bcd",3:"cde"}
for a,b in d.items():
  print(a,"-->",b)
print(d.setdefault(4,"def"))
print(d)
print(d.setdefault(1,"efg"))
print(d)
s=input("Enter String ")
i=0
for x in s:
  print("The character present at positive index {} and at negative index{} is {}".format(i,i-len(s),x))