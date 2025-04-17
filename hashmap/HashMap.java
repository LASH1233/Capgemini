package hashmap;

import java.util.LinkedList;
import java.util.Objects;

public class HashMap {
	private LinkedList<Node>[] buckets;
	private int n;// no of nodes
	private int N;// no of buckets

	public HashMap() {
		N = 4;
		buckets = new LinkedList[N];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
	}

	public void put(int key, String value) {
		int bi = hashFunction(key);
		int di = getDataIndex(bi, key);
		if (di != -1) {// key present
			buckets[bi].get(di).value = value;
		} else {
			buckets[bi].add(new Node(key, value));
			n++;
		}

		double lambda = (double) n / N;
		if (lambda > 2.0) {
			rehash();
		}
	}

	public void rehash() {
		LinkedList<Node>[] old = buckets;
		buckets = new LinkedList[N * 2];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<>();
		}
		n=0;
		for (int i = 0; i < old.length; i++) {
			LinkedList<Node> list = old[i];
			for (int j = 0; j < list.size(); j++) {
				Node node = list.get(j);
				put(node.key, node.value);
			}
		}
	}
	public String get(int key) {
		int bi=hashFunction(key);
		int di=getDataIndex(bi, key);
		if(di!=-1) {
			return buckets[bi].get(di).value;
		}else {
			return null;
		}
	}
	public boolean containsKey(int key) {
		int bi=hashFunction(key);
		int di=getDataIndex(bi, key);
		if(di!=-1) {
			return true;
		}else {
			return false;
		}
	}
	public int getDataIndex(int bi, int key) {
		LinkedList<Node> list = buckets[bi];
		for (int i = 0; i < list.size(); i++) {
			Node node = list.get(i);
			if (node.key == key) {
				return i;
			}
		}
		return -1;
	}

	public int hashFunction(int key) {
		int hashCode = Objects.hash(key);
		hashCode = Math.abs(hashCode);
		return hashCode % buckets.length;
	}
	public void display() {
		for(int i=0;i<buckets.length;i++) {
			LinkedList<Node> list=buckets[i];
			for(int j=0;j<list.size();j++) {
				Node node = list.get(j);
				System.out.println(node.key+" "+node.value);
			}
		}
	}

	private class Node {
		int key;
		String value;

		public Node(int key, String value) {
			this.key = key;
			this.value = value;
		}

	}
}
