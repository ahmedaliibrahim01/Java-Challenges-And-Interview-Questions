## Access Overridden Method Superclass

### Problem Description
Create a program to Access the overridden method of the Parent Class.

**Step 1:**

- Create a class named Animal with a display() method.
- Inside the method, print I am an animal.
- Create another class named Dog that inherits from Animal.
- Inside the class, override the display() method to print I am a dog.
- Inside display() of Dog, call the display() method of Animal class using the super keyword.

**Step 2:**

- Create the main() method inside a Main class.
- Inside the method, create an object of the Dog class.
- Call display() using the object.

### Example
    Expected Output
    I am an animal
    I am a dog