def sum(num):
    if num == 0:
        return num
    else:
        return num+sum(num-1)
    
n=int(input("Enter the number : "))
print("The sum from",n,"to 0 is:",sum(n))