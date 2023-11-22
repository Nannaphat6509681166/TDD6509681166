package core;

import java.util.ArrayList;

public class Stack implements IStack {

	
	public ArrayList<Object> elm = new ArrayList<>();
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(Object elm) {
		// TODO Auto-generated method stub
		this.elm.add(elm);
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return elm.get(elm.size() -1);
	}

	@Override
	public void pop(Object elm) {
		// TODO Auto-generated method stub
		this.elm.remove(elm);
	}

}
