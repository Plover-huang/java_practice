import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class only4test {
	private int a;
	public only4test(int b){
		a=b;
	}
	public int getA(){
		return a;
	}
	public void setA(int a){
		this.a=a;
	}
	public static void main(String[] args) throws FileNotFoundException{
//		only4test bbOnly4test=new only4test(1111);
//		only4test ccOnly4test=new only4test(89);
//		System.out.println(ccOnly4test.getA());
//		System.out.println(bbOnly4test.getA());
//		bbOnly4test=ccOnly4test;
//		System.out.println(bbOnly4test.getA());
//		ccOnly4test.setA(11);
//		System.out.println(bbOnly4test.getA());
//		bbOnly4test.setA(9900);
//		System.out.println(bbOnly4test.getA());
//		System.out.println(ccOnly4test.getA());
//		
//		List<only4test> listtest=new ArrayList<>();
//		listtest.add(bbOnly4test);
//		for(only4test list:listtest){
//			System.out.println(list.getA());
//		}
//		
//		
//		String xx="ª∂abv”≠b¿¥µΩ≈¶‘º";
//		System.out.println(xx+"\n"+String.valueOf(xx.toCharArray()));
//		System.out.println(xx.toCharArray()[2]);
				
		
//		HashMap<String, Integer> aa=new HashMap<>();
//		String[] l={"as","ab","as","ab","aa"};
//		for(String ll:l ){
//			if(!aa.containsKey(ll)){
//				aa.put(ll,0);
//			}
//			aa.put(ll, aa.get(ll)+1);
//		}
//		
//		System.out.println(aa);
//		
//		
//		
//		
//		String[] aStrings={"asd","asdf","dasf"};
//		
//		
//		String path="F:\\git";
//		if (new File(path).isDirectory())
//			System.out.println("directory " + path);
//		else
//			System.out.println("asdfasd");
		
		System.setOut(new PrintStream(new File("F:\\javaout")));
		System.out.println("dasfsdfasdf");
		
	}
}
