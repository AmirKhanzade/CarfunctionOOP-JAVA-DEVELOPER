# CarfunctionOOP-JAVA-DEVELOPER
🚗 Vehicle Inheritance Project
📌 Project Description

This Java project demonstrates object-oriented programming (OOP) concepts such as inheritance, constructors, method overriding, and the use of the super keyword through a simple vehicle hierarchy.

The project models different types of vehicles, showcasing how subclasses can extend and customize the behavior of their superclass.

🛠️ Classes Overview

Vehicle (Superclass)

Attributes: make, model, color, speed

Methods: accelerate(), breaking(), turn(), adjustSeat()

Provides the core functionality for all vehicles.

Car (Subclass of Vehicle)

Adds the attribute seatPosition and the method adjustSeat(int adjustment)

Uses a parameterized constructor that explicitly calls super() to initialize Vehicle attributes.

SportCar (Subclass of Car)

Adds the attribute turboBoost

Includes the method turbomode() to activate turbo acceleration by enhancing the speed.

Main

Demonstrates object creation and method usage.

Creates a Car and a SportCar and shows how inherited and subclass-specific methods are used.

🚀 Key Concepts Practiced

Inheritance → Car extends Vehicle, SportCar extends Car

Constructors & super() → Passing parameters from subclass to superclass

Encapsulation of attributes and behavior

Method overriding and extension (e.g., turbomode() builds on accelerate())

▶️ Example Usage

Create a Car or SportCar object

Call methods like accelerate(), breaking(), and turn()

Adjust seat position with adjustSeat()

Enable turbo mode for a sport car
