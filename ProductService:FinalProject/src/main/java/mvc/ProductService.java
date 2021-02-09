package mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll() { //going to return a list of product called LIstAll
		return repo.findAll(); //call method Findalll from our ProductRepository interface that will return a list of all products
	}
	
	public Long get(Long id) {
		//		return repo.findById(id).get();
		return repo.findOne(id).getId();
	}
	
	public Product save(Product product) {
		return repo.save(product);
	}
	public void delete (Long id) {
		repo.delete(id);
	}

	
	//public void delete (Long id) {
	//repo.deleteById(id);
}
