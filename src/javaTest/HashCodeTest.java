package javaTest;

public class HashCodeTest {
	
	public static void main(String[]args){
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println("s1=====>" + s1.hashCode() + '\n' +"s2=====>" + s2.hashCode());
		String s3 = "abcd";
		String s4 = "abcd";
		String s5 = "HelloWorld";
		System.out.println("s3=====>" + s3.hashCode() + '\n' +"s4=====>" + s4.hashCode());
		System.out.println("s3=====>" + System.identityHashCode(s3) + '\n' +"s4=====>" + System.identityHashCode(s4));
		System.out.println("s1=====>" + System.identityHashCode(s1) + '\n' +"s2=====>" + System.identityHashCode(s2));
		System.out.println("欢迎您" + s5);
	}

}
