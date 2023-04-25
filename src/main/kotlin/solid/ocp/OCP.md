Open/Closed principle
----------------------

According to this principle, A software artifact should be open for extension but closed for modification.
The artifact we use in this example are Kotlin classes.

Any modular decomposition technique must satisfy the Open-Closed Principle. Modules should be both open and closed.
Both these terms are contradictory.

A module is said to be open if it is still available for extension.
For example, it should be possible to expand its set of operations or add fields to its data structures.

A module is said to be closed if it is available for use by other modules. 
This assumes that the module has been given a well-defined, stable description (its interface in the sense of information hiding). 
At the implementation level, closure for a module also implies that you may compile it, perhaps store it in a library, and make it available for others (its clients) to use.

In a stable and working application, once we create a class and other parts of our application start using it, 
any further change in the class can cause the working application to break. 
If we require new functionalities, instead of changing the existing class, we can extend it to adopt the new requirements.

What is the benefit? Since we do not change the old code, our existing functionalities continue to work without any problems,
and we can avoid testing them again. Instead, we test the 'extended' functionalities only.

But inheritance induces tight coupling. To remove this problem, we can use abstract base classes that uses protocols instead of a superclass to allow different 
implementations. These protocols are closed for modification, and they provide another level of abstraction that enables loose coupling.
This is polymorphic OCP.

Check the program 
----------------
OCP1.kt


