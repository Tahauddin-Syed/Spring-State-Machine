package com.tahauddin.syed.service;

import com.tahauddin.syed.domain.Payment;
import com.tahauddin.syed.domain.PaymentEvent;
import com.tahauddin.syed.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declinePayment(Long paymentId);


}
