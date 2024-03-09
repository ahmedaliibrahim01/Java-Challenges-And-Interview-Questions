## Override Method in Multiple Classes

### Problem Description
Create a program to override the same method in multiple classes.

**Step 1:**

- Create a class named Animal with a method named display().
- Inside the method, print I am an animal.
- Inherit two classes named Dog and Cat from the same Animal class.
- Inside Dog, override display() to print I am a dog.
- Inside Cat, override display() to print I am a cat.

**Step 2:**

- Create the main() method inside a Main class.
- Inside the method, create objects of both Dog and Cat classes.
- Call the display() method using the objects of both classes.

### Example
    Expected Output
    I am a dog
    I am a cat