package khang.lor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import khang.lor.entity.Product;
import khang.lor.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductServices {
	@Autowired
	private ProductRepository repo;

	public ProductServiceImpl(ProductRepository repo) {
		this.repo = repo;

	}

	@Override
	public List<Product> listAll() {
		return repo.findAll();
	}

	@Override
	public Product save(Product product) {
		return repo.save(product);
	}

	@Override
	public Product get(Long id) {
		return repo.findById(id).get();

	}

	@Override
	public void delete(Long id) {
		repo.deleteById(id);
	}
}