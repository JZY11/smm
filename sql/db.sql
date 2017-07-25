DROP DATABASE IF EXISTS db_sc;
CREATE DATABASE db_sc;

DROP TABLE IF EXISTS db_sc.student;
CREATE TABLE db_sc.student (
  id INT AUTO_INCREMENT PRIMARY KEY
  COMMENT 'PK',
  name VARCHAR(255) COMMENT '姓名',
  gender VARCHAR(255) COMMENT '性别'
)
  COMMENT 'student 表';


DROP TABLE IF EXISTS db_sc.course;
CREATE TABLE db_sc.course(
  id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'PK',
  tittle VARCHAR(255) COMMENT '课程名',
  creadit INT COMMENT '学分'
)COMMENT 'course 表';

DROP TABLE IF EXISTS db_sc.student_course;
CREATE TABLE db_sc.student_course(
  id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'PK',
  studentId INT COMMENT '学生ID',
  courseId INT COMMENT '课程ID'
)COMMENT '选课表';

ALTER TABLE db_sc.student_course
    ADD CONSTRAINT
studentId_fk_student_course
FOREIGN KEY (studentId)
  REFERENCES db_sc.student(id);

ALTER TABLE db_sc.student_course
    ADD CONSTRAINT
courseId_fk_student_course
FOREIGN KEY (courseId)
  REFERENCES db_sc.course(id);


SELECT *
FROM db_sc.student;

SELECT *
FROM db_sc.course;

SELECT *
FROM db_sc.student_course;
