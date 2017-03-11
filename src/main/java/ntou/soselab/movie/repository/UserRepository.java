package ntou.soselab.movie.repository;


import ntou.soselab.movie.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
