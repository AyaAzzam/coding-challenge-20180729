**##Models and Resources**
the system has the following resources:

- Counter 
- Village
- ConsumptionReport 
- CounterReading that represents the callback from the electricity counters.

**##Architecture layers**
- Controllers 
- Services
- Repositories and Domain models
- Mappers for DTOs

**##technologies and frameworks**
- Spring Boot
- Java 8
- mysql for database 
- h2 in memory database (for unit & integration testing) 
- Swagger for API Documentations (**)
- Mockito for testing (**)



**##Testing strategy (**)**
- I prefer mixing between Unit and Integration testing 
- I uses BDDMockito and AssertJ to write human-readable, fluent-style tests.
- Strategy 1: MockMVC in Standalone Mode 
- Strategy 2: SpringBootTest with a HTTP Web Server via `TestRestTemplate`




**Note**: 
(**) means not included or added in this repo.