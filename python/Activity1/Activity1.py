
name=input("Enter your name : ")
age=input("Enter you age : ")

year=str((2020-int(age))+100)
print(name+" you will be turning 100 in the year "+year)

if int(age) > 20:
    print("age greater than 20")
else:
    print("age is lesser than 20")