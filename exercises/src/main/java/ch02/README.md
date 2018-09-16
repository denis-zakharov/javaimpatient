# Ex2
Scanner.nextInt is an access method.

Random.nextInt is a modifying method. It may change the `seed` field on each iteration.

# Ex3
A modifying method can return other values besides `void`, see #Ex2 or `Map.put`

An access method may have `void` return type (i.e. access to internals for side-effect such as output).

# Ex4
All primitives are passed-by-value so we can't change their values in a method.
