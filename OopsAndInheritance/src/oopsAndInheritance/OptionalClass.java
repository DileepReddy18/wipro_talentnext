package oopsAndInheritance;

import java.util.*;

class InvalidEmployeeException extends RuntimeException{
	public InvalidEmployeeException () {
		super("Employee object is null");
	}
}
public class OptionalClass {

	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionalClass emp=new OptionalClass();
		Optional<String>h=Optional.ofNullable(emp.name);
		System.out.println(h.orElseThrow(InvalidEmployeeException::new));


	}

}
