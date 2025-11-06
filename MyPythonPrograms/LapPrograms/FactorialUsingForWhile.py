def FactorialWithFor(num):
  factor=1
  for i in range(1,num+1):
    factor*=i
  return factor
def FactorialWithWhile(num):
  factor,i=1,1
  while i<=num:
    factor*=i
    i+=1
  return factor
num=int(input("Enter the value to Calculate the Factorial :"))
print(f"The factorial for {num} With 'For' Loop is :{FactorialWithFor(num)}")
print(f"The factorial for {num} With 'While' Loop is :{FactorialWithWhile(num)}")
