# Array-Array-List-Comparison
# Difference-Arrays-ArrayLists

## Project Overview

This Java project demonstrates the differences between arrays and ArrayLists using a student enrollment program. The program stores student names in both types of collections and shows how an ArrayList can add or remove students.

## Arrays in Java

An array is a collection that stores a fixed number of elements of the same type. Once an array is created, its length cannot change, although the values stored in it can be updated.

Arrays are useful when programmers know how many elements they need. For example, in my previous Character Counter assignment, I used an array containing 26 positions because there are 26 lowercase letters in the English alphabet.

## ArrayLists in Java

An ArrayList is a collection that can grow or shrink while a program runs. Unlike an array, an ArrayList allows programmers to add or remove elements without manually creating a larger array.

One of the biggest advantages of an ArrayList is its flexibility. As programmers, we know requirements can change, and being able to adapt our code is important.

## Key Differences

Arrays have a fixed length, while ArrayLists can change size. Arrays use .length to determine the number of positions, while ArrayLists use .size() to determine how many elements they contain.

Arrays access elements using square brackets, such as students[0]. ArrayLists use methods such as studentList.get(0), add(), and remove().

In my student enrollment example, the array maintains its original three positions. However, the ArrayList can add Jacob when he enrolls and remove Sarah when she drops the class.


Both arrays and ArrayLists are useful in Java. I would choose an array when the number of elements is predictable and an ArrayList when the amount of data may change.

## References

Oracle. (n.d.). *Arrays*. The Java Tutorials. https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html

Oracle. (n.d.). *Class ArrayList<E>*. Java Platform, Standard Edition API Specification. https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/ArrayList.html
