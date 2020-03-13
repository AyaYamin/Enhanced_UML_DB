package UML_Task;

import java.util.ArrayList;

public class Project {
	
	private  String nameProject;
	private String  managerProject;
	final ArrayList<Task> listTasks = new ArrayList<Task>();
        ArrayList<Employee> listEmployees = new ArrayList<Employee>();

	public Project(String name,String manager) {
		this.nameProject=name;
                this.managerProject=manager;
            //    this.listEmployees=new 
	}
	
        public Project(){}
	
	public void create_Task(Task e) {
		listTasks.add(e);
	}
	
    public void create_Employee(Employee e) {
    	listEmployees.add(e);
	}
	


	public String getName_project() {
		return nameProject;
	}


	public void setName_project(String name_project) {
		this.nameProject = name_project;
	}


	public String getManager_project() {
		return managerProject;
	}


	public void setManager_project(String size_project) {
		this.managerProject = size_project;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project project=new Project();
		//project.setName_project("react_js");
		

	}

}
