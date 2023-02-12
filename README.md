# java-basics


## Basics

### Variables
Called also Parameters or Fields.

#### Variable - Data types:
- **Primitive** (Data types): int, float, double, boolean
- **Reference** (Data types): String

### Constructors
- **No-argument** Constructor
- **Parameterized** Constructor (with argument)

### Class Members

#### Class Members:
The components of a class, such as its instance variables or methods are called the members of a class or class members.



# OOP - Object Oriented Programming

## OOP basics

### Inheritance
Inheritance is when one class aquires properties (methods and fields) of onother class.
- **Advantages**: Reusability.
- **Example**: MySubClassB **extends** MySuperClassA

### Important points
- Subclass can have its own methods and fields in addition to Superclass's methods and fields.
- Subclass can have only one Superclass (multiple inheritance is not supported).
- Subclass cannot inherit Superclass's constructor (it can only invoke the constructor).

### Inheritance types
- **Single**: ClassB extends ClassA.
- **Multilevel**: ClassB extends ClassA, ClassC extends ClassB, so automatically ClassC is extending ClassA.
- **Hierarchical**: ClassB extends ClassA, ClassC extends ClassA.
- **Multiple**: ClassB extends ClassA implements InterfaceK (using **Interface**).

### super keyword
- Used to differentiate members of Superclass from members of Subclass (when they have the same names).
- Used to invoke the constructor of Superclass from Subclass.


## OOP - Access Modifiers

### Acces Modifiers in Java
A class member is declared with an access modifier to specify how it is accessed by the other classes in Java.
- **public**: public class member can be accessed from anywhere.
- **protected**: protected class member can be accessed by any class in the same package and any sub class outside package.
- **private**: private class member can be accessible only within the class (and cannot be accessed by any class even sub classe).
- **if we don't use any access modifier**: members can be accessed by any class in the same package.

### Use of access modifiers
- **Class**: public.
- **Attribute**: public, private, protected.
- **Method**: public, private, protected.


## OOP - Encapsulation

### Encapsulation in Java
Encapsulation is wrapping up of data under a single unit (a class) to protect data :
- By making class attributes private,
- By making class methods private.
- Using Public Setters and Getters Methods to access private attributes.

### Adavantages
- Data hiding,
- Flexibility to use variable as read only or write only,
- Reusability.


## OOP - Polymorphism

Polymorphism is the ability of an object to take many forms by Overriding and Overloading methods.

### Method Overriding
- Allows a subclass to provide a specific implementation of a method that is already provided by its superclass.
- Subclass Method should have the same name, same signature and same return type as the Superclass Method.

### Method Overloading
- Allows different methods to have the same name but different signatures (the signature can differ by the number and/or the type of input parameters).


## OOP - Abstraction
- Abstraction is used to hide details and show only essential information.

### Abstraction using Abstract class
- Abstract class provides partial abstraction.
- Abstract class cannot be directly instantiated (cannot be used to create objects).
- It can be inherited (to access it, it must be inherited from another class).
- Avoid code duplication and promote re-usability.

### Abstraction using Interface
- Interface provides complete abstraction (it groups related methods with empty bodies).
- Methods are by default abstract and public (with empty bodies).
- Attributes are public, static and final (like constants).
- Interface cannot contain constructor (we cannot create an abject from interface).
- Interface helps achieve multiple inheritance.


## Exception handling
```
try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
```
