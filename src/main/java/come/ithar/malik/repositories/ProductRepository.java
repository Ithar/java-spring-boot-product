package come.ithar.malik.repositories;

import come.ithar.malik.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
