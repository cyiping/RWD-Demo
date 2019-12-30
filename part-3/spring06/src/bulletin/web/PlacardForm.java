package bulletin.web;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PlacardForm {

	@NotNull
	@Size(min = 1, max = 140)
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
