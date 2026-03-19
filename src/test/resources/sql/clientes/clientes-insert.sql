insert into USUARIOS (id, username, password, role) values (100, 'carlos@email.com', '$2a$12$rMnDYkJUV9uxcx/N73RE5u47uAVC4Oz7VgX0DmsCafGVRtXwSHi6O', 'ROLE_ADMIN' );
insert into USUARIOS (id, username, password, role) values (101, 'guilherme@email.com', '$2a$12$rMnDYkJUV9uxcx/N73RE5u47uAVC4Oz7VgX0DmsCafGVRtXwSHi6O', 'ROLE_CLIENTE' );
insert into USUARIOS (id, username, password, role) values (102, 'joao@email.com', '$2a$12$rMnDYkJUV9uxcx/N73RE5u47uAVC4Oz7VgX0DmsCafGVRtXwSHi6O', 'ROLE_CLIENTE' );
insert into USUARIOS (id, username, password, role) values (103, 'toby@email.com', '$2a$12$rMnDYkJUV9uxcx/N73RE5u47uAVC4Oz7VgX0DmsCafGVRtXwSHi6O', 'ROLE_CLIENTE' );


insert into CLIENTES (id, nome, cpf, id_usuario)  values (10, 'Bianca Silva', '34264709008', 101);
insert into CLIENTES (id, nome, cpf, id_usuario)  values (20, 'Roberto Gomes', '38490739048', 102);

