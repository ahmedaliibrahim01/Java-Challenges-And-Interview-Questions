## Area of Square using Encapsulation

### Problem Description
Create a program to calculate the area of a square using encapsulation.

**Step 1:**

- Create a class named Square with a private field length.
- Create a public setter method to initialize the value of length.
- Inside the setter method, use an if...else condition to check if the length parameter is greater than 0.
- If it's greater than 0, initialize the private field with its value. Otherwise, print Length of a square cannot be less than 0..
- Create another method named calculateArea() to calculate the area of the square and print it.

**Step 2:**

- Inside the main() method, get integer input for the length variable.
- Create an object of Square.
- Call the setter method with the length argument.
- Call the calculateArea() method to calculate area of the square.

### Example
    Test Input
    5
------
    Expected Output
    25