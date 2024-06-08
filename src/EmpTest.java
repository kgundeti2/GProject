
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Emp {
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp(int num, String name, String dept, int sal) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
	int num;
	String name;
	String dept;
	int sal;
}


public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> empList = new ArrayList<Emp>();
		List<Emp> empList2 = new ArrayList<Emp>();

		
		empList.add(new Emp(1,"krishna","IT",1000));
		empList.add(new Emp(2,"krishna1","FI",2000));
		empList.add(new Emp(3,"krishna3","IT",3000));
		empList.add(new Emp(4,"krishna4","ITT",1000));
		empList.add(new Emp(5,"krishna5","IT",5000));
		

		
		List<List<Emp>> stream = partitionList(empList,3);

		// Creating a List of Integers
		



		System.out.println("Pringint list");

	}
	public static <T> List<List<T>> partitionList(List<T> list, int partitionSize) {
        return IntStream.range(0, (list.size() + partitionSize - 1) / partitionSize)
                .mapToObj(i -> list.subList(i * partitionSize, Math.min(list.size(), (i + 1) * partitionSize)))
                .collect(Collectors.toList());
    }
	public static boolean isPrime(int number) {
	    return !IntStream.range(2, number/2).anyMatch(i -> number%i == 0); 
	}

}

