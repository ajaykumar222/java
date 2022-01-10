import java.util.ArrayList;
import java.util.List;

public class Person {
	protected String name; 
    Person(String name){ 
        this.name = name; 
    } 
    class Me extends Person{ 
        private List skills; 
        Me(String name, List skills){ 
            super(name); 
            this.skills = skills; 
        } 
        public String toString(){ 
            return "Hello my name is "+this.name  + " and I know "+ this.skills; 
        }
    }

	public static void main(String[] args) {
		List skills = new ArrayList(); 
        skills.add("collection"); 
        skills.add("multithreading"); 
        skills.add("inheritance"); 
        skills.add("encapsulation"); 
        
        System.out.println(skills);
		
		

	}

}
