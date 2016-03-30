USE AUTH;
SET FOREIGN_KEY_CHECKS = 0;
DROP TABLE IF EXISTS T_ROLE_RESOURCES;
CREATE TABLE T_ROLE_RESOURCES (
  id INT NOT NULL AUTO_INCREMENT,
  role_id INT NOT NULL,
  resources_id INT NOT NULL,
  PRIMARY KEY (id),
  UNIQUE INDEX id_UNIQUE (id ASC),
  INDEX role_id_idx (role_id ASC),
  INDEX resources_id_idx (resources_id ASC),
  CONSTRAINT fk_role_resources_roleId
  FOREIGN KEY (role_id)
  REFERENCES auth.T_ROLE (ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_role_resources_resourcesId
  FOREIGN KEY (resources_id)
  REFERENCES auth.T_RESOURCES (ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
  COMMENT = '角色权限关系表';

