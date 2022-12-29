package SpringMVC.AdminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.UserController.BaseController;
@Controller
public class AdminController extends BaseController {
	
	@RequestMapping(value = "/quan-tri/")
	public ModelAndView Index() {
		_mvSahre.setViewName("admin/index");
		return _mvSahre;
	}

}
