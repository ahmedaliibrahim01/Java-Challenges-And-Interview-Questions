## Implement Multilevel Inheritance

### Problem Description
Create a program to implement multilevel inheritance.

**Step 1:**

- Create a superclass named Animal with a eat() method.
- Inside the method, print I eat animal food..
- Create another class named Mammal that inherits from Animal.
- Inside the class, create a method named display() that prints I am a mammal..

**Step 2:**

- Create a class named Dog that inherits from the Mammal class.
- Inside the class, create a displayName() method with a string parameter, name and print the name.

**Step 3:**

- Create the main() method inside a Main class.
- Get a string input for the name variable.
- Create an object of the Dog class.
- Call the displayName() with parameter name using the object.
- Also, call the display() method of Animal and the eat() method of Mammal using the object of Dog class.

### Example
    Test Input
    Bruno
------
    Expected Output
    My name is Bruno.
    I am a mammal.
    I eat animal food.