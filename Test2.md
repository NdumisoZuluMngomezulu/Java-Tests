OOP, Design & Unit Testing

Duration: 3 hours
Total Marks: 100
Instructions:

Answer all questions
Write clearly and justify your decisions
Follow clean code principles
Assume Java unless stated otherwise
🟢 SECTION A: Greenfield Design (25 marks)
Scenario

You are building a Library Management System from scratch.

The system should:

Allow users to borrow and return books
Support different types of users (Student, Librarian)
Track book availability
Prevent borrowing if no copies are available
Question A1 (10 marks)

Design the core system:

Identify at least 5 classes
Define their responsibilities
Explain how they interact

👉 Expected format:

Class: Book
Responsibilities:
- Store book details
- Track availability

Class: User
Responsibilities:
- Borrow books
- Return books
...
Question A2 (15 marks)

Explain your design decisions:

Why did you choose your class structure?
Where did you apply encapsulation?
Where could inheritance be used and why?
🟡 SECTION B: UML & Class Diagrams (20 marks)
Question B1 (10 marks)

Draw a UML Class Diagram for your system including:

Classes
Attributes
Methods
Relationships:
Inheritance
Association
Composition (if any)

👉 You can draw on paper or describe textually like:

User
- name: String
- id: int
+ borrowBook()

Student extends User
Librarian extends User

Book
- title: String
- availableCopies: int
Question B2 (10 marks)

Explain:

One inheritance relationship
One association
One encapsulation example
🔵 SECTION C: OOP Implementation (25 marks)
Question C1 (15 marks)

Implement the following in Java:

class Book {
    private String title;
    private int availableCopies;

    // TODO:
    // constructor
    // getters
    // borrowBook()
    // returnBook()
}

Requirements:

Cannot borrow if copies = 0
Must maintain encapsulation
Use proper access modifiers
Question C2 (10 marks)

Create a base class:

class User {
    protected String name;

    public void borrow(Book book) {
        // TODO
    }
}

Then:

Create Student and Librarian classes
Use inheritance
Override at least one method
🟣 SECTION D: Long Questions (15 marks)
Question D1 (8 marks)

Explain the difference between:

Encapsulation vs Inheritance
Give real examples from your system
Question D2 (7 marks)

What problems can occur if:

You don’t use encapsulation?
You expose all attributes as public?

Give practical consequences.

🔴 SECTION E: Unit Testing (15 marks)
Question E1 (10 marks)

Write JUnit tests for the Book class:

Test cases:

Borrow book successfully
Cannot borrow when copies = 0
Returning a book increases copies

👉 Example structure:

@Test
void testBorrowSuccess() {
    Book book = new Book("Java", 2);
    boolean result = book.borrowBook();
    assertTrue(result);
}
Question E2 (5 marks)

Explain:

Why unit testing is important
What makes a good test case
