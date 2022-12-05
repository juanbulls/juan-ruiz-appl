CREATE TABLE `ecore`.`role` (
  `roleid` INT NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`roleid`));

INSERT INTO `ecore`.`role` (`role`) VALUES ('Developer');
INSERT INTO `ecore`.`role` (`role`) VALUES ('Product Owner');
INSERT INTO `ecore`.`role` (`role`) VALUES ('Tester');
