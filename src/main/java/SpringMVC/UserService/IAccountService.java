package SpringMVC.UserService;

import org.springframework.stereotype.Service;

import SpringMVC.Entity.Users;

@Service
public interface IAccountService {
	public int AddAccount(Users user);
	
	public Users CheckAccount(Users user);
}
