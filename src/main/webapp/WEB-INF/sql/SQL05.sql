SELECT * 
FROM tbl_board b LEFT JOIN tbl_reply r ON b.bno = r.rno
ORDER BY b.bno DESC;
