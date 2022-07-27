package entity.repository;

import entity.model.Table;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TableRepo extends MongoRepository<Table, Long> {

}
