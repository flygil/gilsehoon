package kr.co.mlec.util;

public class MyArrayList<E> {
	Object[] elements;
	int pos = 0;
	
	public MyArrayList() {
		this(4);
	}
	public MyArrayList(int initCount) {
		elements = new Object[initCount];
	}
	public boolean isEmpty() {
		return pos == 0;
	}
	public void add(E data) {
		if (pos == elements.length) {
			Object[] temp = new Object[pos * 2];
			System.arraycopy(elements, 0, temp, 0, pos);
			elements = temp;
		}
		// 배열명[방번호] = 값;
		elements[pos++] = data;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index){
		return (E)elements[index];
	}
	public int size() {
		return pos;
	}
	public void remove(int index) {
		System.arraycopy(elements, index + 1, elements, index, pos - (index + 1));
		elements[--pos] = null;
	}
	void clear() {
		for (int i = 0; i < pos; i++) {
			elements[i] = null;
		}
		pos = 0;
	}
	public String toString() {
		String result = "MyArrayList[";
		result += elements[0];
		for (int i = 1; i < pos; i++) {
			result += ", " + elements[i];
		}
		result += "]";
		
		return result;
	}
}













