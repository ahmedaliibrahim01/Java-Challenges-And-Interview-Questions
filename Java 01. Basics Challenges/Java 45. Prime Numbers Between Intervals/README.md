## Prime Numbers Between Intervals

### Problem Description
Create a method to find all the prime numbers between two intervals using a method.

**Step 1:**

- Create a method named checkPrime() with an integer parameter, number.
- Inside the method, check if the number is prime or not.
- If the number is prime, return true. Otherwise, return false.

**Step 2:**

- Inside main(), get integer inputs for two intervals x and y, such that y should be greater than x.
- Run a loop to access each number between x and y.
- Call checkPrime() with each value between the intervals.
- If the returned value is true, print the number.

### Example
    Test Input
    21
    50
------
    Expected Output
    23
    29
    31
    37
    41
    43
    47