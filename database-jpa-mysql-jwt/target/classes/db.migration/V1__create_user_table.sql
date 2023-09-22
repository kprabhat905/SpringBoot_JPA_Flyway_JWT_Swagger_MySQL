CREATE TABLE IF NOT EXISTS user
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    userName VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    active   BOOLEAN NOT NULL,
    roles    VARCHAR(255) NOT NULL
);

INSERT INTO user (userName, password, active, roles)
VALUES ('user1', 'pass', true, 'ROLE_USER');
INSERT INTO user (userName, password, active, roles)
VALUES ('user2', 'pass', true, 'ROLE_ADMIN');