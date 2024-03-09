## Finding nemo

### Problem Description
Create a program to find nemo.

- Import java.util.ArrayList;, java.util.Collections; and java.util.Scanner;.
- Create a new String ArrayList called fish.
- Take three string inputs from the user and store them in input1, input2, input3.
- Add input1, input2, input3 to fish using add().
- Using the binarySearch() method of Collections, search element nemo in the fish arraylist.
- Store returned integer in pos.
- Check if nemo is present in fish arraylist. ( **Hint:** Check if the value of pos is greater or equal to 0.)
- If so print pos.
- Else print Not Found.
**Note:** We will assume that the user will always enter the input in alphabetical order.

### Example
    Test Input
    dory
    gill
    nemo
-----
    Expected Output
    2