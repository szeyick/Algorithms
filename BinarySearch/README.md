## Binary Search Algorithm:

### Introduction:

The binary search algorithm is used to find an item in a sorted array. The algorithm works as follows:

* Start in the middle of the array and ask these questions

**Is the number we're looking for the middle value?** 

If so, then the value exists.

**Is the number we're looking for smaller than the middle value?** 

If it is, then we need to look in the left half of the array.

** Is the number we're looking for larger than the middle value?**

If it is, then we need to look for it in the right half of the array.

Because we only have these three options (found, left side or right side), we have effectively divided the problem in half at each step. Once we have gone down one of these sides, we repeat the process again of starting in the middle with only one of the sides of the array.

We continue to do this until the array has been shrunk down to 1 item and it is not the value that we're looking for.

Code Solution:

The code solution is available on my GitHub page.

Runtime Complexity:

The runtime complexity to execute this algorithm is O(log(n)). We know this because at each stage of the algorithm, we reduce the original array in half until we get down to 1 in the worst case.

So we need to find out how many 1/2's there are till we reduce n (the input) down to 1. To do that we need to do some logarithmic calculations.

n * (1/2)^x = 1 // "How many times we divide n by 2, until we get 1, where x is the number of times"

n / 2^x = 1
n = 2^x

log(n) = x

