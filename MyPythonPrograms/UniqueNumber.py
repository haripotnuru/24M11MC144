def uniqueNumCheck(num):
  set1=set()
  for i in num:
    set1.add(i)
  if len(num)==len(set1):
    return "Unique Number"
  return "Not Unique Number"
num=input()
print(uniqueNumCheck(num))