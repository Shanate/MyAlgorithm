package a0624.stackqueue;

import java.util.*;

public class StackQueueTest {
	public static void main(String[] args) {
		// C처럼 offer, poll, peek 사용. add,remove,element 똑같이 작동하나 알고리즘을 풀 때는 offer, 객체 지향을 추구할 때는 add 사용.
//		Queue<String> queue=new LinkedList(); // Queue에 shift F2해서 check.
		ArrayDeque<String> queue= new ArrayDeque<>();
		queue.offer("강호동"); // offer = inque
		queue.offer("저팔계");
		queue.offer("손오공");
		queue.offer("사오정");
		queue.offer("저팔계");
		System.out.println(queue.peek()+" "+queue.size());
		System.out.println(queue.poll()+" "+queue.size());
		System.out.println(queue.poll()+" "+queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.poll()+" "+queue.size());
		System.out.println(queue);
		System.out.println();
		
//		Stack<String> stack=new Stack<>();
		ArrayDeque<String> stack=new ArrayDeque<>();
		stack.push("강호동");
		stack.push("저팔계");
		stack.push("손오공");
		stack.push("사오정");
		stack.push("홍길동");
		System.out.println(stack.peek()+" "+stack.size()); // 마지막에 위치한 포인터를 가리킨다.
		System.out.println(stack.pop()+" "+stack.size());
		System.out.println(stack.pop()+" "+stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop()+" "+stack.size());
		System.out.println(stack);
		System.out.println();
	}
}
