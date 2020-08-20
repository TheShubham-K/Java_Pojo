package finalProject;

class Employee {
	
	private String empName;
	private int empId;
	private long empSalary;
	public Employee(String empName, int empId, long empSalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public long getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
	}
}


public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("XYZ", 1,100);
		System.out.println(e.getEmpId());
	}

}
