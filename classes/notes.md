## Classes and Objects

### Class
A blueprint/template for creating objects.
Defined using the `class` keyword.
Example: public class Dog { }

### Object / Instance
A real instance created from a class blueprint.
Created using the `new` keyword.
Example: Dog fido = new Dog("poodle", false, 4, "male");

### Constructor
A special method that runs automatically when an object is created.
Must have the exact same name as the class.
Example: public Dog(String dogBreed, int dogAge) { }

### Instance Fields
Variables declared inside a class but outside the constructor.
Each object has its own copy of these fields.
Example: String breed; int age; boolean hasOwner;

### Constructor Parameters
Values passed into the constructor when creating an object.
Used to assign values to instance fields.
Example: new Dog("poodle", false, 4, "male");

### Dot Operator
Used to access an object's instance fields from outside the class.
Example: fido.breed // returns "poodle"

### null
Default value of an object that has been declared but not built yet.
Example: Dog fido; // fido is null until new Dog() is called