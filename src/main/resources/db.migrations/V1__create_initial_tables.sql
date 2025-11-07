CREATE TABLE tb_users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,


    created_at TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE tb_transactions (
    id BIGSERIAL PRIMARY KEY,

    value NUMERIC(19, 2) NOT NULL,
    description VARCHAR(500) NOT NULL,

    type VARCHAR(50) NOT NULL,

    category VARCHAR(255) NOT NULL,

    date TIMESTAMP WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP,

    user_id BIGINT NOT NULL,

    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
        REFERENCES tb_users(id)
        ON DELETE CASCADE
);


CREATE INDEX idx_transactions_user_id ON tb_transactions (user_id);