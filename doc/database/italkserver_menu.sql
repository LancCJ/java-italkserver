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
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `F_ModuleId` int(255) NOT NULL AUTO_INCREMENT,
  `F_ParentId` int(255) DEFAULT NULL,
  `F_EnCode` varchar(255) DEFAULT NULL,
  `F_FullName` varchar(255) DEFAULT NULL,
  `F_Icon` varchar(255) DEFAULT NULL,
  `F_UrlAddress` varchar(255) DEFAULT NULL,
  `F_Target` varchar(255) DEFAULT NULL,
  `F_IsMenu` varchar(255) DEFAULT NULL,
  `F_AllowExpand` varchar(255) DEFAULT NULL,
  `F_IsPublic` varchar(255) DEFAULT NULL,
  `F_AllowEdit` varchar(255) DEFAULT NULL,
  `F_AllowDelete` varchar(255) DEFAULT NULL,
  `F_SortCode` varchar(255) DEFAULT NULL,
  `F_DeleteMark` varchar(255) DEFAULT NULL,
  `F_EnabledMark` varchar(255) DEFAULT NULL,
  `F_Description` varchar(255) DEFAULT NULL,
  `F_CreateDate` datetime DEFAULT NULL,
  `F_CreateUserId` int(11) DEFAULT NULL,
  `F_CreateUserName` varchar(255) DEFAULT NULL,
  `F_ModifyDate` datetime DEFAULT NULL,
  `F_ModifyUserId` int(11) DEFAULT NULL,
  `F_ModifyUserName` varchar(255) DEFAULT NULL,
  `F_Test` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`F_ModuleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
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
