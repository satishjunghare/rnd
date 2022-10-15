## Sliding Window Maximum

You are given an array of integers <code>nums</code>, there is a sliding window of size <code>k</code> which is moving from the very left of the array to the very right. You can only see the <code>k</code> numbers in the window. Each time the sliding window moves right by one position.

<i>Return the max sliding window.</i>

### Example 1:
<pre>
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
</pre>

### Example 2:
<pre>
Input: nums = [1], k = 1
Output: [1]
</pre>

### Constraints:
<ul>
    <li>1 <= nums.length <= 105</li>
    <li>-104 <= nums[i] <= 104</li>
    <li>1 <= k <= nums.length</li>
</ul>

### Hint 1:
How about using a data structure such as deque (double-ended queue)?

### Hint 2:
The queue size need not be the same as the window’s size.

### Hint 3:
Remove redundant elements and the queue should store only elements that need to be considered.
