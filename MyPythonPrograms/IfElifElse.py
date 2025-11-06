#Write a python program whether to check the given number is big or less or equal using if elif else
num=int(input("Enter a value"))
if num>10&num<20:
  print("The number "+num+" is in b/w 10 to 20")
elif num>=0&num<=10:
  print("The number "+num+" is in b/w 0 to 10")
elif num>=20:
  print("The number "+num+" is greater then 20")
else:
  print("The number "+num+" is Less then 0")