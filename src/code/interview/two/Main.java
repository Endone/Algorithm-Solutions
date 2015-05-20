package code.interview.two;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：定义栈的数据结构，要求添加一个min函数，能够得到栈的最小元素。要求函数min、push以及pop的时间复杂度都是O(1)。
 * 
 * @author Administrator
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(-1);
		System.out.println(stack.min());
		System.out.println(stack.pop());
		System.out.println(stack.min());
		stack.push(12);
		System.out.println(stack.min());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.min());
	}

}

class Stack {
	private List<Integer> elements;
	private List<Integer> positions;

	public Integer min() {
		if (elements.size() == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return elements.get(positions.get(positions.size() - 1));
	}

	public Integer pop() {
		if (elements.size() == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		positions.remove(positions.size() - 1);
		return elements.remove(elements.size() - 1);
	}

	public void push(Integer element) {
		if (elements == null) {
			elements = new ArrayList<Integer>();
		}
		elements.add(element);
		if (positions == null) {
			positions = new ArrayList<>();
			positions.add(0);
		} else {
			if (element < elements.get(positions.get(positions.size() - 1))) {
				positions.add(elements.size() - 1);
			} else {
				positions.add(positions.get(positions.size() - 1));
			}
		}

	}
}
