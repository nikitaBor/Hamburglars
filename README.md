# Hamburglars :hamburger: :hamburger: :hamburger:
**Nikita Borisov, Yedoh Kang, Dimitriy Leksanov** 
<br /> 
**APCS2 pd1**
<br /> 
**Lab #03 -- RUVIP?**
<br /> 
<br /> 
An implementation of priority queue to make a help desk

#### STEPS:
1. Upon creation of an instance of HelpDesk, the user will be asked if he/she needs the help desk for help.
2. If the user says no, he/she exits the program. If the user says yes, then he/she will be asked for his/her name, and a series of questions (issues) are asked.
3. After selection through a series of questions, an instance of Ticket is added to the Array Priority Queue, in the priority it was given. 
4. This can be done as many times as possible.
5. After, the Help Desk will list the entire Array Priority Queue, in the order of priority, with the name of the ticket and the solution to the issue. The higher the priority number, the faster the person's solution will be returned. If the priority is the same, the user who informed the Help Desk of his/her problem will be given a solution first.

#### DESIGN:

##### ArrayPriorityQueue:

 Method | Runtime 
 --- | --- 
 void add(e) | O(logn) 
 boolean isEmpty() | O(1)
 E peekMin() | O(1)
 E removeMin() | O(1)
 
##### Ticket:

Instance Variables:

Type | Name
--- | ---
int | priority
String | name
String | deskOp 
int | _ID
boolean | helped

Constructor:

- public Ticket (int newID, int newPriority, String newName, String newDeskOp) {}

Mutator/Accessor Methods:
- getName()
- setName(String newName)
- getDeskOp()
- setDeskOp(String newDeskOp)
- getHelped()
- setHelped(boolean b)
- setPriority(int newPriority)

Overwrote compareTo (Ticket other)

##### HelpDesk

Instance Variables:

Type | Name
--- | ---
ArrayPriorityQueue<Ticket> | _data
int | IDcount = 13
boolean | continuous = false

Constructor:
- public HelpDesk ()
- instantiates _data

Methods:

Signature | Description
--- | ---
boolean isDataEmpty() | checks if _data is empty
void continuous() | checks to see if help desk should continue or not; welcoming message
void helpSequence() | gives the user the option to choose which problem; asks for name; creates a new Ticket object with the new info, including the ID number and priority assigned, based on what the problem is; adds Ticket object to the ArrayPriorityQueue
void response() | helps users after a dequeue; responses will be in prioritized order

 
 #### EMBELLISHMENTS:
 - added an IDcount so that ID's would not overlap
 - used Scanner to read user input from the terminal
 - allowed the user to choose whether he/she wanted help from the Help Desk, because the Help Desk can be pushy at times (!)
 - instead of having the solution description as part of the Ticket object, it is just returned in one of the methods in class HelpDesk
 
 
