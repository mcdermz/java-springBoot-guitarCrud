package guitarCrud;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by seanmcdermott on 5/19/17.
 */
public interface GuitarRepository extends CrudRepository<Guitar, Long>{
    List<Guitar> findByBrand(String brand);
}
