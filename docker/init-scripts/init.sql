CREATE TABLE data (
    key1 INT,
    key2 VARCHAR(255),
    content VARCHAR(255) NOT NULL,
    PRIMARY KEY (key1, key2)
);

INSERT INTO data (key1, key2, content) VALUES
    (1, "aa" , "Sample Content 1" ),
    (1, "bbb", "Sample Content 1.1"),
    (2, "bb" , "Sample Content 2" ),
    (3, "ccc", "Sample Content 3" ),
    (4, "ddd", "Sample Content 4" );