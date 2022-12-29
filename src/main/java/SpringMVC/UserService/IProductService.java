package SpringMVC.UserService;

import java.util.List;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.ProductsDto;
@Service
public interface IProductService {

    public ProductsDto GetProductByID(long id);
	
	public List<ProductsDto> GetProductByIDCategory(int id);
}
