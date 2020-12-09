#Create a Python dictionary that contains a bunch of fruits and their prices.
#Write a program that checks if a certain fruit is available or not.

fruits={
    "apple" : 100,
    "orange" : 80,
    "mango" : 75,
    "guava" : 120,
    "cherry" : 300,
    "jackfruit" : 250
}

keyitem=input("Welcome to Fruit Shop, what do you want ? ").lower()

if keyitem in fruits:
    print("Item Available!!","...Priced at",fruits[keyitem])
else:
    print("Item Not Available!!")