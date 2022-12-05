# juan-ruiz-appl
 Juan Ruiz ecore application

### Prerequisites 
 - Docker version 4
 - Gradle

## Install Application:
 - start the mysql docker container:
   ```
   docker run -p 3307:3306 --name=mysqldb --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=ecore" mysql
   ``` 
   Usual port for mysql is 3306. In this cas I have change the container port to 3307 since my local machine was already running mysql. You might leav it like this, but if you want to change it, change it also in the application.properties so the application reads that port.

 - Create the basic tables:
 ```
CREATE TABLE `ecore`.`role` (
  `roleid` INT NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`roleid`));

INSERT INTO `ecore`.`role` (`role`) VALUES ('Developer');
INSERT INTO `ecore`.`role` (`role`) VALUES ('Product Owner');
INSERT INTO `ecore`.`role` (`role`) VALUES ('Tester');
 ```
   
## To start the app (after first time):
 - Start the docker mysql container if is not running already
 - Run the gradle application
 ```
 gradlew bootRun
 ```

