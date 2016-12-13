/*
 Navicat MySQL Data Transfer

 Source Server         : italkserver
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost
 Source Database       : italkserver

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : utf-8

 Date: 12/13/2016 12:58:50 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `group`
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `GROUP_ID` int(11) NOT NULL,
  `GROUP_NAME` varchar(45) DEFAULT NULL,
  `GROUP_PARENT` int(11) DEFAULT NULL,
  `GROUP_CREATER` varchar(45) DEFAULT NULL,
  `GROUP_CREATE_TIME` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`GROUP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `group`
-- ----------------------------
BEGIN;
INSERT INTO `group` VALUES ('1', '测试组1', '0', 'lanccj', null), ('2', '测试组2', '0', 'lanccj', null), ('3', '测试组3', '0', 'lanccj', null), ('4', '测试组4', '0', 'lanccj', null), ('5', '测试组5', '4', 'lanccj', null);
COMMIT;

-- ----------------------------
--  Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
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

-- ----------------------------
--  Table structure for `service`
-- ----------------------------
DROP TABLE IF EXISTS `service`;
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

-- ----------------------------
--  Records of `service`
-- ----------------------------
BEGIN;
INSERT INTO `service` VALUES ('1', 'system/time.json', 'com.lanccj.services.SystemServices', 'getCurrentTime', '获取接口系统时间，用于时间同步', '/services/getCurrentTime', '2016-10-18 10:24:13', 'LancCJ', '2016-10-18 10:24:23', 'LancCJ'), ('2', 'user/login.json', 'com.lanccj.services.UserServices', 'login', 'APP用户登录', '/services/user/login.json', '2016-10-31 13:33:36', 'LancCJ', '2016-10-31 13:33:54', 'LancCJ');
COMMIT;

-- ----------------------------
--  Table structure for `state`
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `STATE_ID` int(11) NOT NULL,
  `STATE_MSG` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`STATE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `state`
-- ----------------------------
BEGIN;
INSERT INTO `state` VALUES ('-1', '服务器内部错误'), ('0', '返回成功'), ('1', '响应失败'), ('103', '请求参数不正确请核对API文档'), ('104', '缺少用户名'), ('105', '缺少登录密码'), ('106', '用户密码不匹配');
COMMIT;

-- ----------------------------
--  Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `USER_PWD` varchar(255) DEFAULT NULL,
  `USER_NICK` varchar(255) DEFAULT NULL,
  `USER_PHONE` varchar(45) DEFAULT NULL,
  `USER_GROUP` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', 'lanccj', '123456', 'LancCJ', '18251101581', '1'), ('2', 'test1', '123456', '测试1', '12345678901', '2'), ('3', 'test2', '123456', '测试2', '12345678902', '3'), ('4', 'test3', '123456', '测试3', '12345678903', '4'), ('5', 'test4', '123456', '测试4', '12345678904', '5');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
