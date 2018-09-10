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
```
For example, 0111 is 7.
Inverting: 1000
Increment: 1001

Some numbers of 4-bit signed range
1000 -> -8
1100 -> -4
1110 -> -2
1111 -> -1
0000 -> 0
0001 -> 1
0111 -> 7
```

## Floating point numbers
S * M * B^q, where
* S is a sign of mantissa (significant digits);
* M is a mantissa;
* B is a base (10 is for decimals);
* Q is an order of number;
```75.38 = 0.7538 * 10^2 or 7538 * 10^-2```

### IEEE 754: mantissa normalization
Do shift of a point until the most significant bit is not equal 1. The highest bit is not written; it is implicit.
3           | 62                        52  | 51           0
----------- | ----------------------------- | --------------
Sign        | Order                         | Mantissa

TODO description of conversion
75 = 1001011

0.38 = 0110000101000111101011100001010001111010111000

75.38 = 1001011.0110000101000111101011100001010001111010111000
