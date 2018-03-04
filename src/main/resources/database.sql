-- Table basic_fields:
CREATE TABLE basic_fields (
  ITEM_ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  ITEM_ARTICLE VARCHAR(55),
  ITEM_NAME VARCHAR(55),
  ITEM_CREATE_DATE DATE NOT NULL,
  ITEM_UPDATE_DATE DATE NOT NULL,
  ITEM_PRICE DOUBLE,
  ITEM_QUANTITY DOUBLE,
  ITEM_QUANTITY_MEASURE INT NOT NULL,
  ITEM_DESCRIPTION VARCHAR(255),
  ITEM_TEMPLATE_ID INT
)
  ENGINE = InnoDB;

-- Insert data:
INSERT INTO basic_fields VALUES (5, 'SKU1488', 'Mein Kampf', '12.04.2017', '12.04.2017', 14.88, 1, 1, 'best book in the world', 2 );