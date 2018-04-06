-- Table basic_fields:
DROP TABLE IF EXISTS basic_fields;
CREATE TABLE basic_fields (
  ITEM_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  ITEM_ARTICLE VARCHAR(55),
  ITEM_NAME VARCHAR(55),
  ITEM_CREATE_DATE DATETIME NOT NULL,
  ITEM_UPDATE_DATE DATETIME NOT NULL,
  ITEM_PRICE DOUBLE,
  ITEM_QUANTITY DOUBLE,
  ITEM_QUANTITY_MEASURE INT NOT NULL,
  ITEM_DESCRIPTION VARCHAR(255),
  ITEM_TEMPLATE_ID INT
)
  ENGINE = InnoDB;

-- Table templates:
DROP TABLE IF EXISTS templates;
CREATE TABLE templates (
  TEMPLATE_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  USER_ID INT,
  TEMPLATE_NAME VARCHAR(80)
)
  ENGINE = InnoDB;

-- Table user_entries:
DROP TABLE IF EXISTS user_entries;
CREATE TABLE user_entries (
  USER_ENTRY_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  USER_FIELD_ID INT NOT NULL,
  ITEM_ID INT,
  USER_ENTRY_VALUE VARCHAR(255),

  FOREIGN KEY (USER_FIELD_ID) REFERENCES user_fields (FIELD_ID)
)
  ENGINE = InnoDB;

INSERT INTO user_entries VALUES (1, 1, 5, 'Chase Lynn' );
INSERT INTO user_entries VALUES (2, 2, 5, 'Explicit Lyrics' );
INSERT INTO user_entries VALUES (3, 3, 5, 'Obscene English' );
INSERT INTO user_entries VALUES (4, 4, 5, 'TRUE' );
INSERT INTO user_entries VALUES (5, 5, 5, 'Oh shit - can you read this?' );
INSERT INTO user_entries VALUES (6, 6, 3, 'Nosov' );
INSERT INTO user_entries VALUES (7, 7, 3, 'Fiction' );
INSERT INTO user_entries VALUES (8, 8, 3, 'russian' );
INSERT INTO user_entries VALUES (9, 9, 3, 'definitely yes' );
INSERT INTO user_entries VALUES (10, 1, 4, 'Nosov' );
INSERT INTO user_entries VALUES (11, 2, 4, 'Fiction' );
INSERT INTO user_entries VALUES (12, 4, 4, 'cool as fuck' );
INSERT INTO user_entries VALUES (13, 3, 4, 'russian for babies' );



-- Table user_fields:
DROP TABLE IF EXISTS user_fields;
CREATE TABLE user_fields (
  FIELD_ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
  TEMPLATE_ID INT,
  USER_FIELD_TYPE INT,
  USER_FIELD_NAME VARCHAR(255),
  USER_FIELD_ORDER INT
)
  ENGINE = InnoDB;

-- Insert data:
INSERT INTO basic_fields VALUES (1, 'SKU1488', 'Mein Kampf', '12.04.2017', '12.04.2017', 14.88, 1, 1, 'best book in the world', 2 );
INSERT INTO basic_fields VALUES (2, 'SKU2018', '1984', '12.04.2017', '12.04.2017', 19.84, 1, 1, 'orwell my dear', 2 );
INSERT INTO basic_fields VALUES (3, 'no shit', 'Neznaika na lune', '12.04.2017', '12.04.2017', 20.10, 1, 1, 'little bastard', 2 );
INSERT INTO basic_fields VALUES (4, 'LSDUZ', 'Russian Corruption', '12.04.2017', '12.04.2017', 100000000.88, 1, 1, 'stolen', 2 );
INSERT INTO basic_fields VALUES (5, 'BurnMotherfuckerBurn', 'Bloodhound Gang', '12.04.2017', '12.04.2017', 1.00, 1, 1, 'un tiss, un tiss', 2 );

INSERT INTO templates VALUES (1, 1, 'Caps' );
INSERT INTO templates VALUES (2, 1, 'Books' );

INSERT INTO user_fields VALUES (1, 2, 1, 'Author', 1);
INSERT INTO user_fields VALUES (2, 2, 1, 'Genre', 2);
INSERT INTO user_fields VALUES (3, 2, 1, 'Language', 3);
INSERT INTO user_fields VALUES (4, 2, 2, 'is cool?', 4);
INSERT INTO user_fields VALUES (5, 2, 2, 'another book attribute', 5);
INSERT INTO user_fields VALUES (6, 2, 1, 'Author2', 1);
INSERT INTO user_fields VALUES (7, 2, 1, 'Genre2', 2);
INSERT INTO user_fields VALUES (8, 2, 1, 'Language2', 3);
INSERT INTO user_fields VALUES (9, 2, 1, 'is cool? 2', 4);