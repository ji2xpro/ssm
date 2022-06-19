/*
 Code Guide Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : 127.0.0.1:3306
 Source Schema         : Master

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 08/01/2020 17:48:29
*/

-- DROP DATABASE IF EXISTS Master;
CREATE DATABASE IF NOT EXISTS Master DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
-- CREATE DATABASE IF NOT EXISTS Master CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_unicode_ci';

USE Master;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(225) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `age` tinyint(2) unsigned NOT NULL DEFAULT 0 COMMENT '年龄',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `createTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updateTime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` VALUES (1, '测试用户1', 'User1', 20, 'Master', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO `sys_user` VALUES (2, '测试用户2', 'User2', 22, 'Master', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO `sys_user` VALUES (3, '测试用户3', 'User3', 24, 'Master', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;