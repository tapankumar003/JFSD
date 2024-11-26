package EmpAutoWire;

public class EmployeeDetails {

	private int id;
	private String empNm;
	private String empAdr;

	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int id, String empNm, String empAdr) {
		super();
		this.id = id;
		this.empNm = empNm;
		this.empAdr = empAdr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	public String getEmpAdr() {
		return empAdr;
	}

	public void setEmpAdr(String empAdr) {
		this.empAdr = empAdr;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", empNm=" + empNm + ", empAdr=" + empAdr + "]";
	}

}
