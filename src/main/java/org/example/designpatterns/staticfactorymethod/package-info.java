package org.example.designpatterns.staticfactorymethod;
/***
 * Static factory methods provide a number of benefits over traditional constructors in Java. Here are some reasons why you might want to use static factory methods:
 *
 * 1.    More descriptive method names: Unlike constructors, static factory methods can have descriptive names that indicate the purpose of the method. This can make the code more readable and easier to understand.
 *
 * 2.    Control over object creation: With static factory methods, you can control how and when objects are created, which can help enforce business rules, caching, or optimization strategies. For example, you can cache frequently used objects and return them from the factory method rather than creating new instances every time.
 *
 * 3.    Encapsulation and abstraction: Static factory methods can help encapsulate complex object creation logic and abstract it away from the client code. This can simplify the client code and make it easier to change the implementation of the factory method without affecting the client.
 *
 * 4.    Flexibility: Static factory methods can return different types(subtype) of objects based on the input parameters, which can provide more flexibility in the types of objects that can be created. This can be useful in scenarios where you need to create objects that implement a specific interface or inherit from a specific class, or where you need to return different types of objects based on certain conditions.
 *
 * Overall, static factory methods provide more control, flexibility, and abstraction over object creation compared to traditional constructors, which can make your code more maintainable, testable, and extensible.
 */

/****EXAMPLE for point 4 above
 * public class PersonFactory {
 *     public static Person createPerson(String name, int age) {
 *         if (age < 18) {
 *             return new Child(name, age);
 *         } else {
 *             return new Adult(name, age);
 *         }
 *     }
 * }
 *
 * public class Child extends Person {
 *     public Child(String name, int age) {
 *         super(name, age);
 *     }
 *
 *     // Additional methods and properties specific to Child objects
 * }
 *
 * public class Adult extends Person {
 *     public Adult(String name, int age) {
 *         super(name, age);
 *     }
 *
 *     // Additional methods and properties specific to Adult objects
 * }
 */