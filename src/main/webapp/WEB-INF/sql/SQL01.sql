CREATE DATABASE sqr1;
USE sqr1;

CREATE TABLE tb1_board (
	bno INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    content VARCHAR(2000) NOT NULL,
    writer VARCHAR(50) NOT NULL,
    regdate TIMESTAMP DEFAULT NOW(),
    updatedate TIMESTAMP DEFAULT NOW()
);

INSERT INTO tb1_board (title, content, writer)
VALUES ('테스트 제목', '테스트 내용', 'user00');

SELECT * FROM tbl_board;

-- practice table
CREATE TABLE tbl_test1 (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    age INT NOT NULL
);

SELECT * FROM tbl_test1;

INSERT INTO tbl_test1 (name, age) VALUES ('mijung', 33);
INSERT INTO tbl_test1 (name, age) VALUES ('heesoo', 33);
INSERT INTO tbl_test1 (name, age) VALUES ('taesung', 12);

-- org.zerock.domain.Test1VO (bean)
-- org.zerock.mapper.Test1Mapper (interface)
-- org.zerock.mapper.Test1Mapper.xml (xml)
-- Test1Tests
