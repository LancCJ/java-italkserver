/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : cjservices

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2016-10-31 15:54:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for menu
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
  PRIMARY KEY (`F_ModuleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------

-- ----------------------------
-- Table structure for service
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
-- Records of service
-- ----------------------------
INSERT INTO `service` VALUES ('1', 'system/time.json', 'com.lanccj.services.SystemServices', 'getCurrentTime', '获取接口系统时间，用于时间同步', '/services/getCurrentTime', '2016-10-18 10:24:13', 'LancCJ', '2016-10-18 10:24:23', 'LancCJ');
INSERT INTO `service` VALUES ('2', 'user/login.json', 'com.lanccj.services.UserServices', 'login', 'APP用户登录', '/services/user/login.json', '2016-10-31 13:33:36', 'LancCJ', '2016-10-31 13:33:54', 'LancCJ');

-- ----------------------------
-- Table structure for state
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state` (
  `STATE_ID` int(11) NOT NULL,
  `STATE_MSG` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`STATE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of state
-- ----------------------------
INSERT INTO `state` VALUES ('-1', '服务器内部错误');
INSERT INTO `state` VALUES ('1', '返回成功');
INSERT INTO `state` VALUES ('2', '响应失败');
INSERT INTO `state` VALUES ('3', '用户登录成功');
INSERT INTO `state` VALUES ('4', '该用户不存在');
INSERT INTO `state` VALUES ('5', '登录用户信息错误');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `USER_PWD` varchar(255) DEFAULT NULL,
  `USER_NICK` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'lanccj', '123456', 'LancCJ');
