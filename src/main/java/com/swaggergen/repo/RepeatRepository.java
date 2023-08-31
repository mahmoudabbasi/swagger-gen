package com.swaggergen.repo;

import com.openapi.gen.springboot.dto.Repeat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author mabbasi
 */
@Repository
public interface RepeatRepository extends MongoRepository<Repeat,Integer> {

    List<Repeat> findByNationalId(String nationalId) ;

}
