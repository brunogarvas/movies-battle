insert into USERS(username,password,enabled,nome,pontos) values ('tarantino','$2a$10$8b0cssSwTlzkgiZv9y1XDO0lysh2h6qMzrl1WcZ.Irke6S/QFgT9i',true,'Quentin Tarantino',0.0);
insert into USERS(username,password,enabled,nome,pontos) values ('spielberg','$2a$10$8b0cssSwTlzkgiZv9y1XDO0lysh2h6qMzrl1WcZ.Irke6S/QFgT9i',true,'Steven Spielberg',0.0);
insert into USERS(username,password,enabled,nome,pontos) values ('chaplin','$2a$10$8b0cssSwTlzkgiZv9y1XDO0lysh2h6qMzrl1WcZ.Irke6S/QFgT9i',true,'Charlie Chaplin',0.0);
insert into USERS(username,password,enabled,nome,pontos) values ('moura','$2a$10$8b0cssSwTlzkgiZv9y1XDO0lysh2h6qMzrl1WcZ.Irke6S/QFgT9i',true,'Wagner Moura',0.0);

insert into AUTHORITIES(username,authority) values ('moura','USER');
insert into AUTHORITIES(username,authority) values ('tarantino','USER');
insert into AUTHORITIES(username,authority) values ('spielberg','USER');
insert into AUTHORITIES(username,authority) values ('chaplin','ADMIN');

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Cassino Royale','Martin Campbell','Ação',160,2006,'Daniel Craig; Eva Green; Mads Mikkelsen; Judi Dench; Jeffrey Wright; Giancarlo Giannini; Caterina Murino','Armado com uma licença para matar, o agente secreto James Bond parte em sua primeira missão como 007, e deve derrotar o banqueiro de alguns terroristas em um jogo de pôquer de alto risco em Casino Royale; mas as coisas não são o que parecem.', 
'https://m.media-amazon.com/images/M/MV5BMDI5ZWJhOWItYTlhOC00YWNhLTlkNzctNDU5YTI1M2E1MWZhXkEyXkFqcGdeQXVyNTIzOTk5ODM@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt0381061',8.0,638702);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Quantum of Solace','Marc Forster','Ação',106,2008,'Daniel Craig; Olga Kurylenko; Mathieu Amalric; Judi Dench; Jeffrey Wright; Giancarlo Giannini; Gemma Arterton','James Bond mergulha em mistério ao tentar impedir que uma organização misteriosa elimine o recurso mais valioso de um país.', 
'https://m.media-amazon.com/images/M/MV5BMjZiYTUzMzktZWI5Yy00Mzk4LWFlMDgtYjRmNWU0Mzc0MzNiXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt0830515',6.6,438072);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Skyfall','Sam Mendes','Ação',143,2012,'Daniel Craig; Judi Dench; Javier Bardem; Ralph Fiennes; Naomie Harris; Ben Whishaw; Albert Finney','Seu passado persegue M, testando a lealdade de 007 a ela. O MI6 é atacado e 007 deve encontrar e destruir a fonte da ameaça, a qualquer custo.', 
'https://m.media-amazon.com/images/M/MV5BMWZiNjE2OWItMTkwNy00ZWQzLWI0NTgtMWE0NjNiYTljN2Q1XkEyXkFqcGdeQXVyNzAwMjYxMzA@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt1074638',7.8,679875);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Spectre','Sam Mendes','Ação',148,2015,'Daniel Craig; Christoph Waltz; Léa Seydoux; Ralph Fiennes; Naomie Harris; Ben Whishaw; Monica Bellucci; Dave Bautista','Uma mensagem enigmática leva ao James Bond numa misteriosa organização terrorita chamada Spectre.', 
'https://m.media-amazon.com/images/M/MV5BOWQ1MDE1NzgtNTQ4OC00ZjliLTllZDAtN2IyOTVmMTc5YjUxXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt2379713',6.8,427464);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('No Time To Die','Cary Joji Fukunaga','Ação',163,2021,'Daniel Craig; Rami Malek; Léa Seydoux; Ralph Fiennes; Lashana Lynch; Ben Whishaw; Naomie Harris; Jeffrey Wright','Bond deixou o serviço, depois de viver em paz por pouco tempo seu velho amigo Felix da CIA precisa da sua ajuda, chevando-lho pelo camino misterioso dum vilão com perigosa tecnologia.', 
'https://m.media-amazon.com/images/M/MV5BMTk3ZGM2YzQtMmYxYy00NDZjLWFmOTUtZTQwMzg0ZjA5ZjU3XkEyXkFqcGdeQXVyODk2NDQ3MTA@._V1_.jpg','https://www.imdb.com/title/tt2382320',7.3,317455);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Mission: Impossible','Brian De Palma','Ação',110,1996,'Tom Cruise; Jon Voight; Emmanuelle Béart; Jean Reno; Ving Rhames; Henry Czerny; Kristin Scott Thomas; Vanessa Redgrave','Um agente americano sob suspeita de deslealdade, deve descobrir e expor o verdadeiro espião sem a ajuda de sua organização.', 
'https://m.media-amazon.com/images/M/MV5BMTc3NjI2MjU0Nl5BMl5BanBnXkFtZTgwNDk3ODYxMTE@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt0117060',7.1,410827);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Mission: Impossible II','John Woo','Ação',123,2000,'Tom Cruise; Dougray Scott; Thandiwe Newton; Richard Roxburgh; Ving Rhames; Brendan Gleeson; John Polson; Rade Serbedzija','O agente do FMI, Ethan Hunt, é enviado a Sydney para encontrar e destruir uma doença geneticamente modificada chamada Quimera.', 
'https://m.media-amazon.com/images/M/MV5BN2RkYWVkZDQtNTMxMi00NWQ4LWE2ODctNmQzOWM2NjQzYzdlXkEyXkFqcGdeQXVyMjUzOTY1NTc@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt0120755',6.1,331763);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Mission: Impossible III','J.J. Abrams','Ação',126,2006,'Tom Cruise; Philip Seymour Hoffman; Michelle Monaghan; Billy Crudup; Simon Pegg; Ving Rhames; Jonathan Rhys Meyers; Keri Russell; Maggie Q; Laurence Fishburne','Um agente chamado Ethan Hunt confronta um traficante de armas perigoso e sádico que ameaça sua vida e a de sua noiva.', 
'https://m.media-amazon.com/images/M/MV5BOThhNTA1YjItYzk2Ny00M2Y1LWJlYWUtZDQyZDU0YmY5Y2M5XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt0317919',6.9,346875);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Mission: Impossible - Ghost Protocol','Brad Bird','Ação',132,2011,'Tom Cruise; Paula Patton; Michael Nyqvist; Jeremy Renner; Simon Pegg; Samuli Edelmann; Vladimir Mashkov; Léa Seydoux; Anil Kapoor; Josh Holloway','O FMI é fechado quando se ve implicado no bombardeio do Kremlin, fazendo que Ethan Hunt e sua nova equipe tenham que limpar o nome de sua organização.', 
'https://m.media-amazon.com/images/M/MV5BMTY4MTUxMjQ5OV5BMl5BanBnXkFtZTcwNTUyMzg5Ng@@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt1229238',7.4,477537);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Mission: Impossible - Rogue Nation','Christopher McQuarrie','Ação',131,2015,'Tom Cruise; Rebecca Ferguson; Sean Harris; Jeremy Renner; Simon Pegg; Ving Rhames; Alec Baldwin; Jingchu Zhang; Simon McBurney; Tom Hollander','Ethan e sua equipe assumem sua missão mais impossível até hoje, erradicar o Sindicato, uma organização internacional inescrupulosa comprometida em destruir o FMI.', 
'https://m.media-amazon.com/images/M/MV5BOTFmNDA3ZjMtN2Y0MC00NDYyLWFlY2UtNTQ4OTQxMmY1NmVjXkEyXkFqcGdeQXVyNTg4NDQ4NDY@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt2381249',7.4,361526);

