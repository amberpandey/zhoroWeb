/**
 * 
 */
package work.zhoro.zhoroWeb.models;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Amber
 *
 */
@Entity
@Table(name = "pushnotification")
public class PushNotification {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private String id;
	@Column(name="gcm_regid")
	private String gcm_regId;
	@Column(name = "name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name = "created_at")
	private Time created_at;
	@Column(name="notif_status")
	private int notif_status;
	@Column(name="zodiac")
	private String zodiac;
	@Column(name = "timezone")
	private Time timezone;
	@Column(name="Date_Created")
	private int Date_Created;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the gcm_regId
	 */
	public String getGcm_regId() {
		return gcm_regId;
	}
	/**
	 * @param gcm_regId the gcm_regId to set
	 */
	public void setGcm_regId(String gcm_regId) {
		this.gcm_regId = gcm_regId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the created_at
	 */
	public Time getCreated_at() {
		return created_at;
	}
	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(Time created_at) {
		this.created_at = created_at;
	}
	/**
	 * @return the notif_status
	 */
	public int getNotif_status() {
		return notif_status;
	}
	/**
	 * @param notif_status the notif_status to set
	 */
	public void setNotif_status(int notif_status) {
		this.notif_status = notif_status;
	}
	/**
	 * @return the zodiac
	 */
	public String getZodiac() {
		return zodiac;
	}
	/**
	 * @param zodiac the zodiac to set
	 */
	public void setZodiac(String zodiac) {
		this.zodiac = zodiac;
	}
	/**
	 * @return the timezone
	 */
	public Time getTimezone() {
		return timezone;
	}
	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(Time timezone) {
		this.timezone = timezone;
	}
	/**
	 * @return the date_Created
	 */
	public int getDate_Created() {
		return Date_Created;
	}
	/**
	 * @param date_Created the date_Created to set
	 */
	public void setDate_Created(int date_Created) {
		Date_Created = date_Created;
	}
}
