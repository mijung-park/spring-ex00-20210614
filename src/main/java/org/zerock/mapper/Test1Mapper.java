package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.Test1VO;

public interface Test1Mapper {
	
	public List<Test1VO> getList();
	
	public int insert(Test1VO test);
	
	public int insertSelectKey(Test1VO vo);
	
	public Test1VO read(int id);
	
	public int delete(int id);
	
	public int update(Test1VO test);
}
