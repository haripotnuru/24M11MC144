n=int(input("Enter a number\n-->"))
listPrime=[]
for i in range(2,n):
  count=0
  prime=1
  for j in range(1,n):
    if(i%j==0):
      count+=1
  if(count==2):
     #print(i)
     listPrime.append(i)
num=int(input(f"Enter the nth term number in blw 1 to {len(listPrime)}\n-->"))
print("5th prime in prime numbers is-->",listPrime[num-1])
