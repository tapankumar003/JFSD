package EmpAutoWire;

public class Employee {

	private EmployeeDetails empD;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(EmployeeDetails empD) {
		super();
		this.empD = empD;
	}

	public EmployeeDetails getEmpD() {
		return empD;
	}

	public void setEmpD(EmployeeDetails empD) {
		this.empD = empD;
	}

	@Override
	public String toString() {
		return "Employee [empD=" + empD + "]";
	}

}
