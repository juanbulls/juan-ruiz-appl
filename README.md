# juan-ruiz-appl
 Juan Ruiz ecore application

## First time running the app:
 - start the docker mysql container with:
   ```
   docker run -p 3307:3306 --name mysqldb -e MYSQL_ROOT_PASSWORD=12ufagot mysql:latest
   ``` Usual port for mysql is 3306. In this cas I have change the container mysql port it to 3307 since my local machine was already running mysql.
   
## To start the app (after first time):
 - Start the docker mysql container
