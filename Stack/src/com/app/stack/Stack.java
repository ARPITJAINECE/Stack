package com.app.stack;

public class Stack {
	private Integer[] arr;
	private Integer top;
	private Integer size;

	public Stack(Integer size) {
		this.size = size;
		top = -1;
		arr = new Integer[size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == (size - 1);
	}

	public boolean push(Integer data) {
		if (isFull()) {
			return false;
		}
		arr[++top] = data;
		return true;
	}

	public Integer pop() {
		if (isEmpty()) {
			return null;
		}
		return arr[top--];
	}

	public Integer peek() {
		if (isEmpty()) {
			return null;
		}
		return arr[top];
	}

}
