x_point = []
y_point = []

for i in range(3):
    x, y = map(int, input().split())
    x_point.append(x)
    y_point.append(y)
    
for i in range(3):
    if x_point.count(x_point[i]) == 1:
        x4 = x_point[i]
    if y_point.count(y_point[i]) == 1:
        y4 = y_point[i]

print(x4, y4)