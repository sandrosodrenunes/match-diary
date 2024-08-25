DROP DATABASE IF EXISTS matchdiray;
CREATE DATABASE matchdiray;


/* Criando a tabela de times */
CREATE TABLE team (
  id SERIAL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  state VARCHAR(2) NOT NUll CHECK (state IN ('AC', 'AL', 'AP', 'AM', 'BA', 'CE', 'DF', 'ES', 
  'GO', 'MA', 'MT', 'MS', 'MG', 'PA', 'PB', 'PR', 'PE', 'PI', 'RJ', 'RN', 'RS', 'RO', 'RR', 'SC', 'SP', 'SE', 'TO')),
  photo_url VARCHAR(1024) not NULL,
  UNIQUE(name, state)
);

/* Criando a tabela de times */
CREATE TABLE match (
  id SERIAL PRIMARY KEY,
  date TIMESTAMP WITHOUT TIME ZONE NOT NULL,
  team_one_id INTEGER NOT NULL REFERENCES team(id) ON UPDATE CASCADE ON DELETE NO ACTION,
  score_team_one INTEGER NOT NULL,
  team_two_id INTEGER NOT NULL REFERENCES team(id) ON UPDATE CASCADE ON DELETE NO ACTION,
  score_team_two INTEGER NOT NULL,
  team_supported INTEGER NOT NULL REFERENCES team(id) ON UPDATE CASCADE ON DELETE NO ACTION,
  UNIQUE(date, team_one_id, team_two_id)
);

