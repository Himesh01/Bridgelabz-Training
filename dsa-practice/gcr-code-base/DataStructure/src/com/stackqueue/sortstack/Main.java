package com.stackqueue.sortstack;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(6);
		stack.push(3);
		stack.push(0);
		stack.push(2);
		
		Stack ans = sort(stack);
		while(!ans.isEmpty()) {
			System.out.print(ans.pop().data+" ");
		}
	}
	public static Stack sort(Stack s) {
		Stack ans = new Stack();
		while(!s.isEmpty()) {
			int n = s.pop().data;
			if(ans.isEmpty()) {
				ans.push(s.pop().data);
			}
			else if(n<ans.top.data) {
				while(n<ans.top.data&&(!ans.isEmpty())) {
					s.push(ans.pop().data);
				}
				ans.push(n);
			}else {
				ans.push(n);
			}
		}
		return ans;
	}
}
