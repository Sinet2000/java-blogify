CREATE TABLE
    posts (
        id SERIAL PRIMARY KEY, -- Auto-incrementing primary key
        title VARCHAR(255) NOT NULL, -- Title of the post, required
        content TEXT NOT NULL, -- Content of the post, required
        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp for creation
        updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- Timestamp for updates
    );