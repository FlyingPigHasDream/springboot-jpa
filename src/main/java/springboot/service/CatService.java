package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.bean.Cat;
import springboot.repository.CatRepository;

/**
 * @author rainyday
 * @createTime 2018/7/2.
 */
@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    @Transactional
    public void save(Cat cat) {
        catRepository.save(cat);
    }

    @Transactional
    public void delete(int id) {
        catRepository.deleteById(id);
    }


    @Cacheable("getAll")
    public Iterable<Cat> getAll() {
        System.out.println("no use cache");
        return catRepository.findAll();
    }
}
