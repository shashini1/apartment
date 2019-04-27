package lk.empire.ams.repository;

import lk.empire.ams.dao.Contractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContractorRepository extends JpaRepository<Contractor, Integer>{
}
