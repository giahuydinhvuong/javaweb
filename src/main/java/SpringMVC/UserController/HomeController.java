package SpringMVC.UserController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController extends BaseController{
	
	
	
	@RequestMapping(value = {"/","/trang-chu"}, method = RequestMethod.GET)
	public ModelAndView Index() {
		_mvSahre.addObject("slides", _homeService.getDataSlides());
		_mvSahre.addObject("categorys", _homeService.getDataCategorys());
		_mvSahre.addObject("products", _homeService.GetDataNewProducts());
		_mvSahre.addObject("highproducts", _homeService.GetDataHighProducts());
		_mvSahre.setViewName("user/index");
		return _mvSahre;
	}
	
//	@RequestMapping(value = "/san-pham")
//	public ModelAndView Product() {
//		ModelAndView mv = new ModelAndView("user/product");
//		return mv;
//	}
}
