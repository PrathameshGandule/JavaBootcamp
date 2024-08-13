# JavaBootcamp

# Java Bootcamp notes

>Java features : -
- Simple
- Robust
- Portable
- Multi-threaded
- Secure
- Distributed
- High performance
- Interpeted
***

>Basic pillars of JAVA : -
- `Abstraction` : Hiding implementation, showing functionality
	- `Abstract` : class that cannot be inherited
	- `Interface` : detail hiding class
- `Encapsulation` : Wrapping code and data together
	- `getter` : to get values
	- `setter` : to set the value (constraint mentioned)
- `Inheritance` : Acquiring all properties and behaviour of parent class
	- `Single` : parent -> child
	- `Multilevel` : parent -> child (parent) -> child
	- `Multiple` : not supported (has a way to work around)
- `Polymorphism` : Doing one thing by different ways
	- `Method overloading` : function with same name different implementation(diffrent no. parameters)
	- `Method over-riding` : overriding parent class method in child class 
***

```java
class main{
	public static void main(String[] args){
		System.out.println("Hello");
	}
}
```
***
> access - modifiers

- `protected` : data upto child class
- `default` : data in it's package
- `public` : can be used by n any class
- `private` : only in it's class
***
> Constructor has same name as class name creted when object is created
*** 
## Strings
- `String`
	- immutable
	```java
	String str = "DY Patil COE";
	```
- `StringBuffer`
	- thread safety
	- mutable
	- less speed
	```java
	StringBuffer sbuffer = new StringBuffer("DYP COE");
	```
- `StringBuilder`
	- no thread safety
	- mutable
	- more speed
	```java
	StringBuilder sbuilder = new StringBuilder("DYP COE pimpri");
	```
***
## Thread
It's a lightweight process (depends on processor)
- `notifyAll` : to notify all thread
- `wait`
- `start`
- `stop`
***
## Basics
- `variables`
	- stored in program
	- simple accessed in one class
- `instance`
	- stored in heap 
	- in method outside class
- `static`
	- global variables
```java
// single line commment
/*
	Multi line
	comment
*/
```

> jvm -> stack area and heap area

> global level storage like heap have less memory and not efficient for big application
***
## Datatypes
- Primitive
	- Numeric
		- Integer
		- Floating point
	- Non-numeric
		- Character
		- Boolean
- Non-primitive
	- Classes
	- Interface
	- Arrays
***
## Typecasting
- Implicit (done by compliler)
- Explicit (done by programmer)
```
widening
byte -> short -> int -> long -> float -> double
```
```
shortening
double -> float -> long -> int -> short -> byte
```
***
## Operators
- Arithmetic
	- `+`, `-`, `*`, `/`, `%`
- Relational
	- `>`, `<`, `>=`, `<=`, `==`, `!=`
- Logical
	- `&&`, `||`, `!`
- Unary
	- `++`, `--`
- Bitwise
	- `&`, `|`, `~`,  `^`
***
## Conditional statements
```java
if(condition-1){
	//staements
}
else if(condition-2){
	//statements 2
}
else{
	//statements 3
}
```
```java
switch(variable){
	case (condition 1) :
		//statements
		break;
	case (condition 2) :
		//statements
		break;
	.
	.
	.
	default :
		//default statement
}
```
***
## Loops
- for loop used loop is definite
```java
for(initialization ; condition ; condition-updation){
	//staements
}
```
- while loop when uncertain and not want to execute if not satisfied
```java
//initialization
while(condition){
	//statements
	condition-updation
}
```
- do while loop when loop wanted to execute atleast once
```java
//initialization
do{
	//statements
	condition-updation
} while(condition);
```
***
## Collections
> Collection is group of objects
- List
	- ArrayList : DS-Array
	- Linked Lists : DS-LL
	- Vector
		- Stack
- Queue
	- Priority Queue
	- Deque
		- Array Deque
- Set
	- Hash Set
	- Liked Hash Set
	- Sorted Set
		- Tree Set
