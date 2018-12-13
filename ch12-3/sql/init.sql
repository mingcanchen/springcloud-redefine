
-- 创建类型
CREATE TABLE `PROPERTIES` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `KEY` TEXT DEFAULT NULL,
  `VALUE` TEXT DEFAULT NULL,
  `APPLICATION` TEXT DEFAULT NULL,
  `PROFILE` TEXT DEFAULT NULL,
  `LABLE` TEXT DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;



INSERT INTO `spring-cloud`.`properties` (`ID`, `KEY`, `VALUE`, `APPLICATION`, `PROFILE`, `LABLE`)
VALUES ('3', 'com.ming.config', 'I am the mysql configuration file from dev environment.', 'config-info', 'dev', 'master');
INSERT INTO `spring-cloud`.`properties` (`ID`, `KEY`, `VALUE`, `APPLICATION`, `PROFILE`, `LABLE`)
VALUES ('4', 'com.ming.config', 'I am the mysql configuration file from test environment.', 'config-info', 'test', 'master');
INSERT INTO `spring-cloud`.`properties` (`ID`, `KEY`, `VALUE`, `APPLICATION`, `PROFILE`, `LABLE`)
VALUES ('5', 'com.ming.config', 'I am the mysql configuration file from prod environment.', 'config-info', 'prod', 'master');












