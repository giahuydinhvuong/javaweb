package SpringMVC.UserService;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto getInforPaginates(int totalData, int limit, int currentPage) ;
}
