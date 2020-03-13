package UML_Task;

import java.util.ArrayList;

public class Employee {
        private String  EmployeeName;
        private float  EmployeeSalary;
        private float  EmployeeID;
        private String  EmployeeAddress;
	//final Qualification qualification;
	//private Department department;
	//private Task task;
        ArrayList<Task> list_tasks = new ArrayList<Task>();
        ArrayList<Department> list_Department = new ArrayList<Department>();
	final ArrayList<Qualification> list_Qualification = new ArrayList<Qualification>();
        
	public Employee(String name ,float salary ,String addr ,float id,String dep,String qua) {
		//this.qualification = new Qualification();
                this.list_tasks=new  ArrayList<Task> ();
		// TODO Auto-generated constructor stub
                this.EmployeeName=name;
                this.EmployeeSalary=salary;
                this.EmployeeAddress=addr;
                this.EmployeeID=id;
                Department d=new Department(dep);
                list_Department.add(d);
                Qualification qu=new Qualification(qua);
                list_Qualification.add(qu);
	}
        
	public Employee(String developer) {
		//this.qualification = new Qualification();
                this.list_tasks=new  ArrayList<Task> ();
                this.EmployeeName=developer;             
	}

        
	

	public String getName(){
            return this.EmployeeName;
        }
        
        public void setName(String n){
            this.EmployeeName=n;
        }
        
        public float getSalary(){
            return this.EmployeeSalary;
        }
        
         public void setSalary(float s){
            this.EmployeeSalary=s;
        }

}
