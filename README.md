# juan-ruiz-appl
 Juan Ruiz ecore application

### Prerequisites 
 - Docker version 4
 - Gradle

## To start the app
 - Start the mysql docker container and initial db schema with compose:
   ```
   docker-compose up
   ``` 
 - In other terminal, run the gradle application
 ```
 gradlew bootRun
 ```