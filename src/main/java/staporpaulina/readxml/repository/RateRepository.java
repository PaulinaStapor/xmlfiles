package staporpaulina.readxml.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import staporpaulina.readxml.model.RateModel;
@Repository
public interface RateRepository extends JpaRepository<RateModel, Long> {
}
