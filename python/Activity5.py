#Multiplication table
number =int(input("Enter the number :"))

print(number,", multiplication table")
print("******************************")
for num in range(1,11,1):
    print(number,"x",num,"=",number*num)
else:
    print("End..")