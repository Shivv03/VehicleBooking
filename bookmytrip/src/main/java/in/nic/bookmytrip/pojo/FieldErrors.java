/**
 * 
 */
package in.nic.bookmytrip.pojo;

/**
 * @author Shiva
 * Created On 26-Jul-2019
 *
 */
public class FieldErrors {
	
	private String field;
	
	private String message;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public FieldErrors(String field, String message) {
		this.field = field;
		this.message = message;
	}

	public FieldErrors() {

	}


}
