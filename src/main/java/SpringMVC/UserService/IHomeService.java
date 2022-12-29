package SpringMVC.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dto.ProductsDto;
import SpringMVC.Entity.Categorys;
import SpringMVC.Entity.Menus;
import SpringMVC.Entity.Slides;
@Service
public interface IHomeService {
	@Autowired
	public List<Slides> getDataSlides();
	
	@Autowired
	public List<Categorys> getDataCategorys();
	
	@Autowired
	public List<Menus> getDataMenus();
	
	@Autowired
	public List<ProductsDto> GetDataNewProducts();
	
	@Autowired
	public List<ProductsDto> GetDataHighProducts();
}
