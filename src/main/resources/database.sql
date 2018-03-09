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

-- Insert data:
INSERT INTO basic_fields VALUES (1, 'SKU1488', 'Mein Kampf', '12.04.2017', '12.04.2017', 14.88, 1, 1, 'best book in the world', 2 );
INSERT INTO basic_fields VALUES (2, 'SKU2018', '1984', '12.04.2017', '12.04.2017', 19.84, 1, 1, 'orwell my dear', 2 );
INSERT INTO basic_fields VALUES (3, 'no shit', 'Neznaika na lune', '12.04.2017', '12.04.2017', 20.10, 1, 1, 'little bastard', 2 );
INSERT INTO basic_fields VALUES (4, 'LSDUZ', 'Russian Corrution', '12.04.2017', '12.04.2017', 100000000.88, 1, 1, 'stolen', 2 );
INSERT INTO basic_fields VALUES (5, 'BurnMotherfuckerBurn', 'Bloodhound Gang', '12.04.2017', '12.04.2017', 1.00, 1, 1, 'un tiss, un tiss', 2 );