/**
 * 
 */
package work.zhoro.zhoroWeb.operations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Amber
 *
 */
@Component("predictionOperations")
public class PredictionOperations {
	@Autowired
	private ConfigOperations configOperations;
}
