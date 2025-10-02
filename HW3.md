1. Write a Java program in ```FactorialUsingFor.java``` to calculate the factorial of a given positive number using a ```for``` loop.


2. Write a Java program in ```FactorialUsingWhile.java``` to calculate the factorial of a given positive number using a ```while``` loop.


3. Write a Java program in ```FactorialUsingDoWhile.java``` to calculate the factorial of a given positive integer using a ```do...while``` loop.


4. You calculated factorials using ```for```, ```while```, and ```do...while``` loops, now, approach the same problem with a recursive function and compare calculation time to ```for```, ```while```, and ```do...while``` loops.
- Recursive Implementation: Define a recursive function ```factorial``` in ```FactorialComparison.java``` that takes an integer ```n``` as input and returns its factorial.
- Base Case: The base case should handle the factorial of ```0```, which is ```1```.
- Recursive Case: The recursive case should calculate the factorial of ```n``` by multiplying ```n``` with the factorial of ```(n-1)```.
- Performance Comparison: Compare the execution time of the recursive implementation with iterative approaches (e.g., using ```for```, ```while```, and ```do...while``` loops) for different input values. Analyze the time complexity of both approaches.


5. Write a Java program in ```DiverseStackOperationsWithItem.java``` that performs various operations on stacks of different data types: String, Integer, Boolean, and Double.

**Create Stacks:** Initialize four separate stacks:
- ```stringStack``` to store Strings.
- ```integerStack``` to store Integers.
- ```booleanStack``` to store Booleans.
- ```doubleStack``` to store Doubles.
- ```itemStack``` to store Item objects.

**Push Operations:**
- Push the following Strings into ```stringStack```: "Hello", "World", "Java".
- Push the following Integers into ```integerStack```: 10, 20, 30.
- Push the following Booleans into ```booleanStack```: true, false, true.
- Push the following Doubles into ```doubleStack```: 1.1, 2.2, 3.3.
- Push the following Item objects into ```itemStack```: Item("Item1",100), Item("Item2", 200), Item("Item3", 300)

**Peek and Pop Operations:**
- Peek and print the top element of each stack without removing it.
- Pop and print the top element from each stack, removing it from the stack.
- Repeat the peek and pop operations until each stack is empty.

**Empty Check:** After all pop operations, check if each stack is empty and print the result (true or false).

**Output:**
```
String Stack Operations:
Peek: Java
Pop: Java
Peek: World
Pop: World
Peek: Hello
Pop: Hello

Integer Stack Operations:
Peek: 30
Pop: 30
Peek: 20
Pop: 20
Peek: 10
Pop: 10

Boolean Stack Operations:
Peek: true
Pop: true
Peek: false
Pop: false
Peek: true
Pop: true

Double Stack Operations:
Peek: 3.3
Pop: 3.3
Peek: 2.2
Pop: 2.2
Peek: 1.1
Pop: 1.1

Item Stack Operations:
Peek: Item{name='Item3', value=300}
Pop: Item{name='Item3', value=300}
Peek: Item{name='Item2', value=200}
Pop: Item{name='Item2', value=200}
Peek: Item{name='Item1', value=100}
Pop: Item{name='Item1', value=100}

Empty Stack Check:
String Stack Empty: true
Integer Stack Empty: true
Boolean Stack Empty: true
Double Stack Empty: true
Item Stack Empty: true
```
