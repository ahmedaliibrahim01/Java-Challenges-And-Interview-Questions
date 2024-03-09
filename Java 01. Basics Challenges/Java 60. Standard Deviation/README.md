## Compute Standard Deviation

### Problem Description
Create a program to calculate the standard deviation.

**calculateSD() method**
-

- Create a method calculateSD() with an integer array data as parameter.
- Inside the method, find the sum of all the array elements.
- Compute the mean of array elements.
- Find the difference of each array value and mean.
- Compute the square of each difference using Math.pow().
- Add all the squared differences and assign to result.
- Compute the variance by dividing the result by data.length.
- Compute the square root of variance using Math.sqrt() and assign it to sd.
- Return sd.

**main() method**
-

- Get 5 integer input values for an array.
- Call calculateSD() with the array as argument.
- Print the returned value.

### Example
    Test Input
    9
    12
    21
    11
    14
-------
    Expected Output
    4.127953488110059