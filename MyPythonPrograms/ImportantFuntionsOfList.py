# n=list(range(2,10))
# print(n.index(8))
list1=[]
for i in range(101):
  if i%10==0:
    list1.append(i)
    print(list1)
for j in list1:
  list1.remove(list1[len(list1)-1])
  print(list1)
