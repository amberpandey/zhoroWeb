/**
 * 
 */
package work.zhoro.zhoroWeb.response;

import java.util.Date;

/**
 * @author Amber
 *
 */
public class MainResponse {

	private Date time;
	private boolean success;
	private String message;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}


