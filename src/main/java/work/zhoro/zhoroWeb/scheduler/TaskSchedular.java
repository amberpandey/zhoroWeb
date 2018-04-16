/**
 * 
 */
package work.zhoro.zhoroWeb.scheduler;

/**
 * @author amber
 *
 */
import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import work.zhoro.zhoroWeb.services.PredictionService;
@Component
public class TaskSchedular {
	@Autowired
	private PredictionService predictionService;
  private final ScheduledExecutorService scheduler =
    Executors.newScheduledThreadPool(1);

  public void beepForAnHour() {
    final Runnable beeper = new Runnable() {
      public void run() { 
    	  System.out.println("Inside Beeper");
    		String predic=predictionService.getTodayPrediction("Cancer", 14, 04, 2018);  
    		System.out.println(predic);
      }
    };
     final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    scheduler.scheduleAtFixedRate(beeper, 8, 8, TimeUnit.SECONDS);
  }
  
//  public static void main(String args[]) {
//	  TaskSchedular ts= new TaskSchedular() ;
//	  ts.beepForAnHour();
//  }
  
}