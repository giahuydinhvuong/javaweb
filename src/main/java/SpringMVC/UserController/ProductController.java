package SpringMVC.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.UserService.IProductService;

@Controller
public class ProductController  extends BaseController {
	@Autowired
	private IProductService _productService;
	
	@RequestMapping(value = { "chi-tiet-san-pham/{id}" })
	public ModelAndView Index(@PathVariable long id) {
		_mvSahre.setViewName("user/products/product");
		_mvSahre.addObject("categorys", _homeService.getDataCategorys());
		_mvSahre.addObject("product", _productService.GetProductByID(id));
		int idCategory = _productService.GetProductByID(id).getId_category();
		_mvSahre.addObject("productByIDCategory", _productService.GetProductByIDCategory(idCategory));
		return _mvSahre;
	}
}
