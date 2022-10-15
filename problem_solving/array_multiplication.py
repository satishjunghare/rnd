'''
I/P : {2, 3, 4, 5, 6}
O/P : {2*3, 3*2, 3*4, }
Update every element by product of previous and next element
'''

# Bruit Force Solution
arr = [2,3,4,5,6]
output = list(range(len(arr)))
print(output)
for i in range(len(arr)):
    prevValue = arr[i] if i==0 else arr[i-1]
    nextValue = arr[i] if i==len(arr)-1 else arr[i+1]
    output[i] = prevValue * nextValue
print(output)

# Optimized Solution
arr = [2,3,4,5,6]
prevValue = arr[0]
arr[0] = prevValue * arr[1]

for i in range(1, len(arr)-1):
    currValue = arr[i]
    arr[i] = prevValue * arr[i+1]
    prevValue = currValue

arr[len(arr)-1] = prevValue * arr[len(arr)-1]

print(arr)
