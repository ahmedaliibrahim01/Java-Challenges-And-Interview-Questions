## LCM of Two Numbers

### Problem Description
Create a program to find LCM of two numbers using a method.

LCM (Lowest Common Multiple) of two numbers, x and y is the smallest positive integer that is perfectly divisible by both x and y.

**Step 1:**

- Create the findLCM() method with parameters: num1 and num2.
- Inside the method, set lcm equal to the largest value among num1 and num2.
- Run an infinite while loop and increase the value of lcm by 1 in each iteration.
- Inside the loop, check if lcm is perfectly divisible by num1 and num2.
- If true, terminate the loop.
- Return the value of lcm.

**Step 2:**

- Inside main(), get integer input for number1 and number2.
- Call findLCM() with parameters number1 and number2.
- Print the returned value.

### Example
    Test Input
    72
    120
------
    Expected Output
    360