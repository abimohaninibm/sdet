def sum(numbers):
    sum=0
    for num in numbers:
        sum+=int(num)
    return sum


numbers=input("Enter the numbers delimitted with , : ").split(",")
print("The sum of list of elements are :",sum(numbers))