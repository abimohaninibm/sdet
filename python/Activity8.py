#Given a list of numbers, return True if first and last number of a list is same.

l=list(input("Enter the list delimitted by , : ").split(","))

print("Entered list is : ",l)

if l[0]==l[-1]:
    print("First Element : ",l[0])
    print("Last Element : ",l[-1])
    print("TRUE")
else:
    print("First Element : ",l[0])
    print("Last Element : ",l[-1])
    print("FALSE")