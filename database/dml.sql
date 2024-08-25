/* inserindo dados na tabela de times */
INSERT INTO team (name, state, photo_url) VALUES 
('Flamengo', 'RJ', 'https://upload.wikimedia.org/wikipedia/commons/9/93/Flamengo-RJ_%28BRA%29.png'),
('Palmeiras', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/10/Palmeiras_logo.svg/2048px-Palmeiras_logo.svg.png'),
('Grêmio', 'RS', 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Gremio_logo.svg/1718px-Gremio_logo.svg.png'),
('Cruzeiro', 'MG', 'https://upload.wikimedia.org/wikipedia/commons/b/bc/Logo_Cruzeiro_1996.png'),
('Bahia', 'BA', 'https://upload.wikimedia.org/wikipedia/pt/9/90/ECBahia.png'),
('Internacional', 'RS', 'https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Escudo_do_Sport_Club_Internacional.svg/1024px-Escudo_do_Sport_Club_Internacional.svg.png'),
('Atlético Mineiro', 'MG', 'https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/Atletico_mineiro_galo.png/672px-Atletico_mineiro_galo.png'),
('Santos', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/1/15/Santos_Logo.png'),
('São Paulo', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/4/4b/S%C3%A3o_Paulo_Futebol_Clube.png'),
('Vasco', 'RJ', 'https://upload.wikimedia.org/wikipedia/pt/a/ac/CRVascodaGama.png');

/* inserindo dados na tabela de partidas */

INSERT INTO match (date, team_one_id, score_team_one, team_two_id, score_team_two, team_supported) VALUES 
(TO_DATE('01/08/2024', 'DD/MM/YYYY'), 1, 2, 2, 2, 1),
(TO_DATE('02/08/2024', 'DD/MM/YYYY'), 3, 1, 4, 1, 3),
(TO_DATE('03/08/2024', 'DD/MM/YYYY'), 5, 3, 6, 1, 5),
(TO_DATE('04/08/2024', 'DD/MM/YYYY'), 7, 0, 8, 0, 7),
(TO_DATE('05/08/2024', 'DD/MM/YYYY'), 9, 2, 10, 3, 10),
(TO_DATE('06/08/2024', 'DD/MM/YYYY'), 2, 4, 3, 2, 2),
(TO_DATE('07/08/2024', 'DD/MM/YYYY'), 4, 1, 5, 1, 5),
(TO_DATE('08/08/2024', 'DD/MM/YYYY'), 6, 0, 7, 0, 6),
(TO_DATE('09/08/2024', 'DD/MM/YYYY'), 8, 2, 9, 1, 8),
(TO_DATE('10/08/2024', 'DD/MM/YYYY'), 10, 3, 1, 2, 10);

