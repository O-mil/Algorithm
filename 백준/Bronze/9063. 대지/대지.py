n = int(input())
x_point = []
y_point = []

for i in range(n):
    x, y = map(int, input().split())
    x_point.append(x)
    y_point.append(y)

x_max = max(x_point)
x_min = min(x_point)
y_max = max(y_point)
y_min = min(y_point)

print((x_max - x_min) * (y_max - y_min))