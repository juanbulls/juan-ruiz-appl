# juan-ruiz-appl
 Juan Ruiz ecore application

### Prerequisites 
 - Install docker version 4

## Install Application:
 - Get Mysql for docker containers:
  ```
  docker pull mysql
  ```
 - start the docker mysql container:
   ```
   docker run -p 3307:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=12ufagot mysql:latest
   ``` 
   Usual port for mysql is 3306. In this cas I have change the container port to 3307 since my local machine was already running mysql. You might leav it like this, but if you want to change it, change it also in the application.properties so the application reads that port.
   
   
## To start the app (after first time):
 - Start the docker mysql container
