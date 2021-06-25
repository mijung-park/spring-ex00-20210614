SELECT * FROM tbl_board
ORDER BY bno DESC
LIMIT 10; -- 상위 10개

SELECT * FROM tbl_board
ORDER BY bno DESC
LIMIT 0, 5; -- 0번부터 5개 (1page)

SELECT * FROM tbl_board
ORDER BY bno DESC
LIMIT 5, 5; -- (2page)

SELECT * FROM tbl_board
ORDER BY bno DESC
LIMIT 10, 5; -- (3page)

SELECT * FROM tbl_board
ORDER BY bno DESC
LIMIT 5 * (n-1), 5; -- (n page)