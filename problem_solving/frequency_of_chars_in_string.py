str = "aaaccc"
output = {}

for i in str:
    if i in output:
        output[i] += 1
    else:
        output[i] = 1
print(output)