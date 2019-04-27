package lk.empire.ams.repository;

import lk.empire.ams.dao.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UnitRepository extends JpaRepository<Unit, Integer>{
}
