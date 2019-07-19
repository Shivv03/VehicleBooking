package in.nic.bookmytrip.pojo;

import org.springframework.http.HttpStatus;

public class Response {
	
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
	
	public Response() {
	
	}

	public Response(int status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public Response(String message) {
		this.status = HttpStatus.OK.value();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Response [status=" + status + ", message=" + message + "]";
	}
	
}
