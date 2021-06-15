package core.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("bag")
@Component
// bean의 이름이 생략되면 클래스의 이름이 자동으로 bean의 이름이 됨!
public class Bag {

	private Book book;

	
//	@Autowired
	// 주입되어야 할 생성자가 1개밖에 없으면 자동 주입됨! (버전별로 다를 수 있음)
	public Bag(Book book) {
		super();
		this.book = book;
	}

	@Override
	public String toString() {
		return "Bag [book=" + book + "]";
	}
	
//	@Autowired
	// setter를 주입해서 엮어!
	public void setBook(Book book) {
		this.book = book;
	}
}
