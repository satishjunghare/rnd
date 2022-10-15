'''
i/p : [1,4,2,5,7,6,0,9,8]
o/p : 3
'''

arr = [1,4,2,5,7,6,0,9,8]
l = len(arr)
arrSum = int((l*(l+1))/2)
currSum = 0
for i in(range(l)):
    if arr[i] != 0:
        currSum += arr[i]
print(arrSum-currSum)