package SpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import SpringMVC.Entity.MapperMenus;
import SpringMVC.Entity.Menus;
@Repository
public class MenusDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Menus> getDataMenus(){
		List<Menus> list = new ArrayList<Menus>();
		String sql ="SELECT * FROM menus";
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}

}
