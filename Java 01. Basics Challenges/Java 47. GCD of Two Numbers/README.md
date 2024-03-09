## GCD of Two Numbers

### Problem Description
Create a program to find the GCD of two numbers using a method.

GCD (Greatest Common Divisor) of two numbers is the largest number that can exactly divide both the numbers.

**Step 1:**

- Create the findGCD() method with parameters: num1 and num2.
- Inside the method, create an integer variable gcd with value 1.
- Run a for loop from i = 1 to i <= num1 and i <= num2.
- Inside the loop, if i divides both num1 and num2, set gcd as i.
- Return the value of gcd.

**Step 2:**

- Inside main(), get integer input for two variables number1 and number2.
- Call findGCD() with arguments number1 and number2.
- Print the returned value.

### Example
    Test Input
    81
    153
----
    Expected Output
    9