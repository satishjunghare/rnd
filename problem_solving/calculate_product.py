'''
Calculate product value of given array
Input Array : [1,2,3,4,5]
Output : [120,60,40,30,24]
'''

arr = [1,2,3,4,5]
l = len(arr)
left = list(range(l))
right = list(range(l))
output = list(range(l))

left[0] = 1
right[l-1] = 1

for i in range(1, l):
    left[i] = left[i-1] * arr[i-1]

for j in range(l-2, -1, -1):
    right[j] = right[j+1] * arr[j+1]

for k in range(l):
    output[k] = left[k] * right[k]

print(output)