***
- ArrayList
	- array
	- Duplicates allowed
	- For searching
- LinkedList
	- linked lists
	- for addition and deletion 
- HashSet
	- hashmap
	- No duplicate
	- insertion order not maintained
- LinkedHashSet
	- hasmap + linkedlists
	- No duplicates
	- Insertion order maintained
- TreeSet
	- tree
	- No duplicates
	- maintained in sorted order
***
- Map
	- Duplicates allowed
	- key : value pair
- HashMap
	- no order mainatained
- LinkedHashMap
	- order maintained
- TreeMap
	- sorted order
***
### Garbage Collection
- Programmer doesn't need to worry about dereferencinf the memory
- applied by jvm itself
***
### this keyword
- used to refer current class instance variable
- this() can be used to invoke current class constructor
- this keyword can be used to invoke current class method (implicitly)
- this can be passed as an argument to method call
***
### super keyword
- used to refer immediate parent class instance
- super() is used to invoke immediate parent class constructor
- super is used to invoke immediate parent class method
***
### final keyword
- clearly communicates
- it can be applied on variable, methods and class
	- variable cant be changed
	- method cant be over-ridden
	- class cant be extended
- allows compiler and virtual machine to do minor optimizations
***
### Wrapper Classes
- it is used to convert any primitive datatype into objects
```java
int x = 25;
Integer y = new Integer(x);
```
***
***
***

# JAVA Day 2
### stream
- `filter` : to filter out desired elements
```java
    //num is a ArrayList with [30,40,50,60,60] int it
    //Set = no duplicates
    //List = duplicates allowed
    Set<Integer> ans = num.stream().filter(i -> i%20 == 0).collect(Collectors.toSet());
    List<Integer> ans = num.stream().filter(i -> i%20 == 0).collect(Collectors.toList());
```
- `map` : used to perform operation on all objects
```java
List<Integer> ans2 = num.stream().map(i -> i+10).collect.(Collectors.toList());
```
____________________________
## Exception Handling
- Exceptionn is a an event that occurs during the execution of a program, that disrupts the flow of program
- All exception class are subclasses of built-in class `Throwable`
    - Exception
        <!-- - ioException
        - ClassNotFoundException
        - FileNotFoundException
        - CheckException -->
        - Checked : Compile time
        - Unchecked : Runtime
    - Error
- Example
```java
try{
    int data = 50/0;
}
catch(ArithmeticException e) {
    System.out.println(e);
}
finally{    
    System.out.println("rest of code");
}
//finally block will be always executed
```
```
Output :-
java.lang.ArithmeticException: / by zero
rest of code
```
### blocks of java exception
- `try`
- `catch`
- `throws`
- `throw`
- `finally`
<hr style="border-width:3px;background-color:white"></hr>

## Applets
- they can be used to create small web application, transport websites on internet
- `init` is used instead of `main`
- any applet in java is a class that extends the java.applet.Applet
- An applet class does not have any `main()` method
- It is viewed using `JVM`, it can be used separate plug-in or separate runtime environment to run a applet application
- very less response time as it works on client side
- can be run using any browser, which has `JVM` running on it
```
applets are not used in current times 
old concept
``` 

- Application

    - draw picture on web page
    - create new window
    - play sounds
    - recieve input from user
    - make a newtwork connection to the seerver from which it came
    - send and receive data
- Life Cycle
    - init()
    - start()
    - paint(graphics g)
    - stop()
    - destroy()
<hr style="border-width:3px;background-color:white"></hr>

## AWT
- Abstract Window Toolkit used for creating GUI for any OS
- Containers
    - Window
    - Panel
    - List
    - Button
_________________________________

### Swing
- Swing provides some built-in methods that are flexible and powerful
- Faster
- LighWieight
- Less memory
- Platform Independent
- `java.swing` package

### Swing classes
- `JPanel`
- `JLevel`
- `JButton`
- `JWindow`
- `JLevel`