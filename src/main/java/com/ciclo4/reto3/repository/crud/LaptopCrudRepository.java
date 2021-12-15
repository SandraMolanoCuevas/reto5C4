package com.ciclo4.reto3.repository.crud;

import com.ciclo4.reto3.model.Laptop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface LaptopCrudRepository extends MongoRepository<Laptop, String> {
    public List<Laptop> findByPriceLessThanEqual(double precio);

    // Reto 5

    @Query("{'description':{'$regex':'?0':'i'}}")
    public List<Laptop> findByDescriptionLike(String description);

}
