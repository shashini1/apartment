package lk.empire.ams.repository;

import lk.empire.ams.dao.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
