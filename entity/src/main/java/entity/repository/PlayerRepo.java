package entity.repository;

import entity.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayerRepo extends MongoRepository <Player, Long> {
}
