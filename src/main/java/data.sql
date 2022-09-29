INSERT INTO restaurante(id, cep, complemento, name) VALUES
(1L, '0000001', 'Complemento Endereço Restaurante 1', 'Avanade'),
(2L, '0000002', 'Complemento Endereço Restaurante 2', 'Accenture');

INSERT INTO cliente(id, cep, complemento, name) VALUES
(1L, '0000001', 'Complemento Endereço Restaurante 1', 'Avanade'),
(2L, '0000002', 'Complemento Endereço Restaurante 2', 'Accenture');

INSERT INTO produto(id, disponivel,name, valor_unitario ,restaurante_id) VALUES
(1L,true, 'X-Java', 15.0, 1L),
(2L,true, 'X-dotNet', 10.0, 2L),
(3L,true, 'X-FrontEnd', 18.0, 1L);