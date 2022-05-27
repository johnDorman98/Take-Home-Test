# Scores

**Correctness**: 2/4

**Efficiency**: 3/4

**Style**: 3/4

**Documentation**: 0/4

---

## Positive aspects of the submission

<br/>

Your solution is almost there. With some minor tweaking, I was able to get it working, after which it worked as desired. However, in the current state without the modifications to get it working, It does not meet the task requirements, so you will need to make some minor changes to get it to work.

---

## Aspects of the submission that could be improved

<br/>

To start with, in order to get the program working, if you look at lines 2 and 3 below,
```python
       def groupAnagrams(self, strs):
      result = {}
```

The problem here, and the reason why the program wouldn't run in the first place, is indentation, which is critical in Python. For the code below to work, it would need to be identified correctly. In this case, this line would be

```python 
def groupAnagrams(self, strs):
```
You would need to fix its indentation so that lines 3 to 10 are indented after the function, which can be done by simply moving the function indentation 5 spaces to the left.
<br/>

[Here is a link on python indentation incase you need to go over it again.](https://www.geeksforgeeks.org/indentation-in-python/)

<br/>

The other issue within your code was that you forgot to give line 5 this line:
```python
x = "".join(sorted())
``` 
a parameter so it was causing a TypeError which stopped the program. [Here is a link to the sorted function](https://www.w3schools.com/python/ref_func_sorted.asp).
<br/>

As you will see, the sorted function requires a parameter to work. In order to get it working with your Python code, you can add ```i``` as the parameter for it to sort.

<br/>

Finally, as you can see from the documentation score, I gave a zero as there were no comments explaining any of the sections within your code. You could have commented explaining the purpose of the function and then commented on you calling the function passing in the list of strings.
<br/>

[Here is a link explaining comments importance and how to use them.](https://www.simplilearn.com/tutorials/python-tutorial/comments-in-python#:~:text=Comments%20in%20Python%20is%20the,line%20of%20code%20was%20written.)

---

## Overall feedback

<br/>

Once you implement the changes, I suggest this works wonderfully and I am impressed with the function that you have created. Please keep up the hard work, as I look forward to some of your future work.