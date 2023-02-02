import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		List<String> list_string1 =new ArrayList<String>();
		list_string1.add("red");
		list_string1.add("Pink");
		list_string1.add("Orange");
		list_string1.add("Blue");
		
		List<String> list_string2 =new ArrayList<String>();
		list_string2.add("red");
		list_string2.add("Pink");
		list_string2.add("Orange");
		list_string2.add("Blue");
		
		
		System.out.println("Array list before Swap:");
        for(String a: list_string1){
        System.out.println(a);
      }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
       Collections.swap(list_string1, 0, 2);
        System.out.println("Array list after swap:");
        for(String b:list_string1){
        System.out.println(b);
		// TODO Auto-generated method stub

	}

}
}
