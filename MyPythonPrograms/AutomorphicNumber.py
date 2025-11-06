sNum=input()
sqNum=(int(sNum))**2
#print(sqNum)
sqrstrNum=str(sqNum)
#print(sqrstrNum)
if sNum==sqrstrNum[-len(sNum):]:
  print("Automatic Number")
else:
  print("not")