insert into FILME(titulo,diretor,genero,duracao,ano,elenco,sinopse,url_poster,url_imdb,nota_imdb,votos_imdb) 
values ('Mission: Impossible - Fallout','Christopher McQuarrie','Ação',147,2018,'Tom Cruise; Henry Cavill; Vanessa Kirby; Rebecca Ferguson; Sean Harris; Angela Bassett; Simon Pegg; Ving Rhames; Alec Baldwin; Wes Bentley; Michelle Monaghan','Ethan Hunt e sua equipe, juntamente com alguns aliados próximos, correm contra o tempo após uma missão ter dado errado.', 
'https://m.media-amazon.com/images/M/MV5BNjRlZmM0ODktY2RjNS00ZDdjLWJhZGYtNDljNWZkMGM5MTg0XkEyXkFqcGdeQXVyNjAwMjI5MDk@._V1_FMjpg_UX1000_.jpg','https://www.imdb.com/title/tt4912910',7.7,317213);

insert into PARTIDA(username,id_filme_esquerda,id_filme_direita,status,data) values ('tarantino',1,2,'VENCIDA',sysdate);
insert into PARTIDA(username,id_filme_esquerda,id_filme_direita,status,data) values ('moura',3,1,'PERDIDA',sysdate);
insert into PARTIDA(username,id_filme_esquerda,id_filme_direita,status,data) values ('spielberg',5,11,'INICIADA',sysdate);

