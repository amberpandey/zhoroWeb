/**
 * 
 */
package work.zhoro.zhoroWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import work.zhoro.zhoroWeb.models.Config;
import work.zhoro.zhoroWeb.operations.ConfigOperations;
import work.zhoro.zhoroWeb.request.MainRequest;
import work.zhoro.zhoroWeb.response.ConfigResponse;

/**
 * @author Amber
 *
 */
@CrossOrigin(origins = "*", maxAge = 36000)
@RestController

public class ZhoroConfigController {

	@Autowired
	private ConfigOperations configOperations;
	@RequestMapping(value = "/config", method = RequestMethod.GET)
	public HttpEntity<ConfigResponse> getConfig(){
		MainRequest request= new MainRequest();
		ConfigResponse response;
		try {
			response = configOperations.doWork(request, ConfigResponse.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response= new ConfigResponse();
			response.setSuccess(false);
			response.setMessage("Internal Server Error");
			return new ResponseEntity<ConfigResponse>(response, HttpStatus.METHOD_FAILURE);
		}
		return new ResponseEntity<ConfigResponse>(response, HttpStatus.OK);
	}

}
