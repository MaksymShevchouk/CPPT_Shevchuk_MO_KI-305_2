import sys

# введення розміру квадратної матриці і перевірка на дійсність його
nRows = int(input("Введіть розмір квадратної матриці (непарний): "))
if nRows % 2 == 0:
    print("Розмір матриці парний!!!")
    sys.exit()

# введення символа заповнювача квадратної матриці і первірка на те, чи він 1
symbol = input("Введіть символ-заповнювач: ")
if len(symbol) != 1:
    print("Потрібно ввести лише один символ!")
    sys.exit()
print()

arr = []
number1 = 1
number2 = nRows // 2
for i in range(nRows):
    if i > nRows // 2:
        arr.append([0 for i in range(number2)])
        number2 = number2 - 1
    else:
        arr.append([0 for i in range(number1)])
        number1 = number1 + 1 

for i in range(len(arr)):
    if i >= nRows // 2:
        for k in range(i+1):
            print(" ", end=" ")
    else:
        for k in range(nRows-i):
            print(" ", end=" ")
    for j in range(len(arr[i])):
        arr[i][j]=symbol
        print(arr[i][j], end=" ")
    print()

print()