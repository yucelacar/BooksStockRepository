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

INSERT INTO writers VALUES (1, 'Dostoyevski'); 
INSERT INTO writers VALUES (2, 'Tolstoy');
INSERT INTO writers VALUES (3, 'Goncarov');
INSERT INTO books (id,book_name,writer_id,category_name,edition_year,publisher) VALUES (1,'Yer altından notlar','1','Klasik','2017','Is Bankasi');
INSERT INTO books (id,book_name,writer_id,category_name,edition_year,publisher) VALUES (2,'Savas ve Baris','2','Klasik','2014','Can');