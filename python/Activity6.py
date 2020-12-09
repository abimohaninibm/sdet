#Print the number to the number of times
# 1
# 22
# 333
# 4444
# 55555
# 666666
# 7777777
# 88888888
# 999999999

number = int(input("Enter the number : "))

#implementation using nested loop
for x in range(number+1):
    for y in range(x):
        print(x)

print("***************************")
#option2
for i in range(number+1):
    print(str(i)*i)