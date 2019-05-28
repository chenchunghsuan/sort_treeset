import java.util.*;
public class sort_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s;
   Scanner sc=new Scanner(System.in);
while(true) {
	System.out.println("Please enter a sentence: if enter q it will quit");
	s=sc.nextLine();
	if(s=="q")break;
	String[] word=s.split(" ");
	SortedSet<String> tree =new TreeSet<>(Arrays.asList(word));
	for(String a:tree)System.out.println(a);
	
}   
	}

}
