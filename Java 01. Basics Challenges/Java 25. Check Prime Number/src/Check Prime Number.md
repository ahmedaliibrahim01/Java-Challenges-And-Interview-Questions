Check Prime Number
-
Problem Description
-
Create a program to check whether a number is prime or not.

A prime number is a number that is only divisible by either 1 or itself. For example, 7, 5, 19, etc.

- Get an integer input for the variable number.
- Create a flag variable with initial value 0.
- Run a loop from 2 to number - 1 and check if number is divisible by any number between 2 to number - 1.
- If the number is divisible, change the value of flag to 1 and break the loop.
- Outside the loop, check if the value of flag is 1. If true, print Not a Prime Number. Otherwise, print Prime Number.

Example
-
    Test Input
    7
----
    Expected Output
    Prime Number