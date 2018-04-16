/**
 * 
 */
package work.zhoro.zhoroWeb.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * @author Amber
 *
 */
@Entity
@Table(name = "Predictions")
public class Predictions {
	@EmbeddedId
	private PredictionsPK predictionPK;
	@Column(name="predicDate")
	private Date predicDate;
	@Column(name="TodayPredic")
	private String todayPredic;
	@Column(name="WeekPredic")
	private String weekPredic;
	@Column(name="MonthPredic")
	private String monthPredic;
	@Column(name="hits")
	private String hits;
	@Embeddable
	public class PredictionsPK implements Serializable {
		@GeneratedValue
		@Column(name = "sno")
		protected int sno;
		@Column(name="zodiac")
		protected String zodiac;

	    public PredictionsPK() {}

	    public PredictionsPK(Integer sno, String zodiac) {
	        this.sno = sno;
	        this.zodiac = zodiac;
	    }
	    // equals, hashCode
	}
	/**
	 * @return the predicDate
	 */
	public Date getPredicDate() {
		return predicDate;
	}
	/**
	 * @param predicDate the predicDate to set
	 */
	public void setPredicDate(Date predicDate) {
		this.predicDate = predicDate;
	}
	/**
	 * @return the todayPredic
	 */
	public String getTodayPredic() {
		return todayPredic;
	}
	/**
	 * @return the predictionPK
	 */
	public PredictionsPK getPredictionPK() {
		return predictionPK;
	}
	/**
	 * @param predictionPK the predictionPK to set
	 */
	public void setPredictionPK(PredictionsPK predictionPK) {
		this.predictionPK = predictionPK;
	}
	/**
	 * @param todayPredic the todayPredic to set
	 */
	public void setTodayPredic(String todayPredic) {
		this.todayPredic = todayPredic;
	}
	/**
	 * @return the weekPredic
	 */
	public String getWeekPredic() {
		return weekPredic;
	}
	/**
	 * @param weekPredic the weekPredic to set
	 */
	public void setWeekPredic(String weekPredic) {
		this.weekPredic = weekPredic;
	}
	/**
	 * @return the monthPredic
	 */
	public String getMonthPredic() {
		return monthPredic;
	}
	/**
	 * @param monthPredic the monthPredic to set
	 */
	public void setMonthPredic(String monthPredic) {
		this.monthPredic = monthPredic;
	}
	/**
	 * @return the hits
	 */
	public String getHits() {
		return hits;
	}
	/**
	 * @param hits the hits to set
	 */
	public void setHits(String hits) {
		this.hits = hits;
	}
}
