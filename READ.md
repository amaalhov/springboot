Instructions 

1. clone repository 

        git clone https://github.com/amaalhov/technical-assessment.git
        
2. install packages and dependencies with
        
        mvn clean install
        
3. run service with 
        
        mvn spring-boot : run
        
        mvn test /* to run test */

Send a POST request to localhost:8080/getNetPrice using either Postman or Insomnia

Example request

```json
{
    "user": {
        "type": "EMPLOYEE",
        "registerDate": "2021-06-01"
    },
    "bill": {
        "items": [
            {
                "type": "GROCERY",
                "price": 700
            },
            {
                "type": "CLOTHES",
                "price": 1800
            },
            {
                "type": "GROCERY",
                "price": 980
            }
        ]
    }
}

```
Amount to be paid:

```json
2770.00
```

CUSTOMER
```json
{
    "user": {
        "type": "CUSTOMER",
        "registerDate": "2000-06-01"
    },
    "bill": {
        "items": [
            {
                "type": "GROCERY",
                "price": 700
            },
            {
                "type": "CLOTHES",
                "price": 1800
            },
            {
                "type": "GROCERY",
                "price": 980
            }
        ]
    }
}

```
Amount to be paid:

```json
3220.00
```
AFFILIATE
```json
{
    "user": {
        "type": "AFFILIATE",
        "registerDate": "2021-06-01"
    },
    "bill": {
        "items": [
            {
                "type": "GROCERY",
                "price": 700
            },
            {
                "type": "CLOTHES",
                "price": 1800
            },
            {
                "type": "GROCERY",
                "price": 980
            }
        ]
    }
}

```
Amount to be paid:

```json
3130.00
```
