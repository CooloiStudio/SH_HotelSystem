/*
Navicat MySQL Data Transfer

Source Server         : localhost_3140
Source Server Version : 50710
Source Host           : localhost:3140
Source Database       : hotel

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2017-03-04 13:22:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attendance
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `staff_id` int(11) DEFAULT NULL COMMENT '员工id',
  `check_time` datetime DEFAULT NULL COMMENT '签到时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance
-- ----------------------------

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `org_id` int(11) DEFAULT NULL COMMENT '部门id',
  `par_id` int(11) DEFAULT NULL COMMENT '父部门id:0顶级部门',
  `org_name` varchar(255) DEFAULT NULL COMMENT '机构名',
  `state` int(11) DEFAULT NULL COMMENT '部门状态:1在用0停用'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `staff_id` int(11) DEFAULT NULL COMMENT '员工id',
  `org_id` int(11) DEFAULT NULL COMMENT '所属部门id',
  `state` int(11) DEFAULT NULL COMMENT '账号状态：1在用0停用'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manager
-- ----------------------------

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `gender` int(11) DEFAULT NULL COMMENT '性别:1男0女',
  `staff_name` varchar(255) DEFAULT NULL COMMENT '员工姓名',
  `staff_tel` int(11) DEFAULT NULL COMMENT '员工电话，系统登录名',
  `role` int(11) DEFAULT NULL COMMENT '账号权限:0管理员1普通员工',
  `birth` date DEFAULT NULL COMMENT '生日',
  `create_time` datetime DEFAULT NULL COMMENT '入职时间',
  `org_id` int(11) DEFAULT NULL COMMENT '员工所属部门',
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------

-- ----------------------------
-- Table structure for task
-- ----------------------------
DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '任务id',
  `start_time` datetime DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '结束时间',
  `limit_time` datetime DEFAULT NULL COMMENT '任务期限',
  `del_id` int(11) DEFAULT NULL COMMENT '处理部门',
  `state` int(11) DEFAULT NULL COMMENT '任务状态；1制定2执行0完成',
  `content` varchar(255) DEFAULT NULL COMMENT '任务描述',
  `task_type` varchar(255) DEFAULT NULL COMMENT '任务类型',
  PRIMARY KEY (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task
-- ----------------------------

-- ----------------------------
-- Table structure for task_configure
-- ----------------------------
DROP TABLE IF EXISTS `task_configure`;
CREATE TABLE `task_configure` (
  `task_type` int(11) DEFAULT NULL COMMENT '任务序号',
  `task_name` varchar(255) DEFAULT NULL COMMENT '任务名'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_configure
-- ----------------------------

-- ----------------------------
-- Table structure for task_execute
-- ----------------------------
DROP TABLE IF EXISTS `task_execute`;
CREATE TABLE `task_execute` (
  `task_id` int(11) DEFAULT NULL COMMENT '任务id',
  `return` int(11) DEFAULT '0' COMMENT '是否退回：0不退回1退回',
  `staff_id` int(11) DEFAULT NULL COMMENT '处理人id',
  `task_type` int(11) DEFAULT NULL COMMENT '任务类型',
  `content` varchar(255) DEFAULT NULL COMMENT '任务描述',
  `start_time` datetime DEFAULT NULL COMMENT '任务开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '任务结束时间',
  `limit_time` datetime DEFAULT NULL COMMENT '任务期限'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of task_execute
-- ----------------------------
