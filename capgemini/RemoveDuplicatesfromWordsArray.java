package capgemini;
import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicatesfromWordsArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String[] words = new String[n];
		for(int i=0;i<n;i++) {
			words[i]=sc.nextLine();
		}
		String[] res=removeDuplicatesFromwords(words);
		System.out.println(Arrays.toString(res));
	}
	public static String[] removeDuplicatesFromwords(String[] words) {
		if(words==null) {
			return null;
		}
		String[] result=new String[words.length];
		for(int i=0;i<words.length;i++) {
			result[i]=remove(words[i]);
		}
		return result;
	}
	public static String remove(String word) {
		if(word==null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<word.length();i++) {
			char currentChar = word.charAt(i);
			if(sb.indexOf(String.valueOf(currentChar))==-1) {
				sb.append(currentChar);
			}
		}
		return sb.toString();
	}
}
