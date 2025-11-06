def sum_of_squares(numbers):
  if not isinstance(numbers,list):
    raise ValueError("Input must be list of numbers or Integer")
  total=0
  for i in numbers:
    # total+=i**2
    if not isinstance(i,(int,float)):
      raise ValueError(f"Invalid input:{i} is not a number.")
    total+=i**2
  return total
try:
  numbers=[1,2,3,4]
  result=sum_of_squares(numbers)
  print(f"Sum of squares: {result}")
  
  invalid_numbers=[1,2,"three",4]
  result=sum_of_squares(invalid_numbers)
  print(f"Sum of squares: {result}")
  
  invalid_List=(1,2,"three",4)
  
  
  result=sum_of_squares(invalid_List)
  print(f"Sum of squares: {result}")
  
except ValueError as e:
  print(f"Error:{e}")