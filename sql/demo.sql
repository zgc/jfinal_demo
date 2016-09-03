DROP TABLE IF EXISTS tb_user;

CREATE TABLE tb_user (
  id       SERIAL NOT NULL PRIMARY KEY,
  name     VARCHAR(128),
  password VARCHAR(128),
  sex      INT,
  age      INT,
  address  VARCHAR(128),
  mobile   VARCHAR(32)
);