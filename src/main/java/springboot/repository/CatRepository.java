package springboot.repository;


import org.springframework.data.repository.CrudRepository;
import springboot.bean.Cat;


public interface CatRepository extends CrudRepository<Cat, Integer>{
}
