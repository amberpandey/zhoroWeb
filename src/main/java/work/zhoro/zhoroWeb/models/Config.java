/**
 * 
 */
package work.zhoro.zhoroWeb.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import work.zhoro.zhoroWeb.response.MainResponse;

/**
 * @author Amber
 *
 */
@Entity(name = "config")
@Table(name = "config")
public class Config {
	@Id
	@GeneratedValue
	@Column(name = "sno")
	private int sno;
	@Column(name="key")
	private String key;
	@Column(name="value")
	private String value;
	/**
	 * @return the sno
	 */
	public int getSno() {
		return sno;
	}
	/**
	 * @param sno the sno to set
	 */
	public void setSno(int sno) {
		this.sno = sno;
	}
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
