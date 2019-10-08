import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class PalindromeTest {

	@Test
	public void test1(){
		Palindrome p1 = new Palindrome("abak");
		assertEquals(true, p1.isPalindrome());	
	}

	@Test
	public void test2(){
		Palindrome p2 = new Palindrome("abcd");
		assertEquals(true, p2.isPalindrome());	
	}
	@Test
	public void test3(){
		Palindrome p3 = new Palindrome("omg");
		assertEquals(true, p3.isPalindrome());	
	}
	@Test
	public void test4(){
		Palindrome p4 = new Palindrome("ab");
		assertEquals(true, p4.isPalindrome());	
	}
	@Test
	public void test5(){
		Palindrome p5 = new Palindrome("abcbap");
		assertEquals(true, p5.isPalindrome());	
	}

}
