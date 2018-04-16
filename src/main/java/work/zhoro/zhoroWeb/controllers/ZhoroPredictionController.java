/**
 * 
 */
package work.zhoro.zhoroWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import work.zhoro.zhoroWeb.scheduler.TaskSchedular;
import work.zhoro.zhoroWeb.services.PredictionService;

/**
 * @author Amber
 *
 */
@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping(value = "/predictions")
public class ZhoroPredictionController {
	@Autowired
	private PredictionService predictionService;
	@Autowired
	private TaskSchedular taskSchedular;
	@RequestMapping(value = "/getDailyPrediction", method = RequestMethod.GET)
	public String getDailyPrediction(@RequestParam("sign") String zodiac,@RequestParam("hday") int day,@RequestParam("hmonth") int month,@RequestParam("hyear") int year) {
	String prediction = "";
	prediction=predictionService.getTodayPrediction(zodiac, day, month, year);
	taskSchedular.beepForAnHour();
	return prediction;
	}
}
