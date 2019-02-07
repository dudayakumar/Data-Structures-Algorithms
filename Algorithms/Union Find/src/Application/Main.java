package Application;

import UnionFind.QuickFind;
import UnionFind.QuickUnion;

public class Main {

	public static void main(String[] args) {
		//Test Quick Find
		QuickFind qf = new QuickFind(6);
		qf.union(1, 4);
		qf.union(3, 4);
		qf.union(5, 2);
		
		System.out.println("Start test Quick Find Algorithm...");
		System.out.println("qf.connected(1, 5): "+qf.connected(1, 5));
		System.out.println("qf.connected(4, 3): "+qf.connected(4, 3));
		System.out.println("qf.connected(4, 1): "+qf.connected(4, 1));
		System.out.println("qf.connected(1, 4): "+qf.connected(1, 4));
		System.out.println("End test Quick Find Algorithm...");
		
		//Test Quick Union
		QuickUnion qu = new QuickUnion(6);
		qu.union(1, 4);
		qu.union(3, 4);
		qu.union(5, 2);

		System.out.println("\nStart test Quick Union Algorithm...");
		System.out.println("qu.connected(1, 5): " + qu.connected(1, 5));
		System.out.println("qu.connected(4, 3): " + qu.connected(4, 3));
		System.out.println("qu.connected(4, 1): " + qu.connected(4, 1));
		System.out.println("qu.connected(1, 4): " + qu.connected(1, 4));
		System.out.println("End test Quick Union Algorithm...");
		
	}
}
