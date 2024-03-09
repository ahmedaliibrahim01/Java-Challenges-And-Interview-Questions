## Find Intersection of two HashSets

### Problem Description
Create a program to find intersection of two hashsets.

- Inside the main() method, declare a new string HashSet called wildAnimal.
- Take three string inputs from the user and store them in input1, input2, input3.
- Add input1, input2, input3 to wildAnimal using the add() method.
- Declare another new string HashSet called domesticAnimal.
- Take three string inputs from the user and store them in the input4, input5, input6.
- Add input4, input5, input6 to domesticAnimal using the add() method.
- Use the retainAll() method of wildAnimal to update it to its intersection with domesticAnimal.
- Print wildAnimal.

## Example
    Test Input
    Cow
    Dog
    Rabbit
    Lion
    Tiger
    Rabbit
------
    Expected Output
    [Rabbit]