CREATE TABLE `ecore`.`role` (
  `roleid` INT NOT NULL AUTO_INCREMENT,
  `role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`roleid`),
  INDEX `ROLE` (`role` ASC) VISIBLE);

INSERT INTO `ecore`.`role` (`role`) VALUES ('Developer');
INSERT INTO `ecore`.`role` (`role`) VALUES ('Product Owner');
INSERT INTO `ecore`.`role` (`role`) VALUES ('Tester');

CREATE TABLE `ecore`.`membership` (
  `membershipid` INT NOT NULL AUTO_INCREMENT,
  `user` VARCHAR(45) NULL,
  `team` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  PRIMARY KEY (`membershipid`),
  INDEX `role_idx` (`role` ASC) VISIBLE,
  CONSTRAINT `role`
    FOREIGN KEY (`role`)
    REFERENCES `ecore`.`role` (`role`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE);