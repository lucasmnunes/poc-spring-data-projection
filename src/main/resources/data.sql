INSERT INTO person(id, inclusion, name, cpf)
    VALUES (1, CURRENT_TIMESTAMP, 'João Silva', '55566677788');

INSERT INTO person(id, inclusion, name, cpf)
    VALUES (2, CURRENT_TIMESTAMP, 'Maria Silva', '11122233344');

INSERT INTO user(id, inclusion, active, login, password, profile, person_id)
    VALUES (1, CURRENT_TIMESTAMP, true, 'joao.silva', '123456', 'GENERAL', 1);

INSERT INTO user(id, inclusion, active, login, password, profile, person_id)
    VALUES (2, CURRENT_TIMESTAMP, true, 'maria.silva', '123456', 'ADMIN', 2);