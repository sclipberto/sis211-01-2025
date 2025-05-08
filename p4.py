print('0-4 con while')
i=0
while i<5:
    print(i)
    i=i+1

print('0-4 con for')
for i in range(5):
    print(i)

print('0-4 con una especie de do-while')
i=10
while True:
    print(i)
    i=i+1
    if i>=5:
        break