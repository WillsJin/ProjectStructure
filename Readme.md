表结构:
CREATE TABLE PUBLIC.user
(
    user_id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    user_key VARCHAR(255) DEFAULT '' NOT NULL,
    group_id INT DEFAULT 0 NOT NULL,
    user_name VARCHAR(255) DEFAULT '' NOT NULL,
    user_type INT DEFAULT 0 NOT NULL,
    last_name VARCHAR(255) DEFAULT '' NOT NULL,
    first_name VARCHAR(255) DEFAULT '' NOT NULL,
    birthday VARCHAR(255) DEFAULT '' NOT NULL,
    email VARCHAR(255) DEFAULT '' NOT NULL,
    mobile_phone VARCHAR(255) DEFAULT '' NOT NULL,
    office_phone VARCHAR(255) DEFAULT '' NOT NULL,
    office_address VARCHAR(255) DEFAULT '' NOT NULL,
    update_time TIMESTAMP NOT NULL
);

