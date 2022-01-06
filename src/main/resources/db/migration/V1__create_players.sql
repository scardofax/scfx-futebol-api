CREATE TABLE t_players (
  id INT AUTO_INCREMENT NOT NULL,
  name VARCHAR(255) NULL,
  position VARCHAR(255) NULL,
  level INT NULL,
  speed VARCHAR(255) NULL,
  monthly BIT(1) NULL,
  active BIT(1) NULL,
  CONSTRAINT pk_t_players PRIMARY KEY (id)
);

CREATE TABLE t_type_expense_income (
  id INT AUTO_INCREMENT NOT NULL,
  entry_type VARCHAR(255) NULL,
  name VARCHAR(255) NULL,
  CONSTRAINT pk_t_type_expense_income PRIMARY KEY (id)
);

CREATE TABLE t_entrys (
  id INT AUTO_INCREMENT NOT NULL,
  date datetime NULL,
  player_id INT NULL,
  type_expense_income_id INT NULL,
  value FLOAT NULL,
  is_paid BIT(1) NULL,
  CONSTRAINT pk_t_entrys PRIMARY KEY (id)
);

ALTER TABLE t_entrys ADD CONSTRAINT FK_T_ENTRYS_ON_PLAYER FOREIGN KEY (player_id) REFERENCES t_players (id);

ALTER TABLE t_entrys ADD CONSTRAINT FK_T_ENTRYS_ON_TYPEEXPENSEINCOME FOREIGN KEY (type_expense_income_id) REFERENCES t_type_expense_income (id);