insert into Ficha (id, dtCadastro, observacao, status) values (1, NOW(), 'Observando meus animais de estimação', true);
insert into Ficha (id, dtCadastro, observacao, status) values (2, NOW(), 'Observando as formigas da minha casa', true);

insert into Animal (id, nome, idFicha) values (1, 'Marco', 1);
insert into Animal (id, nome, idFicha) values (2, 'Megue', 1);
insert into Animal (id, nome, idFicha) values (3, 'Formigas', 2);
