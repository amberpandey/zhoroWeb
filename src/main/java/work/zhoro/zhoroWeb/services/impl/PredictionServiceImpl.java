/**
 * 
 */
package work.zhoro.zhoroWeb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.zhoro.zhoroWeb.services.PredictionService;
import work.zhoro.zhoroWeb.ws.interaction.PredictionInteraction;

/**
 * @author Amber
 *
 */
@Service("predictionService")
public class PredictionServiceImpl implements PredictionService{

	@Autowired
	PredictionInteraction predictionInteraction;
	/* (non-Javadoc)
	 * @see work.zhoro.zhoroWeb.services.PredictionService#getTodayPrediction()
	 */
	@Override
	public String getTodayPrediction(String zodiac,int day, int month, int year) {
		// TODO Auto-generated method stub
		System.out.println("In get today prediction");
		String response= predictionInteraction.fetchTodayPrediction(zodiac, day, month, year);
		return response;
	}

}
