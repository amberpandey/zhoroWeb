/**
 * 
 */
package work.zhoro.zhoroWeb.operations;

import org.springframework.stereotype.Component;

import work.zhoro.zhoroWeb.request.RegisterRequest;
import work.zhoro.zhoroWeb.response.RegisterResponse;

/**
 * @author Amber
 *
 */
@Component("registerOperations")
public class RegisterOperations extends MainOperation<RegisterRequest, RegisterResponse>{

	/* (non-Javadoc)
	 * @see work.zhoro.zhoroWeb.operations.MainOperation#validate(work.zhoro.zhoroWeb.request.MainRequest, work.zhoro.zhoroWeb.response.MainResponse)
	 */
	@Override
	public boolean validate(RegisterRequest request, RegisterResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see work.zhoro.zhoroWeb.operations.MainOperation#doWork(work.zhoro.zhoroWeb.request.MainRequest, work.zhoro.zhoroWeb.response.MainResponse)
	 */
	@Override
	public void doWork(RegisterRequest request, RegisterResponse response) {
		// TODO Auto-generated method stub
		
	}

}
