package fr.fms.cp2a.persistence.dao;

import fr.fms.cp2a.persistence.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {
}
