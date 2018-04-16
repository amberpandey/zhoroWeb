/**
 * 
 */
package work.zhoro.zhoroWeb.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import work.zhoro.zhoroWeb.DAO.ConfigDao;
import work.zhoro.zhoroWeb.models.Config;
import work.zhoro.zhoroWeb.services.ConfigService;

/**
 * @author Amber
 *
 */
@Transactional
@Service("configService")
public class ConfigServiceImpl implements ConfigService{
	@Autowired
	private ConfigDao configDao;
	public List<Config> getConfig(){
		return configDao.getConfig();	
	}
}
