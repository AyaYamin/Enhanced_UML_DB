package UML_Task;

import java.util.ArrayList;

public class Task {
	
	final String nameTask;
	Qualification qualification;
//	ArrayList<SubTask> sub_task = new ArrayList<SubTask>();
        ArrayList<Employee> listOfEmployees=new ArrayList<Employee>();

	public Task(String name,String developer) {
		//this.qualification = new Qualification();
		this.nameTask = name;
                Employee E=new Employee(developer);
                listOfEmployees.add(E);
	}
        
        public String getName(){
            return this.nameTask;
        }

}
