import numpy as np

row = int(input("Enter number of row: "))
col = int(input("Enter number of colum: "))
print("Enter all element separated by space :")
val = list(map(int, input().split()))
if (len(val) == row * col) :
    matrix = np.array(val).reshape(row, col)
    print("Your matrix :")
    print(matrix)
else :
    if (len(val) > row * col) :
        print("Overload")
    else :
        print("Lack of element")