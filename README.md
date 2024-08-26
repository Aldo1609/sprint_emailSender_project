
# Spring Boot - Email Sender


This is a simple proyect with 1 endpoint:

- /api/v1/send

## Requirements

📏 JDK 17

📏 Springboot 3.0

## Endpoints examples

```bash
    ENDPOINT /send
    Type: POST

    URI: http://localhost:8080/person

    BODY-RAW:

    {
        "toUser" : [
            "ejemplo@gmail.com",
            "ejemplo2@gmail.com"
        ],
        "subject" : "¡Hello from Springboot!",
        "message" : "¡This is a test message!"
    }
```
```bash
    ENDPOINT /send
    Type: POST

    URI: http://localhost:8080/person

    BODY-FORMDATA:

    {
        "toUser" : [
            "ejemplo@gmail.com",
            "ejemplo2@gmail.com"
        ],
        "subject" : "¡Hello from Springboot!",
        "message" : "¡This is a test message!",
        "file": Upload a png image
    }
```
