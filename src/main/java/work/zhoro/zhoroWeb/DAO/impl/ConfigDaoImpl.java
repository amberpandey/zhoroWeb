/**
 * 
 */
package work.zhoro.zhoroWeb.DAO.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import work.zhoro.zhoroWeb.DAO.ConfigDao;
import work.zhoro.zhoroWeb.models.Config;

/**
 * @author Amber
 *
 */
@Repository("configDao")
public class ConfigDaoImpl extends ParentDaoImpl implements ConfigDao{

	/* (non-Javadoc)
	 * @see work.zhoro.zhoroWeb.DAO.ConfigDao#getConfig()
	 */
	@Override
	public List<Config> getConfig() {
		Query query = getSession().createQuery("from config");
		return query.list();
	}

}
