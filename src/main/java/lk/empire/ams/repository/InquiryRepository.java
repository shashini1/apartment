package lk.empire.ams.repository;

import lk.empire.ams.dao.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InquiryRepository extends JpaRepository<Inquiry, Integer> {
}
