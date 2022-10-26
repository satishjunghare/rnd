## Singleton Pattern
Used when there is a need to create a single object of a class that can be shared across the application.

### Two main problems we may face while implementing the singleton pattern.
<ol>
    <li>Everytime we go to create an instance of a class, it returns the fresh new one object as default constructor calls by default.</li>
    <li>As a singleton pattern lets you access the object to be accessed from anywhere in the application.</li>
</ol>

### Solution of above problems
<ol>
    <li>Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.</li>
    <li>Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.</li>
</ol>

### When to use
<ol>
    <li>For instances that are expensive to create like single database object shared by different parts of the program.</li>
    <li>It's good practice to keep all loggers as Singletons which increses performace.</li>
    <li>Classes which provide access to configuration setting for the application.</li>
    <li>Classes that contain resources that are accessed in shared mode.</li>
    <li>Use the Singleton pattern when you need stricter control over global variables.</li>
</ol>
