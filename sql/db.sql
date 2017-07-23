DROP DATABASE IF EXISTS db_ssm;
CREATE DATABASE db_ssm;

DROP TABLE IF EXISTS db_ssm.demo;
CREATE TABLE db_ssm.demo (
  id INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'PK',
  name VARCHAR(255) COMMENT '姓名'
)
  COMMENT 'demo 表';

INSERT INTO db_ssm.demo VALUES (NULL ,'name......');

SELECT *
FROM db_ssm.demo;