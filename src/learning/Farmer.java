package learning;

import java.util.*;

/**
 * 
 * @author denniske 3/6/2020
 * contains some errors
 *
 */

public class Farmer implements Data {
	
		String name;
		int age;
		long income;
		
		public Farmer(String name, int age) {
			
			this.name = name;
			this.age = age;
		}
		
		public Farmer(String name, int age, long income) {
			
			this.name = name;
			this.age = age;
			this.income = income;
			
		}
		
		public String getName() {
			
			return name;
		}
		
		public int getge() {
			
			return age;
		}
			public String toString() {
				
			return name + " : " + age;
		}

			//natural order for this class
			public int compareTo(Object cow) {
				
				return getName().compareTo(((Farmer) cow).getName());
			}
			
	static class AgeComparator implements Comparator{
		
		public int compare(Object cow1, Object cow2) {
				Farmer p1 = (Farmer) cow1;
					Farmer p2 = (Farmer) cow2;
					
					if(p1.getIncome() == 0 && p2.getIncome() == 0)
						return p1.getAge() - p2.getAge();
					else
						return (int) 
								(p1.getIncome() - p2.getIncome());
			
		}
	}
	
	public static void main(String args[]) {
		
		List farmer = new ArrayList();
		
		farmer.add(new Farmer("Joe", 34));
		farmer.add(new Farmer("Ali", 54));
		farmer.add(new Farmer("Mark", 56));
		farmer.add(new Farmer("Jose", 78));
		farmer.add(new Farmer("Diana", 64));
		
		Collections.sort(farmer);
		System.out.println("sort in natural order");
		System.out.println("t" +farmer);
		
		
		Collections.sort(farmer, Collections.reverseOrder());
		System.out.println("Sort by reversed natural order");
		System.out.println("t" +farmer);
		
       List farmerIncome = new ArrayList();
		
		farmerIncome.add(new Farmer("Joe", 34, 33));
		farmerIncome.add(new Farmer("Ali", 54, 566));
		farmerIncome.add(new Farmer("Mark", 56, 5567));
		farmerIncome.add(new Farmer("Jose", 78, 567));
		farmerIncome.add(new Farmer("Diana", 64, 66));
		
		Collection.sort(farmer, new AgeComparator());
		System.out.println("sort using Age comparator");
		System.out.println("t" +farmer);
		
		Collection.sort(farmerIncome, new AgeComparator());
		System.out.println("Sort using Age comparator but using income wise");
		System.out.println("t" +farmerIncome);
	 
	}
	
	public long getIncome() {
		
		return income;
	}
	
	public int getAge() {
		
	   return age;
	}
	
	public void setIncome(long income) {
		
		this.income = income;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public static Object reverseOrder() {
		// TODO Auto-generated method stub
		return null;
		}
}



























