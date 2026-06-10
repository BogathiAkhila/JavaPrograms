package FunctionInterface;

//import java.util.function.Consumer;
//
//class Student implements Consumer<String>{
//	@Override
//	public void accept(String str) {
//		System.out.println(str);
//	}
//}
//
//public class ConsumerFunction {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Consumer<String> consumer=new Student();
//		consumer.accept("Java is aewesome....");
//
//	}
//
//




//import java.util.function.Consumer;
//
//class Student implements Consumer<Integer>{
//	@Override
//	public void accept(Integer i) {
//		System.out.println("The Integer is"+i);
//	}
//	
//}
//
//public class ConsumerFunction{
//	public static void main(String[] args) {
//		
//		Consumer<Integer> obj=new Consumer<Integer>() {
//			public void accept(Integer i) {
//				System.out.println("Integer value: "+i);
//			}
//		};
//		obj.accept(34);
//		
//	}
//}



//
//import java.util.function.Consumer;
//
//class Student implements Consumer<Integer>{
//	@Override
//	public void accept(Integer i) {
//		System.out.println(i);
//	}
//}
//
//class ConsumerFunction{
//	public static void main(String[] args) {
//		Consumer<Integer> obj=new Consumer<Integer>(){
//			@Override
//			public void accept(Integer i) {
//				System.out.println(i);
//			}
//			
//		};
//		obj.accept(20);
//	}
//}




import java.util.function.Consumer;
class Employee{
	String empName;
	
	public Employee(String empName) {
		this.empName=empName;
	}
	
	@Override
	public String toString() {
		return "Employee : "+empName;
	}
}


public class ConsumerFunction{
	public static void main(String[] args) {
		Consumer<Employee> obj=new Consumer<Employee>() {
			@Override
			public void accept(Employee emp) {
				System.out.println(emp);
			}
		};
		obj.accept(new Employee("Bogathi Akhila"));
	}
}


