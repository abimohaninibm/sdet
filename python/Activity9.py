#Given a two list of numbers create a new list such that new list should
# contain only odd numbers from the first list and even numbers from the second list.

L1=list(input("Enter list1:").split(","))
L2=list(input("Enter list2:").split(","))

L3=list()

for x in L1:
    if (int(x) % 2 == 1):
        L3.append(x)
    

for y in L2:
    if (int(y) % 2 == 0):
        L3.append(y)
        

print("The third list is : ",L3)