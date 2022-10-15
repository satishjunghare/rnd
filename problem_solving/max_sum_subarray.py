'''
I/P : 1, -3, 2, -5, 7
O/P :

Input will have possitive or negative values. You have to calculate sum of any contigious numbers from an array and find the maximum sum given by multiple calculations.
'''

# Bruite force approach
# Time complexity is O(n2)
arr = [1, -3, 2, -5, 7]

maxSum = arr[0]
for i in range(0, len(arr)):
    for j in range(0, len(arr)):
        if i > j:
            continue

        currSum = 0
        for k in range(i, j+1):
            currSum += arr[k]
        
        if currSum > maxSum:
            maxSum = currSum
print(maxSum)


# Optimal approach
maxSum = sum = 0
maxNeg = arr[0]
for i in range(0, len(arr)):
    if sum+arr[i] > 0:
        sum+=arr[i]
    else:
        sum = 0
    
    if sum > maxSum:
        maxSum = sum
    
    if arr[i] > maxNeg:
        maxNeg = arr[i]

if maxSum == 0:
    print(maxNeg)
else:
    print(maxSum)