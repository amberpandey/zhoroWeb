/**
 * 
 */
package work.zhoro.zhoroWeb.response;

import java.util.List;

import work.zhoro.zhoroWeb.models.Config;

/**
 * @author Amber
 *
 */
public class ConfigResponse extends MainResponse {
	private List<Config> config;

	/**
	 * @return the config
	 */
	public List<Config> getConfig() {
		return config;
	}

	/**
	 * @param config the config to set
	 */
	public void setConfig(List<Config> config) {
		this.config = config;
	}
}
