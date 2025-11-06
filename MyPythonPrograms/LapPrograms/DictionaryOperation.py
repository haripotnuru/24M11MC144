print("Operations on Dictionary dataType\n")
contact={}
def add_contact(number,name):
  if number in contact:
    print(f"This {number} is already regestered try other number")
  else:
    contact[number]=name
    print(f"{contact[number]} Successfully regesterd")
def update_contact(number,name):
  if number in contact:
    contact[number]=name
    print(f"{contact[number]} Successfully Updated")
  else:
    print(f"This {name} : {number} not regestered Please regestered first")
def retrive_contact(number):
  if number in contact:
    print(contact[number] ," : ", number)
  else:
    print(f"This {number} Not regestered Yet")
def DeleteContact(number):
  if number in contact:
    print(f"This {contact[number]} name deleted from the contacts")
    del contact[number]
  else:
    print(f"{number} This number not in the contacts to delete")

print("Operations on contact")
add_contact("8374252591","hari")
add_contact("9494887662","rajesh")
update_contact("992323","shiva")
retrive_contact("8374252591")
DeleteContact("98345893275")
# KeyContact=set(contact.keys)
# ValueContact=list(contact.values)
print("\n".join(f"{v}: {k}" for k, v in contact.items()))