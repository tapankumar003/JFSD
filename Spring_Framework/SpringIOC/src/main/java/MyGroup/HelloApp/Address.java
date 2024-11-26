package MyGroup.HelloApp;

public class Address {
	private String addr;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String addr) {
		super();
		this.addr = addr;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + "]";
	}

}
