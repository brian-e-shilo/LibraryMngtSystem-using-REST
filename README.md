# Library Management System using REST

**Problem Statement: Library Management System**

The objective is to develop a Library Management System with RESTful web services to handle book information. The system should support the following operations:

**i) Create a Web Method to Receive Book Information**

- **Operation**: Create a RESTful web method to receive book details such as ISBN number, title, price, and publisher from a client through a form element.
- **Input**: Book information (ISBN number, title, price, publisher) in JSON format.
- **Endpoint**: POST /books

**ii) Store the Information in a Database**

- **Operation**: Store the received book information in a database.
- **Database**: Use a relational database (e.g., MySQL, PostgreSQL) to store the book details.
- **Persistence**: Utilize Java Persistence API (JPA) or JDBC to interact with the database.

**iii) Retrieve a Specific Book's Information**

- **Operation**: Create a method to retrieve book details from the database where the title is "Advanced Server Side Programming."
- **Input**: Book title ("Advanced Server Side Programming").
- **Output**: Book information (ISBN number, title, price, publisher) in JSON format.
- **Endpoint**: GET /books/title/{title}

**iv) Create a Java REST Client to Consume the Web Services**

- **Operation**: Develop a Java client application to consume the RESTful web services and handle the book information in JSON format.
- **Client Operations**:
  - Send a POST request to add book information.
  - Send a GET request to retrieve book information based on the title.
- **Libraries**: Use libraries such as Jersey Client or Apache HttpClient to create the REST client.

**Introduction to RESTful Web Services in Java**

REST (Representational State Transfer) is an architectural style for designing networked applications. It relies on a stateless, client-server, cacheable communication protocol -- the HTTP. RESTful applications use HTTP requests to perform CRUD (Create, Read, Update, Delete) operations on resources, which can be represented as JSON or XML.

In Java, RESTful web services can be developed using JAX-RS (Java API for RESTful Web Services), which provides a set of APIs to create RESTful web services. Frameworks like Jersey or Spring Boot are often used to implement JAX-RS applications, making it easier to build and deploy REST services.

**Summary**

This Library Management System demonstrates the creation and consumption of RESTful web services in Java. The system will:

1. **Receive Book Information**: Accept book details from the client.
1. **Store in Database**: Persist the book information in a relational database.
1. **Retrieve Specific Book**: Fetch details of a book with a specific title from the database.
1. **Java REST Client**: Develop a client to interact with the web services, ensuring seamless data exchange in JSON format.

By implementing this system, you will gain hands-on experience with RESTful web services, database interaction, and client-server communication in a Java environment.

I have attached the complete pdf, which is also the same file that I had submitted as an assignment for my college earlier this year. It illustrates everything in detail.

Hope you find it helpful!


