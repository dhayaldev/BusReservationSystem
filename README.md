# BusReservationSystem
A Java console-based Bus Reservation System with txt storage, preloaded with 25 buses, supporting booking, cancellation, and file persistence.

# Bus Reservation System (Java)
# Introduction

The Bus Reservation System is a Java console-based application that allows users to book and cancel tickets, while administrators can add buses with password protection. It demonstrates the use of OOP concepts, file handling, and collections in Java. The system also supports data persistence using text files.

# Features

> Admin password protection for adding buses

> Add, view, and manage buses

> Book tickets with automatic seat allocation

> Cancel tickets easily

> Save and load data using text files

# Project Structure

Main.java – Entry point of the program (menu-driven system)

Bus.java – Defines the bus object with attributes and methods

BusReservationManager.java – Handles bus list, booking, and cancellations

buses.txt – Stores bus data (25 buses preloaded)

# Sample Execution
=== BUS RESERVATION SYSTEM ===
1. Add Bus (Admin only)
2. Show All Buses
3. Book Ticket
4. Cancel Ticket
5. Save & Exit
Enter choice: 1
Enter Admin Password: CodeWithAbdulSaleem
Enter Bus Number: BUS026
Enter Capacity: 40
Bus added successfully!

=== BUS RESERVATION SYSTEM ===
1. Add Bus (Admin only)
2. Show All Buses
3. Book Ticket
4. Cancel Ticket
5. Save & Exit
Enter choice: 2
Bus No: BUS001 | Capacity: 40 | Booked: 12 | Available seats : 28 | AC : With AC
Bus No: BUS002 | Capacity: 35 | Booked: 34 | Available seats : 1 | AC : Without AC
Bus No: BUS003 | Capacity: 40 | Booked: 25 | Available seats : 15 | AC : With AC
Bus No: BUS004 | Capacity: 40 | Booked: 23 | Available seats : 17 | AC : With AC
Bus No: BUS005 | Capacity: 30 | Booked: 26 | Available seats : 4 | AC : Without AC
Bus No: BUS006 | Capacity: 40 | Booked: 38 | Available seats : 2 | AC : With AC
Bus No: BUS007 | Capacity: 25 | Booked: 20 | Available seats : 5 | AC : Without AC
Bus No: BUS008 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC
Bus No: BUS009 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC
Bus No: BUS010 | Capacity: 38 | Booked: 0 | Available seats : 38 | AC : Without AC
Bus No: BUS011 | Capacity: 42 | Booked: 0 | Available seats : 42 | AC : Without AC
Bus No: BUS012 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC
Bus No: BUS013 | Capacity: 36 | Booked: 0 | Available seats : 36 | AC : Without AC
Bus No: BUS014 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC
Bus No: BUS015 | Capacity: 28 | Booked: 0 | Available seats : 28 | AC : Without AC
Bus No: BUS016 | Capacity: 33 | Booked: 0 | Available seats : 33 | AC : Without AC
Bus No: BUS017 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC
Bus No: BUS018 | Capacity: 39 | Booked: 0 | Available seats : 39 | AC : Without AC
Bus No: BUS019 | Capacity: 30 | Booked: 0 | Available seats : 30 | AC : Without AC
Bus No: BUS020 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC
Bus No: BUS021 | Capacity: 35 | Booked: 0 | Available seats : 35 | AC : Without AC
Bus No: BUS022 | Capacity: 35 | Booked: 0 | Available seats : 35 | AC : Without AC
Bus No: BUS023 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC
Bus No: BUS024 | Capacity: 32 | Booked: 0 | Available seats : 32 | AC : Without AC
Bus No: BUS025 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC
Bus No: BUS026 | Capacity: 40 | Booked: 0 | Available seats : 40 | AC : With AC

=== BUS RESERVATION SYSTEM ===
1. Add Bus (Admin only)
2. Show All Buses
3. Book Ticket
4. Cancel Ticket
5. Save & Exit
Enter choice: 3
Enter Passenger Name: Abdul Saleem A
Enter Bus Number: BUS026
Ticked is Booked Sucessfully.
----------------------------
Passenger: Abdul Saleem A
Bus No:    BUS026
Capacity:   40
Seat No: 1
AC: With AC
----------------------------

=== BUS RESERVATION SYSTEM ===
1. Add Bus (Admin only)
2. Show All Buses
3. Book Ticket
4. Cancel Ticket
5. Save & Exit
Enter choice: 4
Enter Bus Number: BUS004
Ticket is Cancelled Sucessfully.

=== BUS RESERVATION SYSTEM ===
1. Add Bus (Admin only)
2. Show All Buses
3. Book Ticket
4. Cancel Ticket
5. Save & Exit
Enter choice: 5 
Data saved.

# Technologies Used
Java (Core, Collections, OOP)
File Handling (TXT/CSV)
Scanner Class for user input
How to Run
Clone or download the project files.
Open terminal/command prompt and navigate to the project folder.

# Compile and run:
javac *.java
java Main

# Author

Aswin Dhayal S