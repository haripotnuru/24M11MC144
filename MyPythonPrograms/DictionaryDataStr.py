#Dictionay data structure
#There is no duplicate key value which represent the data
#but value are duplicate but is not duplicate
rec={}
n=int(input("Enter No of students:"))
i=1
while i<=n:
  name=input("Enter the Student Name:")
  marks=input("Enter % Of marks of student:")
  rec[name]=marks
  i=i+1
print("Name of the Student","\t","% Of Student")
for x in rec:
  print("\t",x,"\t\t\t",rec[x])
rec[100]="hello"
print("After deleting")
for k in rec:
  print(k,"\t\t",rec[k])
d={100:"hari",200:"ravi",300:"harish"}
print(d.keys())
for abs in d.keys():
  print(abs)
