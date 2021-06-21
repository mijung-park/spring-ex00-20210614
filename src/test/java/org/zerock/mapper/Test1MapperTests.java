package org.zerock.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Test1VO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class Test1MapperTests {
	
	
	@Setter (onMethod_ = @Autowired)
	private Test1Mapper mapper;
	
	@Test
	public void testMapper() {
		assertNotNull(mapper);
	}
	
	@Test
	public void testGetList() {
		List<Test1VO> list = mapper.getList();
		
		assertTrue(list.size() > 0);
	}
	
	@Test
	public void testInsert() {
		Test1VO test = new Test1VO();
		test.setName("may");
		test.setAge(30);
		
		int before = mapper.getList().size();
		
		mapper.insert(test);
		
		int after = mapper.getList().size();
		assertEquals(before +1, after);
	}
	
	@Test
	public void testInsertSelecKey() {
		Test1VO vo = new Test1VO();
		vo.setName("Babo");
		vo.setAge(37);
		
		mapper.insertSelectKey(vo);
		assertNotEquals(0, vo.getId());
	}
	
	@Test
	public void testRead() {
		Test1VO vo = mapper.read(1);

		assertEquals("mijung", vo.getName());
		assertEquals(32, vo.getAge());
	}
	
	@Test
	public void testDelete() {
		mapper.delete(6);
		
		Test1VO vo = mapper.read(6);
		
		assertNull(vo);
	}
	
	@Test
	public void testUpdate() {
		Test1VO vo = new Test1VO();
		vo.setId(4);
		vo.setName("PARK");
		vo.setAge(200);
		mapper.update(vo);
		
		Test1VO vo4 = mapper.read(4);
		
		assertEquals("PARK", vo4.getName());
		assertEquals(200, vo4.getAge());
	}

}
