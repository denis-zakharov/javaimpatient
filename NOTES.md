# Numbers representation in binary format
## Unsigned integer
```
1111 -> 15
2^3 + 2^2 + 2^1 + 2^0 = 8 + 4 + 2 + 1
```

## Signed integer
Leading 1 (one) is for negative.
 
### How to convert positive to negative?
1. Invert bits
2. Add 1 bit

For example, 0111 is 7.
Inverting: 1000
Increment: 1001

1000 -> -8
1100 -> -4
1110 -> -2
1111 -> -1
0000 -> 0
0001 -> 1
0111 -> 7