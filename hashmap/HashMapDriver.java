package hashmap;


public class HashMapDriver {
	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(30, "Prof");
		h.put(21, "Teach");
		h.put(4, "Psd");
		h.display();
		System.out.println(h.get(5));
		System.out.println(h.containsKey(5));
//		System.out.println(h.size());
		
	}
}
