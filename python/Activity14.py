def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

num = int(input("Enter a number: "))
print("Fib Sequence: ")
for i in range(1,num+1):
    print(fibonacci(i))