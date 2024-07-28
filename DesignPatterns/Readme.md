**Behavioral Design Patterns**

1. Observer Pattern
Use Case: A weather station system where multiple display devices (observers) update their display whenever the weather data changes.

2. Strategy Pattern
Use Case: A payment processing system that allows different payment methods (credit card, PayPal, etc.) to be used interchangeably.

**Creational Design Patterns**
1. Singleton Pattern
Use Case: A configuration manager that ensures only one instance of the configuration is created and used throughout the application.

2. Factory Pattern
Use Case: A shape creation system that creates different shapes (circle, square, rectangle) based on the input provided.

**Structural Design Patterns**
1. Adapter Pattern
Use Case: A system that allows different media players to play various media formats by adapting their interfaces.

2. Decorator Pattern
Use Case: A text editor that allows adding various functionalities (spell check, auto-correct) to the basic text input feature.


**Compilation and Running Using Command Line**

**Behavioral Design patterns:**

*1. Strategy Pattern:*

javac behavioral/strategy/*.java
java behavioral.strategy.Main

*2. Observer pattern:*

cd behavioral/observer
java Main

**Creational Design Patterns**

*1. Singleton Pattern*

javac creational/singleton/*.java 
java creational.singleton.Main

*2. Factory pattern*

javac creational/factory/*.java
java creational.factory.Main

**Structural Design Patterns**

*1. Adapter pattern*

javac structural/adapter/*.java
java structural.adapter.Main

*2. Decorator pattern*

javac structural/decorator/*.java
java structural.decorator.Main