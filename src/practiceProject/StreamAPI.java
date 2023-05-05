package practiceProject;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPI  {


    public static void main(String[] args) {

    	List<Integer> demo1=Arrays.asList(98,45,23,30);
    	List<Integer> collect = demo1.stream().filter(n->n%2==0).collect(Collectors.toList());
    	
    	
    	demo1.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
    	demo1.stream().filter(n->n%2==0).forEach(System.out::println);
    	List<Integer> collect2 =demo1.stream().map(n->n+5).filter(n->n%2==0).collect(Collectors.toList());
    	
    	
    	List<Integer> list = demo1.stream().sorted().toList();
    	
    	
    	List<Integer> distinct = demo1.stream().distinct().collect(Collectors.toList());
    	
    	long count = demo1.stream().count();
    	
    	Optional<Integer> max = demo1.stream().max((o1, o2) ->o1.compareTo(o2));
    	
    	
    	List<String> demo3=Arrays.asList("annu","avi","isha","piya");
    	List<String> collect3 = demo3.stream().map(str->str.substring(0, 1).toUpperCase()+str.substring(1)).collect(Collectors.toList());
    	
    	
    	List<Integer> demo5=Arrays.asList(98,45);
    	List<Integer> demo6=Arrays.asList(100,23,30);
    	List<Integer> demo7=Arrays.asList(1,2);
    	List<Integer> demo8=Arrays.asList(4,5);
    	List<Integer> demo9=Arrays.asList(6,8);
    	List<List<Integer>> finalList=Arrays.asList(demo5,demo6,demo7,demo8,demo9);
    	List<Integer> collect4 = finalList.stream().flatMap(x->x.stream()).filter(x->x%2==0).collect(Collectors.toList());
    	
    	System.out.println(max);
    	
    }

	
}
