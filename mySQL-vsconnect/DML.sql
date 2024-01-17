USE bd_vsconnect;

INSERT INTO tb_techs VALUES (UUID_TO_BIN(UUID()),"html"); 
INSERT INTO tb_techs VALUES (UUID_TO_BIN(UUID()),"css");

SELECT BIN_TO_UUID(id_tech), nome FROM tb_techs; 

INSERT INTO tb_usuarios VALUES (
	UUID_TO_BIN(UUID()),
    "Odirlei",
    "odilei@email.com",
    "senai",
    "Rua Niteroi, 180",
    "12312-123",
    0
); 
INSERT INTO tb_usuarios VALUES (
	UUID_TO_BIN(UUID()),
    "Alexia",
    "alexia@email.com",
    "senai",
    "Rua Niteroi, 180",
    "12312-123",
    0
); 
INSERT INTO tb_usuarios VALUES (
	UUID_TO_BIN(UUID()),
    "Jessica",
    "jessica@email.com",
    "senai",
    "Rua Niteroi, 180",
    "12312-123",
    0
); 

SELECT * FROM tb_usuarios;

SELECT BIN_TO_UUID(id_usuario), nome FROM tb_usuarios; /*mostra o is dos usuarios */
SELECT BIN_TO_UUID(id_tech), nome FROM tb_techs; /*mostra o id */

DELETE FROM tb_usuarios WHERE id_usuario = UUID_TO_BIN("7d0e6d6b-6edf-11ee-88ee-b445067b82288");

UPDATE tb_usuarios
SET tipo_usuario = 1
WHERE id_usuario = UUID_TO_BIN("892ca3b2-6ee2-11ee-88ee-b445067b8228");

INSERT INTO tb_dev_tech VALUES(UUID_TO_BIN("ec05af65-6edc-11ee-88ee-b445067b8228"),"beec248e-6ed7-11ee-88ee-b445067b8228"); /*ID ALEXIA , TECHS ALEXIA html*/
INSERT INTO tb_dev_tech VALUES(UUID_TO_BIN("ec05af65-6edc-11ee-88ee-b445067b8228"),"55670806-6ed8-11ee-88ee-b445067b8228"); /*ID ALEXIA , TECHS ALEXIA css*/

INSERT INTO tb_servicos VALUES
    (UUID_TO_BIN(UUID()), "Dashboard", "Desenvolver uma dashboard com informações importantes do nosso controle de vendas.", "3000", "Concluído", UUID_TO_BIN("892ca3b2-6ee2-11ee-88ee-b445067b8228"), NULL),/*hash*/
    (UUID_TO_BIN(UUID()), "Desenvolvimento de site institucional - Gateway de Pagamento / Fintech", "Desenvolver um site responsivo que seja utilizado como uma plataforma de apresentação do nosso gateway de pagamento. O objetivo principal deste projeto é criar um site atraente e informativo, que demonstre as funcionalidades e benefícios do nosso gateway de pagamento para potenciais clientes.", "1300", "Em andamento", UUID_TO_BIN("892ca3b2-6ee2-11ee-88ee-b445067b8228"), NULL),
    (UUID_TO_BIN(UUID()), "Preciso da estrutura de uma HomePage", "Preciso fazer uma tela somente estruturada em HTML para minha empresa.", "1000", "Pendente", UUID_TO_BIN("892ca3b2-6ee2-11ee-88ee-b445067b8228"), NULL);
    
SELECT BIN_TO_UUID(id_servico), titulo FROM tb_servicos; /*mostra os servicos ID*/  
    
INSERT INTO tb_cotacao VALUES(
	UUID_TO_BIN(UUID()),
    10000.00,
    UUID_TO_BIN("00dc4adf-6ed9-11ee-88ee-b445067b8228"),  /*id do dev*/
    UUID_TO_BIN("892ca3b2-6ee2-11ee-88ee-b445067b8228")  /*id do servico*/
);

INSERT INTO tb_tech_servico VALUES(UUID_TO_BIN("55670806-6ed8-11ee-88ee-b445067b8228"),UUID_TO_BIN("892ca9d0-6ee2-11ee-88ee-b445067b8228")); /*ID ALEXIA , TECHS ALEXIA html*/
INSERT INTO tb_tech_servico VALUES(UUID_TO_BIN("beec248e-6ed7-11ee-88ee-b445067b8228"),UUID_TO_BIN("892ca9d0-6ee2-11ee-88ee-b445067b8228")); /*ID ALEXIA , TECHS ALEXIA css*/
    