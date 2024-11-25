package khang.lor.service;

import java.util.List;

import khang.lor.entity.Product;

public interface ProductServices {

	void delete(Long id);

	Product get(Long id);

	Product save(Product product);

	List<Product> listAll();
}
