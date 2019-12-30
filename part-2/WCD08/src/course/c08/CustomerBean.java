package course.c08;

import java.io.Serializable;

public class CustomerBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name = "";
	private String email = "";
	private String phone = "";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "CustomerBean [name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

}