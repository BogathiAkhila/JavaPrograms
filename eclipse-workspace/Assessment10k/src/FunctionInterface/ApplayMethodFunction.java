package FunctionInterface;

//import java.util.function.Function;
//import java.util.function.Supplier;
//
//public class ApplayMethodFunction {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Supplier<String> s=new Supplier<String>() {
//			@Override
//			public String get() {
//				return "Hello There";
//			}
//		};
//		System.out.println(s.get());
//
//	}
//
//}



import java.util.function.Function;
import java.util.function.Supplier;

public class ApplayMethodFunction{
	public static void main(String[] args) {
		
		Function<Integer, String> f=new Function<Integer,String>(){
			@Override
			public String apply(Integer i) {
				return "Integer value: "+i;
			}
			
		};
		System.out.println(f.apply(34));
	}
}
