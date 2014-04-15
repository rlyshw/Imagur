import java.util.ArrayList;
import java.util.List;


public class encoder {
	public static List<Integer> inList(String input){
		List<Integer> c = new ArrayList<Integer>();
		for(int i=0;i<input.length();i++){
			char a_char = input.charAt(i);
			c.add((int) a_char);
		}
		while(c.size()%3!=0){
			c.add(0);
		}
		return c;
	}
}
