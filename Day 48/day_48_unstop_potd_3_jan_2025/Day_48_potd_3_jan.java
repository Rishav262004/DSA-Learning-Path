/*

import sys
from bisect import bisect_left

def userLogic(n, arr, q, queries):

    arr.sort()
    results = []
    
    for x in queries:
        idx = bisect_left(arr, x)
        if idx < len(arr):
            results.append(arr[idx])
        else:
            results.append(-1)
    return results

def main():
    input = sys.stdin.read
    data = list(map(int, input().split()))
    
    t = data[0]
    index = 1
    results = []
    
    for _ in range(t):
        n = data[index]
        index += 1
        arr = data[index:index + n]
        index += n
        q = data[index]
        index += 1
        queries = data[index:index + q]
        index += q
        

        results.extend(userLogic(n, arr, q, queries))
    
    
    sys.stdout.write('\n'.join(map(str, results)) + '\n')

if __name__ == "__main__":
    main()


*/