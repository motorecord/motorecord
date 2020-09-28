/*
 Navicat Premium Data Transfer

 Source Server         : motorecord
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : motorecord

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 28/09/2020 18:49:15
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for motorcycle
-- ----------------------------
DROP TABLE IF EXISTS `motorcycle`;
CREATE TABLE `motorcycle`  (
  `motor_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '车辆ID',
  `motor_alias` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车辆别名',
  `motor_name` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '车辆名称',
  `brand` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌',
  `displacement` int(11) NULL DEFAULT NULL COMMENT '排量（ml）',
  `enroll_date` date NULL DEFAULT NULL COMMENT '上牌日期',
  `insert_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '插入时间',
  `update_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`motor_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10002 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of motorcycle
-- ----------------------------
INSERT INTO `motorcycle` VALUES (10000, 'UU125', 'UU125T-2', '铃木', 125, '2018-09-28', '2020-09-18 17:02:37', '2020-09-18 17:02:37');
INSERT INTO `motorcycle` VALUES (10001, '190TR', 'CBF190TR', '新大洲本田', 190, '2020-06-12', '2020-09-18 17:02:34', '2020-09-18 17:02:34');

-- ----------------------------
-- Table structure for motorecord
-- ----------------------------
DROP TABLE IF EXISTS `motorecord`;
CREATE TABLE `motorecord`  (
  `record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录ID',
  `record_cost` decimal(10, 2) NULL DEFAULT NULL COMMENT '花费',
  `record_type` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `record_time` datetime(0) NULL DEFAULT NULL COMMENT '时间',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `motor_id` int(11) NULL DEFAULT NULL COMMENT '车辆ID',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `insert_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '插入时间',
  `update_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`record_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10000 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for owner
-- ----------------------------
DROP TABLE IF EXISTS `owner`;
CREATE TABLE `owner`  (
  `owner_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '车主',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `motor_id` int(11) NOT NULL COMMENT '车辆ID',
  `insert_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '插入时间',
  `update_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`owner_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10002 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of owner
-- ----------------------------
INSERT INTO `owner` VALUES (10000, 10000, 10000, '2020-09-18 17:02:14', '2020-09-18 17:02:14');
INSERT INTO `owner` VALUES (10001, 10000, 10001, '2020-09-18 17:02:11', '2020-09-18 17:02:11');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `mobile` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `insert_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '插入时间',
  `update_time` timestamp(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10001 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (10000, 'zbc', '百成', 'zbc', NULL, NULL, '2020-09-28 18:49:04', '2020-09-28 18:49:04');

SET FOREIGN_KEY_CHECKS = 1;
