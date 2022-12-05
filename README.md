# juan-ruiz-appl

### Prerequisites 
 - Docker version 4
 - Gradle

## To start the app
 - Start the mysql docker container and initial db schema with compose:
   ```
   docker-compose up
   ``` 
 - In other terminal, run the gradle application:
 ```
 gradlew bootRun
 ```
 
## Api Documentation
This api have 2 endpoints: roles and memberships
 - Roles methods:
```http
GET localhost:8080/api/roles
```
```http
POST localhost:8080/api/roles
```
Body:
```javascript
{
  "role" : string
}
```
```http
GET localhost:8080/api/roles/{id}
```
```http
PUT localhost:8080/api/roles/{id}
```
Body:
```javascript
{
  "role" : string
}
```