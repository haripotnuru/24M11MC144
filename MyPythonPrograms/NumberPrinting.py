num=int(input("Enter a value :"))
temp=num
reminder=0
# print(num)
# print(temp)
count=0
while temp!=0:
  temp=temp//10
  count+=1
#print(count)
power=count
for i in range(count):
  reminder=num%10**(power-1)
  #print(reminder)
  #print(num)
  num=num//10**(power-1)
  print(num)
  power=power-1
  #print(power)
  num=reminder
  #print(num)
  