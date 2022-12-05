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
 
## Ecore - Tempo - Coding Challenge
The API have a lot of methods, but to the especific challenge requirementes:
 - "Create new role" use the Roles POST method
 - "Assign a rol to a team member" use the Memberships POST method
 - "Look up a role for a membership" use the Membership GET method indicating the id
 - "Look up memberships for a role" 

## Api Documentation
This api have 2 endpoints: roles and memberships
### Roles methods:
In order to create new roles (first requirment of the application), post method can be used. Additionally methods where added.
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
### Memberships methods:
In order to assign a new rol to a member, the post mehtod below can be used (this is the second requirement of the application).
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
