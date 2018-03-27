/*
Navicat MySQL Data Transfer

Source Server         : MyFirst
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : order

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2018-03-26 19:23:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `Client_Id` varchar(20) NOT NULL DEFAULT '' COMMENT '客户编号',
  `Client_Name` varchar(25) NOT NULL DEFAULT '' COMMENT '客户名称',
  `Client_Rank` varchar(2) NOT NULL DEFAULT '' COMMENT '客户级别',
  `default1` varchar(255) DEFAULT NULL,
  `default2` varchar(255) DEFAULT NULL,
  `default3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Client_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='客户表';

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO `client` VALUES ('01', 'A/X', 'B', null, null, null);
INSERT INTO `client` VALUES ('02', 'Andrew Marc', 'B', null, null, null);
INSERT INTO `client` VALUES ('03', 'ANF', 'B', null, null, null);
INSERT INTO `client` VALUES ('04', 'BCBG', 'B', null, null, null);
INSERT INTO `client` VALUES ('05', 'BEBE', 'B', null, null, null);
INSERT INTO `client` VALUES ('06', 'Chaus', 'B', null, null, null);
INSERT INTO `client` VALUES ('07', 'CK (梭织）', 'B', null, null, null);
INSERT INTO `client` VALUES ('08', 'CK dress(圆机)', 'B', null, null, null);
INSERT INTO `client` VALUES ('09', 'COAST', 'A', null, null, null);
INSERT INTO `client` VALUES ('10', 'comma', 'B', null, null, null);
INSERT INTO `client` VALUES ('11', 'DAVID LAWRENCE', 'A', null, null, null);
INSERT INTO `client` VALUES ('12', 'DEBENHAMS', 'B', null, null, null);
INSERT INTO `client` VALUES ('14', 'ESPRIT圆机', 'B', null, null, null);
INSERT INTO `client` VALUES ('15', 'FP', 'B', null, null, null);
INSERT INTO `client` VALUES ('16', 'French connection', 'B', null, null, null);
INSERT INTO `client` VALUES ('17', 'G2000', 'B', null, null, null);
INSERT INTO `client` VALUES ('18', 'GIII-Karl Lagerfeld', 'B', null, null, null);
INSERT INTO `client` VALUES ('19', 'GUESS ', 'B', null, null, null);
INSERT INTO `client` VALUES ('20', 'GUESS（Marciano）', 'A', null, null, null);
INSERT INTO `client` VALUES ('21', 'GUESS圆机', 'B', null, null, null);
INSERT INTO `client` VALUES ('22', 'IT', 'B', null, null, null);
INSERT INTO `client` VALUES ('23', 'JNBY', 'B', null, null, null);
INSERT INTO `client` VALUES ('24', 'JOIE', 'B', null, null, null);
INSERT INTO `client` VALUES ('25', 'LK Bennett', 'A+', null, null, null);
INSERT INTO `client` VALUES ('26', 'Lilly Pulitzer', 'B', null, null, null);
INSERT INTO `client` VALUES ('27', 'LONG TALL SALLY', 'B', null, null, null);
INSERT INTO `client` VALUES ('28', 'M&S', 'B', null, null, null);
INSERT INTO `client` VALUES ('29', 'MEXX', 'B', null, null, null);
INSERT INTO `client` VALUES ('30', 'MINT （锦图）', 'B', null, null, null);
INSERT INTO `client` VALUES ('31', 'Mint elvet', 'B', null, null, null);
INSERT INTO `client` VALUES ('33', 'NEXT', 'B', null, null, null);
INSERT INTO `client` VALUES ('34', 'oasis', 'B', null, null, null);
INSERT INTO `client` VALUES ('35', 'QVC', 'B', null, null, null);
INSERT INTO `client` VALUES ('36', 'TED BAKER', 'A', null, null, null);
INSERT INTO `client` VALUES ('37', 'TOMMY', 'B', null, null, null);
INSERT INTO `client` VALUES ('38', 'TORY BURCH', 'A+', null, null, null);
INSERT INTO `client` VALUES ('39', 'WHBM', 'B', null, null, null);
INSERT INTO `client` VALUES ('40', 'WOOL STREET', 'B', null, null, null);
INSERT INTO `client` VALUES ('41', '艾格', 'B', null, null, null);
INSERT INTO `client` VALUES ('42', '尚岑-OCH', 'B', null, null, null);
INSERT INTO `client` VALUES ('43', 'LAGENCE', 'B', null, null, null);
INSERT INTO `client` VALUES ('44', 'EQUIPMENT', 'A', null, null, null);
INSERT INTO `client` VALUES ('45', 'MONSOON', 'B', null, null, null);
INSERT INTO `client` VALUES ('46', 'P.8', 'B', null, null, null);
INSERT INTO `client` VALUES ('47', 'MATALAN', 'B', null, null, null);
INSERT INTO `client` VALUES ('48', '内销', 'B', null, null, null);
INSERT INTO `client` VALUES ('49', '素构', 'B', null, null, null);
INSERT INTO `client` VALUES ('50', 'JV', 'B', null, null, null);
INSERT INTO `client` VALUES ('51', 'SD', 'B', null, null, null);
INSERT INTO `client` VALUES ('52', 'COL   TED BAKER', 'A+', null, null, null);
INSERT INTO `client` VALUES ('53', 'TOAST', 'B', null, null, null);
INSERT INTO `client` VALUES ('54', '素构', 'B', null, null, null);
INSERT INTO `client` VALUES ('55', 'Phase Eight', 'B', null, null, null);
INSERT INTO `client` VALUES ('56', '森所', 'B', null, null, null);
INSERT INTO `client` VALUES ('57', 'TWO by VC', 'B', null, null, null);
INSERT INTO `client` VALUES ('58', 'VINCE  CAMUTO', 'B', null, null, null);
INSERT INTO `client` VALUES ('59', 'TALK HEAVEN', 'B', null, null, null);
INSERT INTO `client` VALUES ('60', '迪斯尼', 'B', null, null, null);
INSERT INTO `client` VALUES ('61', 'GMXY', 'B', null, null, null);
INSERT INTO `client` VALUES ('62', 'CECE S WEar', 'B', null, null, null);

-- ----------------------------
-- Table structure for detailed
-- ----------------------------
DROP TABLE IF EXISTS `detailed`;
CREATE TABLE `detailed` (
  `Style_Detailed` varchar(25) NOT NULL DEFAULT '' COMMENT '款式细分',
  `Style` varchar(25) NOT NULL DEFAULT '' COMMENT '款式',
  `default1` varchar(255) DEFAULT NULL,
  `default2` varchar(255) DEFAULT NULL,
  `default3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Style_Detailed`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='款式细分表';

-- ----------------------------
-- Records of detailed
-- ----------------------------
INSERT INTO `detailed` VALUES ('半裙', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('半裙上衣      ', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('背心', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('背心(前片有里)', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('背心(无里布)', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('背心/连衣裙', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('背心（有里布）', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('背心连体短裤', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('背心裙', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('长半裙', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('长衬衣', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('长裤', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('长裙', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('衬衫', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('衬衫+背心', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('衬衣', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('衬衣+背心', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('衬衣（长袖）', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('大衣', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('吊带', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('吊带背心', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('吊带裙', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('吊带衫', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('短裤', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('短裙', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('对条短衫', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('风衣', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('花边衫', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('裤子', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('连衣短裤（有珠片）', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裤', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙(长袖)', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙(吊带衫)', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙(蕾丝)', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙(梭织)', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙（肥婆）', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙（肥婆码）', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙（小姐码）', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙（针织）', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣裙（珠片）', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('连衣三角裤', '连衣裙', null, null, null);
INSERT INTO `detailed` VALUES ('棉衣', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('抹胸裙', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('女袖上衣（梭织）', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('皮裙', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('裙子', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('裙子（半裙）', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('上衣', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('上衣+内胆', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('外套', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('无领衫', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('西装', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('西装短裤', '下衣', null, null, null);
INSERT INTO `detailed` VALUES ('小背心', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('小西装', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('胸杯', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('胸衣', '上衣', null, null, null);
INSERT INTO `detailed` VALUES ('压褶衫', '上衣', null, null, null);

-- ----------------------------
-- Table structure for dress
-- ----------------------------
DROP TABLE IF EXISTS `dress`;
CREATE TABLE `dress` (
  `Dress_Id` varchar(25) NOT NULL DEFAULT '' COMMENT '款号',
  `Style_Detailed` varchar(25) NOT NULL DEFAULT '' COMMENT '款式细分',
  `Client_Id` varchar(25) NOT NULL COMMENT '客户编号',
  `Team_Name` varchar(25) NOT NULL DEFAULT '' COMMENT '生产班组',
  `Online` date NOT NULL DEFAULT '0000-00-00' COMMENT '上线时间',
  `Offline` date NOT NULL DEFAULT '0000-00-00' COMMENT '下线时间',
  `default1` varchar(255) DEFAULT NULL,
  `default2` varchar(255) DEFAULT NULL,
  `default3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Dress_Id`),
  KEY `Style_Detailed` (`Style_Detailed`),
  KEY `Team_Name` (`Team_Name`),
  CONSTRAINT `dress_ibfk_1` FOREIGN KEY (`Style_Detailed`) REFERENCES `detailed` (`Style_Detailed`),
  CONSTRAINT `dress_ibfk_2` FOREIGN KEY (`Team_Name`) REFERENCES `team` (`Team_Name`),
  CONSTRAINT `dress_ibfk_3` FOREIGN KEY (`Dress_Id`) REFERENCES `client` (`Client_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='服装表';

-- ----------------------------
-- Records of dress
-- ----------------------------

-- ----------------------------
-- Table structure for factory
-- ----------------------------
DROP TABLE IF EXISTS `factory`;
CREATE TABLE `factory` (
  `Factory_Id` varchar(10) NOT NULL DEFAULT '' COMMENT '工厂编号',
  `Factory_Name` varchar(25) NOT NULL DEFAULT '' COMMENT '工厂名称',
  `Factory_TeamCount` smallint(6) NOT NULL DEFAULT '0' COMMENT '生产班组组数',
  `Default1` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `Default2` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `Default3` varchar(255) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`Factory_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='工厂表';

-- ----------------------------
-- Records of factory
-- ----------------------------
INSERT INTO `factory` VALUES ('01', '杭丝', '12', null, null, null);
INSERT INTO `factory` VALUES ('02', '西装', '12', null, null, null);
INSERT INTO `factory` VALUES ('03', '锦业', '12', null, null, null);
INSERT INTO `factory` VALUES ('04', '锦图园机', '12', null, null, null);
INSERT INTO `factory` VALUES ('05', '杭丝精品一厂', '12', null, null, null);
INSERT INTO `factory` VALUES ('06', '杭丝精品二厂', '12', null, null, null);
INSERT INTO `factory` VALUES ('07', '锦业精品', '12', null, null, null);
INSERT INTO `factory` VALUES ('08', '业务十部', '12', null, null, null);
INSERT INTO `factory` VALUES ('09', '合肥杭丝', '12', null, null, null);
INSERT INTO `factory` VALUES ('10', '园机', '12', null, null, null);

-- ----------------------------
-- Table structure for model
-- ----------------------------
DROP TABLE IF EXISTS `model`;
CREATE TABLE `model` (
  `Client_Name` varchar(255) NOT NULL COMMENT '客户',
  `Client_Rank` varchar(2) NOT NULL COMMENT '级别',
  `Dress_Id` varchar(25) NOT NULL COMMENT '款号',
  `Style` varchar(25) NOT NULL COMMENT '款式',
  `Style_Detailed` varchar(25) NOT NULL COMMENT '款式(细分)',
  `Quantity` int(10) NOT NULL COMMENT '生产数量（件）',
  `IE_Price` double(10,2) NOT NULL COMMENT 'IE工价（元）',
  `Factory_Director` double(10,3) NOT NULL COMMENT '厂长确认系数（补贴系数）',
  `Client_Director` double(10,3) NOT NULL COMMENT '客户系数',
  `Structure_Director` double(10,3) NOT NULL COMMENT '数量结构系数',
  `coefficient` double(10,2) NOT NULL COMMENT '加系数工价（元）',
  `Team_Name` varchar(25) NOT NULL COMMENT '生产班组',
  `Team_Number` double(10,1) NOT NULL COMMENT '小组人数',
  `Online` date NOT NULL COMMENT '上线时间',
  `Offline` date NOT NULL COMMENT '下线时间',
  `Days` double(10,1) NOT NULL COMMENT '生产天数',
  `Per_daily` double(10,1) NOT NULL COMMENT '实际人均日产量（件）',
  `Average_daily` double(10,1) NOT NULL COMMENT '实际平均日产量（件）',
  `Add_analyze_daily` double(10,1) NOT NULL COMMENT '加系数分析日产量（件）',
  `Analytical_daily` double(10,1) NOT NULL COMMENT '分析日产量（件）',
  `Parsing_time` double(10,1) NOT NULL COMMENT '分析时间（秒）',
  `Plus_analysis_time` int(11) NOT NULL COMMENT '加系数分析时间（秒）',
  `Video_time` double(10,1) NOT NULL COMMENT '视频时间（秒）',
  `Time_consuming` int(11) NOT NULL COMMENT '实际每款耗时（秒）',
  `Coefficient_reality` double(19,9) NOT NULL COMMENT '加系数实际产量达成率',
  `Unincreased_yield` double(15,5) NOT NULL COMMENT '未加系数产量达成率',
  `Coefficient_target` double(16,6) NOT NULL COMMENT '加系数产量目标达成率',
  `No_coefficient_analysis` int(11) NOT NULL COMMENT '各款未加系数分析总时间（秒）',
  `Additive_coefficient_ analysis` int(11) NOT NULL COMMENT '各款加系数分析总时间（秒）',
  `Actual_production_time` int(11) NOT NULL COMMENT '各款实际生产总时间（秒）',
  `Time_completion_rate` double(10,3) NOT NULL COMMENT '时间达成率',
  `Total_wages` double(10,2) NOT NULL COMMENT '合计工资',
  `Average _salary` double(10,2) NOT NULL COMMENT '平均工资（天/人）'
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of model
-- ----------------------------

-- ----------------------------
-- Table structure for ordercoefficient
-- ----------------------------
DROP TABLE IF EXISTS `ordercoefficient`;
CREATE TABLE `ordercoefficient` (
  `Dress_Id` varchar(25) NOT NULL DEFAULT '' COMMENT '款号',
  `Online` date NOT NULL DEFAULT '0000-00-00' COMMENT '上线时间',
  `Coefficient_reality` double(19,9) NOT NULL DEFAULT '0.000000000' COMMENT '加系数实际产量达成率',
  `Unincreased_yield` double(15,5) NOT NULL DEFAULT '0.00000' COMMENT '未加系数产量达成率',
  `Coefficient_target` double(16,6) NOT NULL DEFAULT '0.000000' COMMENT '加系数产量目标达成率',
  `default1` varchar(255) DEFAULT NULL,
  `default2` varchar(255) DEFAULT NULL,
  `default3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Dress_Id`,`Online`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='基础表2(系数达成率)';

-- ----------------------------
-- Records of ordercoefficient
-- ----------------------------

-- ----------------------------
-- Table structure for orderinfo
-- ----------------------------
DROP TABLE IF EXISTS `orderinfo`;
CREATE TABLE `orderinfo` (
  `Dress_Id` varchar(25) NOT NULL DEFAULT '' COMMENT '款号',
  `Online` date NOT NULL DEFAULT '0000-00-00' COMMENT '上线时间',
  `Quality` int(11) NOT NULL DEFAULT '0' COMMENT '生产数量',
  `IE_Price` double(10,2) NOT NULL DEFAULT '0.00' COMMENT 'IE工价',
  `Factory_Director` double(10,3) NOT NULL DEFAULT '0.000' COMMENT '厂长确认系数',
  `Client_Director` double(10,3) NOT NULL DEFAULT '0.000' COMMENT '客户系数',
  `Structure_Director` double(10,3) NOT NULL DEFAULT '0.000' COMMENT '数量结构系数',
  `Team_Number` double(10,1) NOT NULL DEFAULT '0.0' COMMENT '小组人数',
  `Offline` date NOT NULL,
  `Days` double(10,1) NOT NULL DEFAULT '0.0' COMMENT '生产天数',
  `Parsing_time` double(10,1) NOT NULL DEFAULT '0.0' COMMENT '分析时间',
  `Video_time` double(10,1) NOT NULL DEFAULT '0.0' COMMENT '视频时间',
  `Remarks` varchar(255) DEFAULT NULL COMMENT '备注',
  `default1` varchar(255) DEFAULT NULL,
  `default2` varchar(255) DEFAULT NULL,
  `default3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Dress_Id`,`Online`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='基础数据1（蓝色数据）';

-- ----------------------------
-- Records of orderinfo
-- ----------------------------

-- ----------------------------
-- Table structure for orderworker
-- ----------------------------
DROP TABLE IF EXISTS `orderworker`;
CREATE TABLE `orderworker` (
  `Dress_Id` varchar(25) NOT NULL DEFAULT '' COMMENT '款号',
  `Online` date NOT NULL DEFAULT '0000-00-00' COMMENT '上线时间',
  `Per_daily` double(10,1) NOT NULL DEFAULT '0.0' COMMENT '人均日产量',
  `Coefficient` double(10,2) NOT NULL COMMENT '加系数工价',
  `Average_daily` double(10,1) NOT NULL DEFAULT '0.0' COMMENT '平均日产量',
  `Add_analyze_daily` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '加系数分析日产量',
  `Analytical_daily` double(10,1) NOT NULL DEFAULT '0.0' COMMENT '分析日产量',
  `Plus_analysis_time` int(11) NOT NULL DEFAULT '0' COMMENT '加系数分析时间',
  `Time_consuming` int(11) NOT NULL DEFAULT '0' COMMENT '实际每款耗时',
  `No_coefficient_analysis` int(11) NOT NULL DEFAULT '0' COMMENT '各款未加系数分析总时间',
  `Additive_coefficient_analysis` int(11) NOT NULL DEFAULT '0' COMMENT '各款加系数分析总时间',
  `Actual_production_time` int(11) NOT NULL DEFAULT '0' COMMENT '各款实际生产总时间',
  `Time_completion_rate` double(10,3) NOT NULL DEFAULT '0.000' COMMENT '时间达成率',
  `Total_wages` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '合计工资',
  `Average_salary` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '平均工资',
  `default1` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `default2` varchar(255) DEFAULT NULL COMMENT '预留字段',
  `default3` varchar(255) DEFAULT NULL COMMENT '预留字段',
  PRIMARY KEY (`Dress_Id`,`Online`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='基础表3(白色计算数据)';

-- ----------------------------
-- Records of orderworker
-- ----------------------------

-- ----------------------------
-- Table structure for team
-- ----------------------------
DROP TABLE IF EXISTS `team`;
CREATE TABLE `team` (
  `Team_Name` varchar(25) NOT NULL DEFAULT '' COMMENT '生产班组小组名称',
  `Team_FactoryId` varchar(10) NOT NULL DEFAULT '0' COMMENT '所在工厂编号',
  `Team_Number` smallint(6) NOT NULL DEFAULT '0' COMMENT '生产班组人数',
  `default1` varchar(255) DEFAULT NULL,
  `default2` varchar(255) DEFAULT NULL,
  `default3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Team_Name`),
  KEY `Team_FactoryId` (`Team_FactoryId`),
  CONSTRAINT `team_ibfk_1` FOREIGN KEY (`Team_FactoryId`) REFERENCES `factory` (`Factory_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='生产班组表';

-- ----------------------------
-- Records of team
-- ----------------------------
INSERT INTO `team` VALUES ('HFHS10组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS1组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS2组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS3组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS4组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS5组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS6组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS7组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS8组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HFHS9组', '10', '0', null, null, null);
INSERT INTO `team` VALUES ('HS10组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS11组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS12组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS1组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS2组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS3组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS4组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS5组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS6组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS7组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS8组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HS9组', '01', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP1组', '06', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP1组（二）', '07', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP2组', '06', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP2组（二）', '07', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP3组', '06', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP3组（二）', '07', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP4组', '06', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP4组（二）', '07', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP5组', '06', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP5组（二）', '07', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP6组', '06', '0', null, null, null);
INSERT INTO `team` VALUES ('HSJP6组（二）', '07', '0', null, null, null);
INSERT INTO `team` VALUES ('JTYJ1组', '05', '0', null, null, null);
INSERT INTO `team` VALUES ('JTYJ2组', '05', '0', null, null, null);
INSERT INTO `team` VALUES ('JTYJ3组', '05', '0', null, null, null);
INSERT INTO `team` VALUES ('JTYJ4组', '05', '0', null, null, null);
INSERT INTO `team` VALUES ('JTYJ5组', '05', '0', null, null, null);
INSERT INTO `team` VALUES ('JY10组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY11组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY12组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY13组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY14组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY1组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY2组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY3组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY4组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY5组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY6组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY7组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY8组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JY9组', '03', '0', null, null, null);
INSERT INTO `team` VALUES ('JYJP1组', '08', '0', null, null, null);
INSERT INTO `team` VALUES ('JYJP2组', '08', '0', null, null, null);
INSERT INTO `team` VALUES ('JYJP3组', '08', '0', null, null, null);
INSERT INTO `team` VALUES ('JYJP4组', '08', '0', null, null, null);
INSERT INTO `team` VALUES ('JYJP5组', '08', '0', null, null, null);
INSERT INTO `team` VALUES ('JYJP6组', '08', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ10组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ11组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ12组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ1组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ2组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ3组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ4组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ5组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ6组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ7组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ8组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('XZ9组', '02', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ10组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ11组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ12组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ13组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ1组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ2组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ3组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ4组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ5组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ6组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ7组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ8组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YJ9组', '04', '0', null, null, null);
INSERT INTO `team` VALUES ('YWSB1组', '09', '0', null, null, null);
INSERT INTO `team` VALUES ('YWSB2组', '09', '0', null, null, null);
INSERT INTO `team` VALUES ('YWSB3组', '09', '0', null, null, null);
INSERT INTO `team` VALUES ('YWSB4组', '09', '0', null, null, null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `User_Id` varchar(10) NOT NULL DEFAULT '' COMMENT '账号',
  `User_Grade` tinyint(3) NOT NULL COMMENT '权限等级',
  `Passsword` varchar(16) NOT NULL DEFAULT '' COMMENT '密码',
  `Time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '注册时间',
  `User_Name` varchar(10) DEFAULT NULL COMMENT '昵称',
  `User_Status` varchar(10) NOT NULL DEFAULT '' COMMENT '登录状态',
  `default1` varchar(255) DEFAULT NULL,
  `default2` varchar(255) DEFAULT NULL,
  `default3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`User_Id`),
  KEY `User_Grade` (`User_Grade`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`User_Grade`) REFERENCES `usertype` (`Grade`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='用户信息表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2018101001', '1', '101001', '0000-00-00 00:00:00', '管理员', '', null, null, null);

-- ----------------------------
-- Table structure for usertype
-- ----------------------------
DROP TABLE IF EXISTS `usertype`;
CREATE TABLE `usertype` (
  `Grade` tinyint(3) NOT NULL DEFAULT '0' COMMENT '权限等级',
  `Classify` varchar(10) NOT NULL DEFAULT '' COMMENT '权限分类',
  `default1` varchar(255) DEFAULT NULL,
  `default2` varchar(255) DEFAULT NULL,
  `default3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Grade`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk COMMENT='用户表';

-- ----------------------------
-- Records of usertype
-- ----------------------------
INSERT INTO `usertype` VALUES ('1', '管理员', '', '', null);
INSERT INTO `usertype` VALUES ('2', '分析员', '', '', null);
INSERT INTO `usertype` VALUES ('3', '查看员', '', '', null);
