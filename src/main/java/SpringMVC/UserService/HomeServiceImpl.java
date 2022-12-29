package SpringMVC.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.CategorysDao;
import SpringMVC.Dao.MenusDao;
import SpringMVC.Dao.ProductsDao;
import SpringMVC.Dao.SlidesDao;
import SpringMVC.Dto.ProductsDto;
import SpringMVC.Entity.Categorys;
import SpringMVC.Entity.Menus;
import SpringMVC.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService{

	
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorydDao;
	@Autowired
	private MenusDao menuDao;
	@Autowired
	private ProductsDao productsDao;

	public List<Slides> getDataSlides() {
		// TODO Auto-generated method stub
		return slidesDao.getDataSlides();
	}


	public List<Categorys> getDataCategorys() {
		// TODO Auto-generated method stub
		return categorydDao.getDataCategorys();
	}
	
	public List<Menus> getDataMenus() {
		// TODO Auto-generated method stub
		return menuDao.getDataMenus();
	}
	
	public List<ProductsDto> GetDataNewProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataNewProducts();
		listProducts.get(0).getId_color();
		return listProducts;
	}
	
	public List<ProductsDto> GetDataHighProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataHighProducts();
		listProducts.get(0).getId_color();
		return listProducts;
	}
	
	

	
}
