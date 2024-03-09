## Check Self-Dividing Number

### Problem Description
Create a program to check if a number is self-dividing number.

A self-dividing number is a number that is divided by every digit it contains. For example, 128:

    128 % 1 == 0
    128 % 2 == 0
    128 % 8 == 0

**Step 1:**

- Create the checkSelfDivide() method with an integer parameter, number.
- Use a while loop to access each digit of the number.
- Inside the loop, check if each digit of the number divides the number perfectly.
- If all digits of the number divides the number, print Self Dividing Number. Otherwise, print Not a Self Dividing Number.

**Step 2:**

- Inside main(), get an integer input for the number variable.
- Call checkSelfDivide() with the number argument.

**Assumption**

The input value shouldn't end with 0. For example, 230, 460, etc.

### Example
    Test Input
    128
-------
    Expected Output
    Self Dividing Number