/**
 * 
 */
package work.zhoro.zhoroWeb.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import work.zhoro.zhoroWeb.request.MainRequest;
import work.zhoro.zhoroWeb.response.ConfigResponse;
import work.zhoro.zhoroWeb.services.ConfigService;

/**
 * @author Amber
 *
 */
@Component("configOperations")
public class ConfigOperations extends MainOperation<MainRequest, ConfigResponse>{
	@Autowired
	private ConfigService configService;
	/* (non-Javadoc)
	 * @see work.zhoro.zhoroWeb.operations.MainOperation#validate(work.zhoro.zhoroWeb.request.MainRequest, work.zhoro.zhoroWeb.response.MainResponse)
	 */
	@Override
	public boolean validate(MainRequest request, ConfigResponse response) {
		// TODO Auto-generated method stub
		return true;
	}

	/* (non-Javadoc)
	 * @see work.zhoro.zhoroWeb.operations.MainOperation#doWork(work.zhoro.zhoroWeb.request.MainRequest, work.zhoro.zhoroWeb.response.MainResponse)
	 */
	@Override
	public void doWork(MainRequest request, ConfigResponse response) {
		// TODO Auto-generated method stub
		response.setConfig(configService.getConfig());
		response.setSuccess(true);
		response.setMessage("Success");
	}


}
