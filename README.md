# Medicine Pharmacy API

## Introduction

This is a Medicine Pharmacy API developed using Spring Boot, Java, and MySQL. It allows you to manage medicines in a pharmacy system by providing endpoints for adding new medicines and updating existing ones.

- A SpringBoot REST API built for its [Client](https://github.com/RachamallaYeswanthReddy/Medicine-Controller.git)


## Prerequisites

Before you start using this API, make sure you have the following installed:

- Java Development Kit (JDK)
- Spring Boot
- MySQL Database
- Postman (for testing)

## Setup

1. Clone the repository:

 bash
 git clone https://github.com/RachamallaYeswanthReddy/Medicine-Controller.git
 cd Medicine-Controller
 

2. Configure the MySQL database by editing the application.properties file in the src/main/resources directory. Update the database URL, username, and password according to your MySQL setup.

3. Build and run the application:

 bash
 ./mvnw spring-boot:run
 

 The API will be accessible at http://localhost:8080.

## API Endpoints

### Add Medicine

- **Endpoint:** POST /medicines
- **Request Body:**
json
{
"medicineId": 1,
"medicineName": "Sample Medicine",
"price": 10.99,
"quantity": 100,
"description": "Sample description"
}

- **Response:** Returns "true" if the medicine is successfully added, otherwise false.

![image](https://github.com/RachamallaYeswanthReddy/Medicine-Controller/assets/91588050/149094ca-88ed-4a39-8fe0-92095284676d)


### Update Medicine

- **Endpoint:** PUT /medicines/{medicineId}
- **Request Body:**
json
{
"medicineId": 1,
"medicineName": "Updated Medicine",
"price": 15.99,
"quantity": 50,
"description": "Updated description"
}

- **Response:** Returns the updated Medicine object.


![image](https://github.com/RachamallaYeswanthReddy/Medicine-Controller/assets/91588050/37e746ee-7584-432d-81ca-5197207fb85b)

## Usage

You can use Postman or any other API testing tool to interact with the endpoints.

1. Open Postman.

2. Create a new collection and add new request.

3. Set the request method (POST or PUT), URL (e.g., http://localhost:8080/medicines), and add the request body as described above.

4. Send the request to test the API.

### Follow the steps below

- Clone this repository
- Create a MySql database with the name medicine 
- You can create the database with any name you like. Make sure to update the datasource url in application.properties 
- If your datasource username and password are not the defaults username(root) and password(" ") , then update their values inapplication.properties 
- Run the code given in the textfile mysql in the MYSQL Workbench
  ![image](https://github.com/RachamallaYeswanthReddy/Medicine-Controller/assets/91588050/fbe1c208-8aa9-4a45-92fa-653444c39a40)


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.


Please make sure to update your repository link in the clone URL and any other specific details in the README according to your project's requirements.
