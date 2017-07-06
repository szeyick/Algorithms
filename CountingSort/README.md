## Counting Sort

Is a quick but very space inefficient algorithm that is used for sorting integers. The idea is to use numCounts array to hold the number of times a number occurs in the input array. The array indices of the numCounts array represent the value from the input array. 

As an example, if our input array is input[4, 5, 6], then in our numCounts array, the indices 4, 5 and 6 will map to the values of 4, 5 and 6 in the input array. Thus each of the indices (4, 5, 6) in numCounts will be 1 since they occur once in the input array.

So to sort, we scan through the input array and with each value we increment the count in the numCounts array at each index that the value occurs. Finally to output the sortedArray, we scan through the numCounts to add the correct number of times into the sortedArray.

### Runtime Complexity:

As mentioned earlier, counting sort is a very quick algorithm but a very space hungry algorithm. It is quick because at any time we only iterate at most through the number of values in the initial input array. This makes the algorithm run in O(n) time.

It is true that there is a nested loop when we scan through numCounts to populate the sortedArray. However that does not mean that the runtime shoots up to O(n^2). The reason being is that even though it is a nested loop, the maximum number of values it will end up in the sortedArray is n. The sorting does not create more values to put into the sortedArray.

Space complexity comes in at O(n) since we need an additional array to return the sorted values. 

There is also additional space complexity to consider when we create the numCount array. Because we need to know in advance the maximum value (to create the numCount array), we can end up creating a very large numCount array for very few items. An example of this is if the maximum value is 1000, but our input array only contains 100 values. This means that we will have lots of gaps in the numCount array (indices that contain 0).

### Bits and Pieces:

Although count sort is generally used for sorting integers, it could be used to sort other input items (floats, strings) so long as you can uniquely map them to an index in the numCounts array.