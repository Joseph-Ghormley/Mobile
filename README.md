# Mobile Class Hierarchy

This project demonstrates a class hierarchy for different mobile devices. It provides a base `Mobile` class and two subclasses, `Android` and `BlackBerry`, representing specific types of mobile devices.

## Mobile

The `Mobile` class represents a generic mobile device. It has the following properties:

- `manufacture`: The manufacturer of the mobile device.
- `operating_system`: The operating system installed on the device.
- `model`: The model or name of the device.
- `cost`: The cost of the device.

The `Mobile` class provides the following functionality:

- Two constructors: one that initializes all four properties (`manufacture`, `operating_system`, `model`, and `cost`), and another constructor that initializes only `manufacture` and `operating_system`.
- The `toString` method is overridden to provide a formatted string representation of the mobile device, including the manufacture, operating system, model, and cost.

## Android

The `Android` class is a subclass of `Mobile` and represents an Android-based mobile device. It inherits all the properties and functionality from the `Mobile` class.

The `Android` class provides the following additional functionality:

- Two constructors: one that initializes all four properties (`manufacture`, `operating_system`, `model`, and `cost`) by calling the corresponding constructor of the superclass, and another constructor that initializes only `manufacture` and `operating_system` by calling the corresponding constructor of the superclass.

## BlackBerry

The `BlackBerry` class is another subclass of `Mobile` and represents a BlackBerry mobile device. It also inherits all the properties and functionality from the `Mobile` class.

The `BlackBerry` class provides the following additional functionality:

- Two constructors: one that initializes all four properties (`manufacture`, `operating_system`, `model`, and `cost`) by calling the corresponding constructor of the superclass, and another constructor that initializes only `manufacture` and `operating_system` by calling the corresponding constructor of the superclass.

## Usage

To use the `Mobile`, `Android`, and `BlackBerry` classes, follow these steps:

1. Create instances of the respective classes using the appropriate constructors, providing the necessary arguments for the properties.
2. Use the `toString` method to retrieve a formatted string representation of the mobile device's information.

Example usage in the `Main` class:

```java

        Mobile mobile1 = new Mobile("Nokia", "Win8", "Lumia", 10000);
        Mobile mobile2 = new Mobile("Nokia", "Win8");

        Android android1 = new Android("Samsung","Android", "Grand", 30000 );
        Android android2 = new Android("Samsung", "Android");

        BlackBerry blackBerry1 = new BlackBerry("BlackBerry", "RIM", "Curve", 20000);
        BlackBerry blackBerry2 = new BlackBerry("BlackBerry", "RIM");

        System.out.println(mobile1);
        System.out.println(mobile2);
        System.out.println(android1);
        System.out.println(android2);
        System.out.println(blackBerry1);
        System.out.println(blackBerry2);
