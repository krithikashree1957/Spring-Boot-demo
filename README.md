# Spring Boot Demo Application

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/krithikashree1957/Spring-Boot-demo) [![Open in Replit](https://replit.com/badge/github/krithikashree1957/Spring-Boot-demo)](https://replit.com/github/krithikashree1957/Spring-Boot-demo) <img src="https://github.com/codespaces/badge.svg" alt="Open in Codespaces" />

A beginner-friendly Spring Boot demo that shows how to build a small REST API backed by PostgreSQL, run it with Docker Compose, and debug common Spring/JPA issues.

## Table of contents

- [Demo features](#demo-features)
- [Tech stack](#tech-stack)
- [Quick start](#quick-start)
- [API examples](#api-examples)
- [Screenshots](#screenshots)
- [Notes](#notes)
- [Author](#author)

## Demo features

- `GET /api/v1/software-engineers` — fetch all records  
- `GET /api/v1/software-engineers/{id}` — fetch a record by ID  
- `POST /api/v1/software-engineers` — insert a new software engineer  
- JPA entity mapping with Hibernate  
- PostgreSQL connection using Spring Data JPA  
- Docker Compose setup for local development

## Tech stack

- Java 17  
- Spring Boot 4.1.0  
- Spring Web MVC  
- Spring Data JPA  
- Hibernate ORM  
- PostgreSQL  
- Docker Compose  
- Maven

## Quick start

1. Start PostgreSQL with Docker Compose:

```bash
docker compose up -d
```

2. Run the Spring Boot app (set timezone to UTC to avoid timezone alias issues):

```bash
# macOS / Linux
export JAVA_TOOL_OPTIONS="-Duser.timezone=UTC"
./mvnw spring-boot:run

# PowerShell (Windows)
$env:JAVA_TOOL_OPTIONS="-Duser.timezone=UTC"
.\mvnw spring-boot:run
```

3. Open the endpoints in your browser or API client.

## API examples

### Get all engineers

```http
GET http://localhost:8080/api/v1/software-engineers
```

### Get one engineer by ID

```http
GET http://localhost:8080/api/v1/software-engineers/1
```

### Insert a new engineer

```http
POST http://localhost:8080/api/v1/software-engineers
Content-Type: application/json

{
  "name": "Aaron Warner",
  "techstack": "Java, Spring Boot"
}
```

## Screenshots

Click any thumbnail to view the full-size image. Source images are in the `src/` folder.

<p align="center">
  <a href="src/1.png"><img src="src/1.png" alt="Screenshot 1" width="280" /></a>
  <a href="src/2.png"><img src="src/2.png" alt="Screenshot 2" width="280" /></a>
  <a href="src/3.png"><img src="src/3.png" alt="Screenshot 3" width="280" /></a>
</p>

<p align="center">
  <a href="src/4.png"><img src="src/4.png" alt="Screenshot 4" width="280" /></a>
  <a href="src/5.png"><img src="src/5.png" alt="Screenshot 5" width="280" /></a>
  <a href="src/6.png"><img src="src/6.png" alt="Screenshot 6" width="280" /></a>
</p>

<p align="center">
  <a href="src/7.png"><img src="src/7.png" alt="Screenshot 7" width="280" /></a>
</p>

> Tip: On GitHub the thumbnails render inline; clicking opens the raw image.

## Notes

This repository is a learning/demo version created to understand Spring Boot structure, JPA mappings, REST controllers, and connecting to PostgreSQL.

## Author

Author: `krithikashree1957`
