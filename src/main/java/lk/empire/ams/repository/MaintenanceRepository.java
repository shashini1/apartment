package lk.empire.ams.repository;

import lk.empire.ams.dao.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer>{
}
