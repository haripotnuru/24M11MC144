#powerful pattern matching and searching
#Regular Expression allow to define powerful maching
#'.'=> Matches any single character except newline
#'*'=> Matches 0 or more repetations of the preceding charator
##Example:Searching for a word
import re
text="Python is a powerful progamming language"
pattern=r"powerful"
match=re.search(pattern,text)
if match:
  print(f"Match found:{match.group()}")
else:
  print("No Match found.")
text="Pyhon is fun. Python is powerful. Python is versatile "
