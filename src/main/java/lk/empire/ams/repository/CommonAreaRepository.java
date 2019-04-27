package lk.empire.ams.repository;

import lk.empire.ams.dao.CommonArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CommonAreaRepository extends JpaRepository<CommonArea, Integer>{

    CommonArea save(CommonArea commonArea);

}
