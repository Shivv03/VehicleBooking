package in.nic.bookmytrip.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {
	
	private int status;
	private String message;
	private List<FieldErrors> fieldErrors = new ArrayList<FieldErrors>();

	
	

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public List<FieldErrors> getFieldErrors() {
		return fieldErrors;
	}

	public void setFieldErrors(List<FieldErrors> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
	
	public ErrorResponse(){
		
	}
	
	public ErrorResponse(int status, String message, List<FieldErrors> fieldErrors) {
		this.status = status;
		this.message = message;
		this.fieldErrors = fieldErrors;
	}

	public ErrorResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorResponse [status=" + status + ", message=" + message + ", fieldErrors=" + fieldErrors + "]";
	}
	
	public void addFieldError(String path, String message) {
        FieldErrors error = new FieldErrors(path, message);
        fieldErrors.add(error);
    }
	
	

}
