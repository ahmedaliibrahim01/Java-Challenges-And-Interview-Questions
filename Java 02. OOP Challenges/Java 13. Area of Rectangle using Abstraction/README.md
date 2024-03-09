## Area of Rectangle using Abstraction

### Problem Description
Create a program to calculate the area of a rectangle.

**Step 1:**

- Create an abstract class named Polygon with an abstract method calculateArea().
- Create another class named Rectangle that inherits from the Polygon class.
- Inside the class, create two fields length and breadth.
- Use a parameterized constructor with parameters length and breadth to initialize the fields.
- Also, provide the implementation of the calculateArea() method to compute the area of the rectangle and print it.

**Step 2:**

- Create the main() method inside a Main class.
- Get integer inputs for the length and breadth variables.
- Create an object of the Rectangle class with arguments length and breadth.
- Call the calculateArea() method using the object.

### Example
    Test Input
    5
    9
-----
    Expected Output
    45