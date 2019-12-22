CREATE TABLE IF NOT EXISTS books (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  book_name VARCHAR(255) NOT NULL,
  writer_id INT(11) NOT NULL,
  category_name VARCHAR(255) DEFAULT NULL,
  edition_year VARCHAR(4) DEFAULT NULL,
  publisher VARCHAR(255) DEFAULT NULL
);
CREATE TABLE IF NOT EXISTS writers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);