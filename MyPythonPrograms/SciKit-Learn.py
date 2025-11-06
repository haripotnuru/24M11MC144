from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
x=[[1,2],[3,4],[5,6]]
y=[0,1,0]
x_train,x_test,y_train,y_test=train_test_split(x,y,random_state=42)
model=RandomForestClassifier()
predictions=model.predict(x_test)
print("prediction",predictions)