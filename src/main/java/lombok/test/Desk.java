package lombok.test;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor //final field만 생성자 생성
@EqualsAndHashCode
public class Desk {

	private final double price;
	private final String model;
	private String name;
}
