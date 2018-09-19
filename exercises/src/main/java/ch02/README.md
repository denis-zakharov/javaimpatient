# Ex2
Scanner.nextInt is an access method.

Random.nextInt is a modifying method. It may change the `seed` field on each iteration.

# Ex3
A modifying method can return other values besides `void`, see #Ex2 or `Map.put`

An access method may have `void` return type (i.e. access to internals for side-effect such as output).

# Ex4
All primitives are passed-by-value so we can't change their values in a method.

# Ex12
For example, RandomNumbers.java is put into ch02 package and declared with a package ch02.sec01.
```
javac RandomNumbers.java
src\main\java> java ch02.RandomNumbers
Error: Could not find or load main class ch02.RandomNumbers
Caused by: java.lang.NoClassDefFoundError: ch02/sec01/RandomNumbers (wrong name: ch02/RandomNumbers)

javap RandomNumbers.class
Compiled from "RandomNumbers.java"
public class ch02.sec01.RandomNumbers {
  public ch02.sec01.RandomNumbers();
  public static int nextInt(int, int);
  public static int randomElement(int...);
  public static int randomElement(java.util.List<java.lang.Integer>);
  public static void main(java.lang.String[]);
  static {};
}

javac -d .. RandomNumbers
src\main\java> java ch02.sec01.RandomNumbers
```