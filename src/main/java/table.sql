CREATE TABLE IF NOT EXISTS users(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    user_name VARCHAR(255),
    password VARCHAR(255)
)