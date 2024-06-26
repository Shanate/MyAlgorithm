package a0626.listtree;

import java.io.*;
import java.util.*;

public class CompleteBinaryTreeMain {
	static class CompleteBinaryTree<T>{
		final int SIZE;
		Object[] nodes;
		int lastIndex;
		
		CompleteBinaryTree(int size){
			SIZE=size; // 대입하는 순간 final int SIZE가 상수로 변해서 빨간줄이 사라짐.
			nodes=new Object[size+1]; // 0번 인덱스 사용하지 않기 때문에 +1. 
		}
		
		void add(T t){
			if(lastIndex == SIZE){
				System.out.println("포화상태!");
				return;
			}
			nodes[++lastIndex]=t; // 0번 사용하지 않기 때문에 전위 증감 연산자 사용
//			System.out.println(Arrays.toString(nodes));
		}
		
		void bfs(int i){
			ArrayDeque<Integer> q=new ArrayDeque<>();
			q.offer(i);
			while(!q.isEmpty()){
				i=q.poll();
				System.out.print(nodes[i]+" ");
				if(i*2  <=lastIndex) q.offer(i*2);
				if(i*2+1<=lastIndex) q.offer(i*2+1);
			}
		}
		void preOrder(int i){
			System.out.print(nodes[i]+" ");	
			if(i*2  <=lastIndex) preOrder(i*2);
			if(i*2+1<=lastIndex) preOrder(i*2+1);
		}
		void inOrder(int i){
			if(i*2  <=lastIndex) inOrder(i*2);
			System.out.print(nodes[i]+" ");	
			if(i*2+1<=lastIndex) inOrder(i*2+1);
		}
		void postOrder(int i){
			if(i*2  <=lastIndex) postOrder(i*2);
			if(i*2+1<=lastIndex) postOrder(i*2+1);
			System.out.print(nodes[i]+" ");	
		}
	}
	public static void main(String[] args) throws Exception {
		int size=12;
		CompleteBinaryTree<Character> tree=new CompleteBinaryTree<>(size);
		for(int i='A'; i<'A'+size; i++) tree.add((char)i);
		
		tree.bfs(1);
		System.out.println();
		tree.preOrder(1);
		System.out.println();
		tree.inOrder(1);
		System.out.println();
		tree.postOrder(1);
		System.out.println();
	}
}
