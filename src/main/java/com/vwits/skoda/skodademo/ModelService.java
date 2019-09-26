package com.vwits.skoda.skodademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;

@Service
public class ModelService  {
    @Autowired
    ModelRepository repo;

    public List<Model> getAllEmployees() {
        List<Model> employees = new ArrayList<Model>();
        repo.findAll().forEach(model -> employees.add(model));
        return employees;
    }

    public Model searchById(long id) {
        return repo.findById(id).get();
    }

    public void saveOrUpdate(Model model) {
        repo.save(model);
    }
    public void delete(long id) {
        repo.deleteById(id);
    }


}
