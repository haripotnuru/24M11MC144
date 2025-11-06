str1="Hello"
str2="World!"
print(str1,"  ",str2)
str3=str1+str2   #Concatinating two strings
#Here + is an operator to concatinate two strings 
print("After concatinating two strings:",str3)
# this mechanisim is called slicing the string that means cutting 
#By using slicing we can split one string as two or more strings
#by using String_name[start:end:step] we can split
str4=str3[0:len(str3):2]
print(str4)
#to calculate the length of the string we use len() method to calculate how many laters there on the string
print(len(str3))