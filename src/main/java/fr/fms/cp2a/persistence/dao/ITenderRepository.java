package fr.fms.cp2a.persistence.dao;

import fr.fms.cp2a.persistence.model.Tender;
import org.springframework.data.repository.CrudRepository;

public interface ITenderRepository extends CrudRepository<Tender, Long> {
}
