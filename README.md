# SpringBootRESTApp


Simple REST Service that shows stores and it's products

### Prerequisites

```
MongoDB - MongoDB 4.2.6 Community Server 
```

```
Maven
```

```
Spring
```

```
Java 11
```

```
PostMan
```

### Installing

Install MongoDB using the link below
```
https://docs.mongodb.com/manual/installation/
```

Install Java/Spring/Maven using the link below
```
https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html
```

## Deployment
Before Deployment, populate at least one entity in the DB

db.product.insertOne(
   { productName : "chicken", price : 10, descShrt : "Chicken Breast", descLong : "Organic Air Chilled Boneless Skinless Chicken Breast"}
)

## Run the Application

mvn spring-boot:run


