package stringBuffer;

public class demo {
	public static void main(String[] args) {
		int[] arr = null;
		try {
			System.out.println(arr[5]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
	}
}
