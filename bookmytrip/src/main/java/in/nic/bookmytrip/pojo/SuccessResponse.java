package in.nic.bookmytrip.pojo;

import org.springframework.http.HttpStatus;

public class SuccessResponse {
	
	private int status;
	private String message;
	
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
	
	public SuccessResponse() {
	
	}

	public SuccessResponse(int status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public SuccessResponse(String message) {
		this.status = HttpStatus.OK.value();
		this.message = message;
	}

	@Override
	public String toString() {
		return "SuccessResponse [status=" + status + ", message=" + message + "]";
	}
	
}
