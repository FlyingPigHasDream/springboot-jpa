package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import springboot.bean.Cat;
import springboot.service.CatService;

/**
 * @author rainyday
 * @createTime 2018/7/2.
 */
@RestController
@RequestMapping("/cat")
public class CatController {

    @Autowired
    private CatService catService;

    @PostMapping("/save")
    public void save(@RequestParam(required = false) Cat  cat) {
        if (StringUtils.isEmpty(cat)) {
            cat = new Cat();
            cat.setCatName("jack");
        }
        cat.setCatAge(3);
        catService.save(cat);
    }

    @RequestMapping("delete")
    public String delete() {
        catService.delete(1);
        return "delete ok!";
    }

    public Iterable<Cat> getAll() {
        return catService.getAll();
    }

}
