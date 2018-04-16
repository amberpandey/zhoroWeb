/**
 * Package implements all Interaction with the web service
 */
package work.zhoro.zhoroWeb.ws.interaction;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author Amber
 * Class Interact with the web service providing all predictions
 *
 */
@PropertySource(value = { "classpath:application.properties" })
@Component("predictionInteraction")
public class PredictionInteraction {
	@Autowired
	private Environment environment;
	/**
	 * Fetch prediction for the given date
	 * @param zodiac
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public String fetchTodayPrediction(String zodiac,int day, int month, int year) {
		String dayPrediction="";
		String url= environment.getRequiredProperty("zhoro.predic.todayURL");
		InputStream is = null;
		StringBuffer sb = new StringBuffer();
        try {
            URL todayUrl = new URL(url+"sign="+zodiac+"&hday="+day+"&hmonth="+month+"&year="+year);
            URLConnection connection = todayUrl.openConnection();
            connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            is = new BufferedInputStream(connection.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine = "";
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            dayPrediction = sb.toString();
        } catch (Exception e) {
            // TODO Auto-generated catch block
        	dayPrediction = "Service Currently Unavailable!!!";
            e.printStackTrace();
        }
		return dayPrediction;
	}
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public String fetchThisMonthPrediction(int day, int month, int year) {
		String monthPrediction="";
		InputStream is = null;
		StringBuffer sb = new StringBuffer();
        try {
            URL todayUrl = new URL("");
            URLConnection connection = todayUrl.openConnection();
            connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            is = new BufferedInputStream(connection.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine = "";
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            monthPrediction = sb.toString();
        } catch (Exception e) {
            // TODO Auto-generated catch block
        	monthPrediction = "Service Currently Unavailable!!!";
            e.printStackTrace();
        }
		return monthPrediction;
	}
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public String fetchThisYearPrediction(int day, int month, int year) {
		String yearPrediction="";
		InputStream is = null;
		StringBuffer sb = new StringBuffer();
        try {
            URL todayUrl = new URL("");
            URLConnection connection = todayUrl.openConnection();
            connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            is = new BufferedInputStream(connection.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine = "";
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            yearPrediction = sb.toString();
        } catch (Exception e) {
            // TODO Auto-generated catch block
        	yearPrediction = "Service Currently Unavailable!!!";
            e.printStackTrace();
        }
		return yearPrediction;
	}
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public String fetchThisWeekPrediction(int day, int month, int year) {
		String weekPrediction="";
		InputStream is = null;
		StringBuffer sb = new StringBuffer();
        try {
            URL todayUrl = new URL("");
            URLConnection connection = todayUrl.openConnection();
            connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
            is = new BufferedInputStream(connection.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine = "";
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            weekPrediction = sb.toString();
        } catch (Exception e) {
            // TODO Auto-generated catch block
        	weekPrediction = "Service Currently Unavailable!!!";
            e.printStackTrace();
        }
		return weekPrediction;
	}
}
