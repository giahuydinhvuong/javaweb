package SpringMVC.UserService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.BillsDao;
import SpringMVC.Dto.CartDto;
import SpringMVC.Entity.BillDetail;
import SpringMVC.Entity.Bills;

@Service
public class BillsServiceImpl implements IBillsService {

	
	@Autowired
	private BillsDao billsDao;
	
	
	public int AddBills(Bills bill) {
		// TODO Auto-generated method stub
		return billsDao.AddBills(bill);
	}

	public void AddBillDetail(HashMap<Long, CartDto> carts) {
		long idBills = billsDao.GetIDLastBills();
		
		for(Map.Entry<Long, CartDto> itemCart: carts.entrySet()) {
			BillDetail billDetail = new BillDetail();
			billDetail.setId_bills(idBills);
			billDetail.setId_product(itemCart.getValue().getProduct().getId_product());
			billDetail.setQuanty(itemCart.getValue().getQuanty());
			billDetail.setTotal(itemCart.getValue().getTotalPrice());
			billsDao.AddBillsDetail(billDetail);
		}
			
		
	}

}
