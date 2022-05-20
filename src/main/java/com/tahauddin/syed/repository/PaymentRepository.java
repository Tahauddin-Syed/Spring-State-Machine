package com.tahauddin.syed.repository;

import com.tahauddin.syed.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {


}
