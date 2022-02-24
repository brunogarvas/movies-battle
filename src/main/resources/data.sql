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
'','https://www.imdb.com/title/tt0381061/',8.0,638702);

