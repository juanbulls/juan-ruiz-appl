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
 - "Look up memberships for a role"  use the Role-Memberships GET method

## Api Documentation
This api have 2 endpoints: roles and memberships
### Roles methods:  
**POST** and **PUT** methods require body detailed at the end.
```http
GET localhost:8080/api/roles
```
```http
POST localhost:8080/api/roles
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
**POST** and **PUT** methods require body detailed at the end.
```http
GET localhost:8080/api/memberships
```
```http
POST localhost:8080/api/memberships
```
```http
GET localhost:8080/api/memberships/{id}
```
```http
PUT localhost:8080/api/memberships/{id}
```
```http
GET localhost:8080/api/role-memberships/{role}
```
Body:
```javascript
{
    "user": "Daniel",
    "team": "Polaris",
    "role": "Tester"
}
```
