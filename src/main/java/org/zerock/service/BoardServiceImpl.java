package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

	private BoardMapper mapper;
	
//	@Autowired
//	public BoardServiceImpl(BoardMapper mapper) {
//		this.mapper = mapper;		
//	}
	// injection을 생성자, 또는 메소드로 할수있음. 위는 생성자로 구현
	
	
	@Override
	public void register(BoardVO board) {
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(long bno) {
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		return mapper.update(board) == 1;
	}

	@Override
	public boolean remove(long bno) {
		return mapper.delete(bno) == 1;
	}

	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

}
