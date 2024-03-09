## Check Palindrome Number

### Problem Description
Create a program to check whether a number is palindrome using a method.

**Definition:**

A number is palindrome if the reverse of that number is equal to the original number. For example, 1001, 343, etc.

**Step 1:**

- Create a method named findReverse() that accepts an integer parameter number.
- Inside the method, find the reverse of number and return it.

**Step 2:**

- Create a method named checkPalindrome() that takes two integer parameters: number and reversedNumber.
- Inside the method, compare two parameters.
- If they are equal, print Palindrome Number. Otherwise, print Not a Palindrome Number.

**Step 3:**

- Inside main(), take an integer input for the number variable.
- Call findReverse() with number as the argument and store the returned value to reversedNumber.

### Example
    Test Input
    1001
------
    Expected Output
    Palindrome Number