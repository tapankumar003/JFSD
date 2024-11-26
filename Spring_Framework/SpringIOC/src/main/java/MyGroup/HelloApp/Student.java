package MyGroup.HelloApp;

public class Student {
	private int id;
	private String stdName;
	private Address address;

	public Student(int id, String stdName, Address address) {
		this.id = id;
		this.stdName = stdName;
		this.address = address;
	}

	public Student() {

	}

	public Student(int id, String stdName) {
		this.id = id;
		this.stdName = stdName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", address=" + address + "]";
	}

}
