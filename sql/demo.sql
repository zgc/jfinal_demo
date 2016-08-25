CREATE TABLE tb_user (
  id       SERIAL NOT NULL PRIMARY KEY,
  name     VARCHAR(128),
  password VARCHAR(128)
);