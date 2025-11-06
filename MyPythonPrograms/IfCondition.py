a=10
b=23
if(a>b):
    print("a is greater then b",a)
else:
    print("b is greater then a",b)
print(10<12)
print(10<32<45)
print(10<32<54>80)#Chain relational operator
#Note: Chaining of relational operators is possible. In the chaining, if all comparisons 
# returns True then only result is True. If atleast one comparison returns False then the 
# result is False 
print("//////////Equalality operators//////////////")
print(22==33)
print(22!=33)
print(10==True)
print(False==False)
print("durga"=="durga")
print(20=="durga")

# Note: Chaining concept is applicable for equality operators. If atleast one comparison 
# returns False then the result is False. otherwise the result is True. 

print("10==10!=20<=30==10",10==10!=20<=30==10)
print("10==10==10==10",10==10==10==10)