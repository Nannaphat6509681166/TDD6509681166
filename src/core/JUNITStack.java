package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	public void pushElmToTop() {
		
		Stack s2 = new Stack();

		s2.push(1);
		assertEquals(1,s2.top());
	
	}
	
	public void LastInFirstOut() {
		
		Stack s3 = new Stack();
		
		s3.push(1);
		s3.pop(s3);
		assertTrue(s3.isEmpty());
	}
	
	public void PushElmToLimitedSizeStack() {
		
		Stack s4 = new Stack();
		
		s4.push(1);
		assertTrue(s4.isFull());
	}
	
}
