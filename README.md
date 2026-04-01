# Java-Tests
You are required to build a Smart Home Device Management System.

The system must support multiple types of devices and allow a home to manage them.

This challenge is designed to test your understanding of:

Encapsulation
Inheritance
Polymorphism
Composition
Unit Testing (JUnit)
🚨 Rules
Do NOT modify the test file
Your solution must compile and pass all tests
Follow clean OOP principles
No hardcoding to satisfy tests
📁 Project Structure
src/
 └── main/java/
      └── za/co/wethinkcode/smarthome/
           Device.java
           Light.java
           Thermostat.java
           SmartHome.java

src/
 └── test/java/
      └── za/co/wethinkcode/smarthome/
           SmartHomeTest.java
🧩 Requirements
1. Device (Encapsulation)

Create a class Device with:

Fields
String name
boolean isOn

Methods
void turnOn()
void turnOff()
String getStatus()
Expected Behavior
Devices are OFF by default

getStatus() returns:

<name> is ON

or

<name> is OFF
2. Light (Inheritance)

Create class Light that extends Device.

Fields
String name
int brightness
Methods
Rules
Default brightness = 0

getStatus() must return:

<name> Light is ON at brightness <value>
3. Thermostat (Inheritance)

Create class Thermostat that extends Device.

Fields
double temperature
Methods
Constructor: Thermostat(String name)
void setTemperature(double temperature)
double getTemperature()
Rules
Default temperature = 20.0
Override

getStatus() must return:

<name> Thermostat is ON at <value>°C
4. SmartHome (Composition)

Create class SmartHome.

Fields
A collection of Device objects
Methods
void addDevice(Device device)
List<Device> getDevices()
String getAllStatuses()
Expected Behavior
getAllStatuses() returns all device statuses separated by newline (\n)
No trailing newline
