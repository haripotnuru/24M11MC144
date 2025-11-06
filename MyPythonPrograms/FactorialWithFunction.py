def facto(n):
  sum=1
  if n==0 or n==1:
    return 1
  else:
    for i in range(1,n+1):
      sum=sum*i
    return sum
def factorial(n):
  if n==0 or n==1:
    return 1
  else:
    return n*factorial(n-1)
print(facto(15))