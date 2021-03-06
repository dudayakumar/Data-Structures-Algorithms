package UnionFind;

public class QuickUnion {
	int[] id;
	
	public QuickUnion(int N) {
		id = new int[N];
		for(int i=0; i<N; i++) {
			id[i] = i;
		}
	}
	
	public int root(int i) {
		while(id[i] != i) {
			i = id[i];
		}
		return i;
	}
	
	public boolean connected(int p, int q) {
		return root(p)==root(q);
	}
	
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		id[p] = qid;
	}
}
