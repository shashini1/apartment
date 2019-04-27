package lk.empire.ams.repository;

import lk.empire.ams.dao.ParkingSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Integer> {
}
