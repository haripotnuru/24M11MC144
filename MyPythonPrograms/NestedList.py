def l1():
  list1=[1,2,3,[5,4]]
  print(list1[3])
  n=[1,2,3,4,5,6,7,8,9,10]
  print(n[2:7:2])
  print(n[4::2])
  print(n[3:8])
  print(n[8:2:-2])
  print(n[4:100])
#list vs mutability
def l2():
  rate=[10,30,49,50,29]
  print(rate)
  rate[3]=89
  print(rate)
def main():
  i=int(input("enter value"))
  if i==1 or i==2:
    if i==1:
      l1()
    elif i==2:
      l2()
  else:
    print("enter 1 or 2 only")
  if __name__=="__main__":
    main()