n = int(input())
arr = []
for i in range(n):
    x = list(map(int, input().split()))
    arr.append(x)
arr.sort()
for i in range (n):
    print(arr[i][0], arr[i][1])