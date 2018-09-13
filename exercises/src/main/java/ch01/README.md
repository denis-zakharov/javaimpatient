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
[JVM floating-point types](https://docs.oracle.com/javase/specs/jvms/se10/html/jvms-2.html#jvms-2.3.2)

s ⋅ m ⋅ 2^(e − N + 1), where
* s is +1 or -1 (sign);
* m < 2^N (mantissa);
* Emin <= e <= Emax (order):
    * Emin = -(2^(K-1) - 2),
    * Emax = 2^(K-1) - 1.

Parameter|	float|	float-extended-exponent|	double|	double-extended-exponent
---|---|---|---|---
N|	24|	24|	53|	53
K|	8|	≥ 11|	11	|≥ 15
Emax |	+127	| ≥ +1023 |	+1023	| ≥ +16383
Emin |	-126 | 	≤ -1022	| -1022 | ≤ -16382

Each of the four value sets includes not only the finite nonzero values that are ascribed to it above, but also the five values positive zero, negative zero, positive infinity, negative infinity, and NaN.

### Double value type (64-bit) in IEEE 754

63 (1 bit)| 62 <--- 52 (11 bit) | 51 <--- 0 (52 bit)
----------|---------------------|-------------------
Sign      | Order               | Mantissa


### IEEE 754: mantissa normalization
Normalized

(-1)^S x 1.M x 2^E, Emin <= E <= Emax

Denormalized

(-1)^S x 0.M x 2^E, E = Emin - 1
