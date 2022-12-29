package SpringMVC.UserService;

import java.util.List;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.ProductsDto;

@Service
public interface ICategoryService {
	public List<ProductsDto> GetAllProductsByID(int id);
}
