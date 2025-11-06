#creating the set 
s1={10,20,30,40}
print(type(s1))
print(s1)
#changing the lsit to set by using set method
L1=[10,20,30,40,40,30,50,20,60]
print(L1,"-->",type(L1))
#print(L1)
s2=set(L1)
print(s2,"-->",type(s2))
#print(s2)
L1=list(s2)
print(type(L1),":",L1)
s3=set(range(1,30,2))
print(s3)
#Represent the Empety set we can use 