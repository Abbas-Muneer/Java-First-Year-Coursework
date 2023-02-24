# Java-First-Year-Coursework
This is an assignment in first year which I did for my Software Development Module at IIT Sri Lanka. This was done using JAVA using Object Oriented Programming Principles

The Coursework Specifications are shown below:

Cruise Ship Boarding 
You are to write a boarding system for a Cruise ship in java. The system will print a menu 
with which the user will interact to assign passengers to each cabin of a cruise ship. 
Task 1. Arrays solution. Design a program for a Cruise Ship with twelve cabins using code like the 
code provided near the end of your notes. Start by checking that the code works.
Once the basic code runs, put the code for‘Views All cabins’ and ‘Adds customer to cabin’, into 
separate procedures, and test it works. You can build up your test cases as you develop your 
program (see testing below).
Then add a menu system which will allow the user to choose what they want to select. Enter an ‘A’ 
to add a customer to a cabin, and a ‘V’ to view all cabins. Implement each as a method. When an ‘A’ 
is pressed, it should do the Add method; a ‘V’ should do the View method.
One by one, add extra methodsto do each of the following. The user should be able to choose from 
the menu what the program does. 
 E: Display Empty cabins
 D: Delete customer from cabin
 F: Find cabin from customer name 
 S: Store program data into file 
 L: Load program data from file
 O: View passengersOrdered alphabetically by name. (Implement your own sort algorithm)
Task 2. Classes solution. Create a second version of the Cruise Ship program using an array of 
Cabin objects. Create a class called Cabin and another class called Passenger. Each cabin should hold 
up to 3 passengers with the following additional information. 
i. First Name.
ii. Surname.
iii. Expenses. 
Add an additional option to the menu. ‘T’ that will give the user the option to print the expenses per 
passenger as well as the total expenses of all passengers.Otherwise, the program should function as
in Task 1.
Task 3. Add Queue. Add a waiting list to your Cruise Ship class version. 
Modify your ‘A: Add’ and ‘D: Delete’ as follows:
• When you press ‘A’ to add a new customer, the customer should be added to the Waiting 
List queue if the Cruise Ship is full.
• When you press ‘D’ to delete a customerfrom a cabin, the next customer in the Waiting List 
queue should be automatically placed in the cabin. 
Extra marks will be awarded if you implement the waiting list queue as a circular queue.
Task 4. Testing. Create a table of test cases showing how you tested your program (see below
for example). Write a brief (no more than one page) discussion of how you chose your test cases to 
ensure that your tests cover all aspects of your program. Additionally, write a few paragraphs(up to 
1 page) explaining which of the solutions (Array or Class) you think is better and why. Think about 
which is easier to read/understand, which is easier to modify if necessary, and any other comments 
you can think of.
