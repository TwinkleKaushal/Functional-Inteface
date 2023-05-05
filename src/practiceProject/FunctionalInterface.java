package practiceProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

	public static void main(String s[]) {

		
	
		//=============================================Predicate=================================================
		/**
		 * Produces only boolean result
		 */
		
//		Predicate<String> checkLength=str->str.length()>5;
//		System.out.println(checkLength.test("Twinkle"));
//		
		
		//==============================================Consumer=============================================
		
		/**
		 * Only consumes , No result"
		 */
	
//	 private String name;
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//		
//		public static void main(String s[]) {
//			FunctionalInterface f=new FunctionalInterface();
//			Consumer<FunctionalInterface> setname=t->t.setName("Twinkle");
//			setname.accept(f);
//			System.out.println(f.getName());
			
	//====================================================Function==============================================
			/**
			 * Take both input and output
			 */
	 
		Function<Integer, String> result=p->p*8+" This is multiplication of given numbers";
		String apply = result.apply(2);
		System.out.println(apply);
		
	//=====================================================Supplier==============================================
		
		/**
		 * No input , Only supply
		 */
		
		Supplier<Double> ran=()->Math.random();
		Double double1 = ran.get();
		System.out.println(double1);
	//=================================================Comparable================================================

//	class ComparableExample implements Comparable<ComparableExample> {
//		
//		String name;
//		Integer age;
//		
//		public ComparableExample(String name, Integer age) {
//			this.name = name;
//			this.age = age;
//		}
//		
//		public String getName() {
//		      return name;
//		 }
//		@Override
//		public int compareTo(ComparableExample o) {
//			
//			return this.name.compareTo(o.name);
//		}
//		
//	  public String toString() {
//	  return name + " (" + age + ")";
//	}
//		
//	}
//			
//			List<ComparableExample> way2= new ArrayList<>();
//			way2.add(new ComparableExample("Annu", 21));
//			way2.add(new ComparableExample("sss", 26));
//			way2.add(new ComparableExample("dfh", 30));
//			way2.add(new ComparableExample("jkk", 10));
//			way2.add(new ComparableExample("qqq", 5));
//			
//			Collections.sort(way2);
//			
//				System.out.println(way2);
//		
//		}
	
	
	// =====================================================Comparator======================================
//			Comparator<Integer> way1 = (Integer o1, Integer o2) -> {
//
//				return o1 % 10 > o2 % 10 ? 1 : -1;
//			};
//
//			List<Integer> roll = new ArrayList<>();
//			roll.add(25);
//			roll.add(12);
//			roll.add(82);
//			roll.add(48);
//			roll.add(23);
//
//			Collections.sort(roll, way1);
//			System.out.println(roll);
//		}

	}
}
