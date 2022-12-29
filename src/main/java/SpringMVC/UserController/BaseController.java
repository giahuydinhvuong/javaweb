package SpringMVC.UserController;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.UserService.HomeServiceImpl;
@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService ;
	
	public ModelAndView _mvSahre = new ModelAndView();
	
	@PostConstruct
	public ModelAndView Init() {
		_mvSahre.addObject("menus", _homeService.getDataMenus());
		return _mvSahre;
		
	}
}
