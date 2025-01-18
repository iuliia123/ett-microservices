### Test task (Automation QA position)

Build an end-to-end system from request to response.
The system contains 2 microservices. 
One for processing the request and the second one to log it.
The test:
- Create MS called “service-shuffle”
- In “service-shuffle” create a POST API that gets a number from 1 to 1000.
- Create a function that gets this number and returns a shuffled array from 1 to this number without duplications of numbers. Example: for 5 – [4, 2, 1, 5, 3] Example: for 10 – [8, 5, 1, 9, 2, 6, 7, 3, 4, 10] *** Bonus: make sure this function is performant. Try to achieve O(N).***
- Create a second MS called “service-log”.
- The “service-log” should get a request object and log it (for the test – just for the console).
- "service-shuffle” should send the request to “service-log”. Make sure the URL for “service-log” should come from a configuration. *** Bonus: Make the request Async.***
- "service-shuffle” should return the result to the client.

Use:
- Spring Boot
- Java 11 min
- Maven
