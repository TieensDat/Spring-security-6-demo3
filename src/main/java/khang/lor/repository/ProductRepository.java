package khang.lor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import khang.lor.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
