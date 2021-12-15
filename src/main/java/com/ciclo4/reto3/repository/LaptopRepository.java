package com.ciclo4.reto3.repository;

import com.ciclo4.reto3.model.Laptop;
import com.ciclo4.reto3.repository.crud.LaptopCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LaptopRepository {

    @Autowired
    private LaptopCrudRepository laptopCrudRepository;

    public List<Laptop> getAll() {
        return laptopCrudRepository.findAll();
    }

    public Optional<Laptop> getLaptop(String id) {
        return laptopCrudRepository.findById(id);
    }

    public Laptop create(Laptop laptop) {
        return laptopCrudRepository.save(laptop);
    }

    public void update(Laptop laptop) {
        laptopCrudRepository.save(laptop);
    }

    public void delete(Laptop laptop) {
        laptopCrudRepository.delete(laptop);
    }

    // Reto 5
    public List<Laptop> gadgetsByPrice(double precio) {
        return laptopCrudRepository.findByPriceLessThanEqual(precio);
    }

    // Reto 5
    public List<Laptop> findByDescriptionLike(String description) {
        return laptopCrudRepository.findByDescriptionLike(description);
    }

    public Optional<Laptop> getLaptop(Integer id) {
        return null;
    }

}
