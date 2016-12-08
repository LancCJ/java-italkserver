-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: localhost    Database: italkserver
-- ------------------------------------------------------
-- Server version	5.7.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service` (
  `SERVICE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `SERVICE_NAME` varchar(255) DEFAULT NULL,
  `SERVICE_CLASS` varchar(255) DEFAULT NULL,
  `SERVICE_METHOD` varchar(255) DEFAULT NULL,
  `SERVICE_DESC` varchar(255) DEFAULT NULL,
  `SERVICE_URL` varchar(255) DEFAULT NULL COMMENT '接口服务请求URL',
  `SERVICE_CREATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '接口创建时间',
  `SERVICE_CREATER` varchar(255) DEFAULT NULL COMMENT '创建者',
  `SERVICE_APPROVAL_TIME` datetime DEFAULT NULL COMMENT '接口审批时间',
  `SERVICE_APPROVER` varchar(255) DEFAULT NULL COMMENT '审批人',
  PRIMARY KEY (`SERVICE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
INSERT INTO `service` VALUES (1,'system/time.json','com.lanccj.services.SystemServices','getCurrentTime','获取接口系统时间，用于时间同步','/services/getCurrentTime','2016-10-18 10:24:13','LancCJ','2016-10-18 10:24:23','LancCJ'),(2,'user/login.json','com.lanccj.services.UserServices','login','APP用户登录','/services/user/login.json','2016-10-31 13:33:36','LancCJ','2016-10-31 13:33:54','LancCJ');
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-08 11:46:53
