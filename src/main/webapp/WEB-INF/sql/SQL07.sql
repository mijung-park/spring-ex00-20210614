DESC tbl_board;

CREATE TABLE tbl_board_file (
	id INT PRIMARY KEY AUTO_INCREMENT,
	bno INT REFERENCES tbl_board(bno),
	fileName VARCHAR(200) NOT NULL
);

DESC tbl_board_file;