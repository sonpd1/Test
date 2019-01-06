package test;

public class Main {
	public static void main(String[] args) {
		System.out.println("This is hung_branch");
		System.out.println("This is son_branch");
	}
	
	public void method() {
		System.out.println("This is hung_branch");
		System.out.println("This is son_branch");
	}
}