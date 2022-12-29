package SpringMVC.UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Entity.Users;
import SpringMVC.UserService.AccountServiceImpl;

@Controller
public class UserController extends BaseController{
	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	
	@RequestMapping(value = "/dang-ky", method = RequestMethod.GET)
	public ModelAndView Resgiter() {
		_mvSahre.setViewName("user/account/register");
		_mvSahre.addObject("user", new Users());
		return _mvSahre;
		
	}
	
	@RequestMapping(value = "/dang-ky", method = RequestMethod.POST)
	public ModelAndView CreateAcc(@ModelAttribute("user") Users user) {
		int count = accountService.AddAccount(user);
		if(count>0) {
			_mvSahre.addObject("status", "ok");
		}
		else {
			_mvSahre.addObject("status", "fail");
		}
		_mvSahre.setViewName("user/account/register");
		_mvSahre.addObject("status", true);
		return _mvSahre;
		
	}
	@RequestMapping(value = "/dang-nhap", method = RequestMethod.POST)
	public ModelAndView Login(HttpSession session,@ModelAttribute("user") Users user) {
		user = accountService.CheckAccount(user);
		if(user != null) {
			_mvSahre.setViewName("redirect:trang-chu");
			session.setAttribute("LoginInfo", user);
		}
		else {
			_mvSahre.addObject("statusLogin", "fail");
		}
		return _mvSahre;
		
	}
	@RequestMapping(value = "/dang-xuat", method = RequestMethod.GET)
	public String Login(HttpSession session, HttpServletRequest request) {
		session.removeAttribute("LoginInfo");
		return "redirect:"+request.getHeader("Referer");
		
	}
	
	
	
}
