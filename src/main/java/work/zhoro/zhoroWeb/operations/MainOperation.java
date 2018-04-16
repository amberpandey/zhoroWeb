/**
 * 
 */
package work.zhoro.zhoroWeb.operations;

import java.util.Date;

import work.zhoro.zhoroWeb.request.MainRequest;
import work.zhoro.zhoroWeb.response.MainResponse;

/**
 * @author Amber
 *
 */
public abstract class MainOperation <X extends MainRequest, Y extends MainResponse> {
	public Y doWork(final X request, Class<Y> clazz) throws Exception {
		final Y response = clazz.newInstance();
		response.setTime(new Date());
		boolean success = validate(request, response);
		if (success) {
			doWork(request, response);
		}
		return response;
	}

	public abstract boolean validate(X request, Y response);

	public abstract void doWork(X request, Y response);

}
