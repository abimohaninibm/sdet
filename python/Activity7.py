#Sum of elements in the list
list1=list(input("Enter the elements seperated by comma : ").split(","))

print("entered list is : ",list1)
print("********************************************")

#Sum of the elements in the list
sum=0

for j in list1:
    sum =  sum + int(j)

print("Sum of the elements in list : ",sum)