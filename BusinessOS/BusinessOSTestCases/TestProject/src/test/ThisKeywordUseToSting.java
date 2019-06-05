package test;

public class ThisKeywordUseToSting {

	int age;
	String name,address,colluge,best_freind;
	
	
	ThisKeywordUseToSting(int age,String name,String addresss, String colluge, String best_freind){
		this.age=age;
		this.address=addresss;
		this.colluge=colluge;
		this.best_freind=best_freind;
		
	}
public String toString() {
	return age+" "+address+" "+name+" "+colluge+" "+best_freind;
	
}
	
public static void main(String args[]) {
	ThisKeywordUseToSting obj=new ThisKeywordUseToSting(10, "pune", "rohit", "Friend", "Collegue");
	
System.out.println(obj);	
}
}
