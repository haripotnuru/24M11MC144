s={10,20,30}
# L=[40,50,30,20]
# s.update(L,range(5))
# print(s)
# s.add(460)
# print(s)
s.update(range(1,20,3),range(9,30,3))
print(s)
s1=s
print(s1)
#using pop() funtion to remove an element
s4={50,40,30,20,4,39,495,289,293,374,346,280,3}
print(s4)
print(s4.pop(),":",s4.pop())
print(s4)
s4.remove(20)
print(s4)
s4.discard(1000)
print(s4)
s4.clear()
print(s4)
# print(s4.update(40,50,70,59,60))
x={10,20,30,40}
y={40,30,50,60}
print(x-y)
print(y-x)
k=x.difference(y)
print(k)