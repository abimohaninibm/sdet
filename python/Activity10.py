#Given a tuple of numbers, iterate through it and print only those numbers which are divisible by 5

tup=tuple(input("Enter the items in tuple : ").split(","))

print("Numbers divisible by 5 are : ")
for i in tup:
    if (int(i) % 5 == 0):
        print(i)