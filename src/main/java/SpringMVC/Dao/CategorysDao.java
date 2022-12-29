package SpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import SpringMVC.Entity.Categorys;
import SpringMVC.Entity.MapperCategorys;
@Repository
public class CategorysDao {
	
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<Categorys> getDataCategorys(){
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categorys";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
	}
}
