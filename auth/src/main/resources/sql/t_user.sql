USE AUTH;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS T_USER;
CREATE TABLE T_USER (
  id int(11) NOT NULL AUTO_INCREMENT COMMENT 'id自增长',
  user_name varchar(50) NOT NULL COMMENT '用户名',
  login_name varchar(50) NOT NULL COMMENT '用户登录名',
  password varchar(32) NOT NULL COMMENT '用户登录密码',
  PRIMARY KEY (id),
  UNIQUE KEY id_UNIQUE (id),
  UNIQUE KEY login_name_UNIQUE (login_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
