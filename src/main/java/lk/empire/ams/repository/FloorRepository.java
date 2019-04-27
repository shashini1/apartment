package lk.empire.ams.repository;

import lk.empire.ams.dao.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends JpaRepository<Floor, Integer> {

    public Floor getAllByApartment_Id(int apartmentID);

    Floor save(Floor user);
}
