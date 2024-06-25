package a0625.sortkmp;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueMain {
	
	static class Car implements Comparable<Car>{
		String name;
		int year;
		Car(String name, int year) {
			this.name=name;
			this.year=year;
		}
	@Override
	public String toString() {
		return name+year;
	}
	@Override
	public int compareTo(Car o) {
		return name.compareTo(o.name);
//		return Integer.compare(year, o.year);
	}
	}
	
	public static void main(String[] args) {
//		PriorityQueue<Car> pq = new PriorityQueue<>(Comparator.reverseOrder()); // Comparator.reverseOrder 이름 역순
		PriorityQueue<Car> pq = new PriorityQueue<>((o1,o2) -> Integer.compare(o1.year, o2.year));
		pq.offer(new Car("아반떼", 2015));
		pq.offer(new Car("그랜저", 2007));
		pq.offer(new Car("소나타", 2023));
		pq.offer(new Car("아반떼", 2015));
		pq.offer(new Car("그랜저", 2008));
		pq.offer(new Car("소나타", 2024));
		System.out.println(pq);
		while(!pq.isEmpty()) System.out.print(pq.poll()+" ");
		System.out.println();
		
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->Integer.compare(o1, o2)); // -Integer 붙이면 최소힙
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // 최대 힙사용하려면 Comparator 사용
//		pq.offer(22); // queue니까 offer 사용										// default는 최소 힙
//		pq.offer(11);
//		pq.offer(33);
//		pq.offer(22);
//		pq.offer(11);
//		pq.offer(33);
//		System.out.println(pq);
//		while(!pq.isEmpty()) System.out.print(pq.poll()+" "); // pq에 수가 들어가있으면 뽑아라.
//		System.out.println();
	}
}
