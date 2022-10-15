# Reserver string
str = "satish junghare"
output = ""
for s in str:
    output = s + output
print(output)

# Reverse an list
arr = [1,2,3]
last_index = len(arr)
for i in range(last_index):
    last_index = last_index - 1
    if last_index <= i:
        break
    temp = arr[i]
    arr[i] = arr[last_index]
    arr[last_index] = temp
print(arr)
