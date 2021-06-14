package lombok.test;

import lombok.Getter;
import lombok.Setter;

public class User {

	@Getter
	private String name;
	
	@Getter
	private String nickname;
	
	@Getter
	@Setter
	private boolean loggenIn;
}
