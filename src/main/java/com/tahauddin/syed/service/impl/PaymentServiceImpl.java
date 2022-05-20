package com.tahauddin.syed.service.impl;    

import com.tahauddin.syed.domain.Payment;
import com.tahauddin.syed.domain.PaymentEvent;
import com.tahauddin.syed.domain.PaymentState;
import com.tahauddin.syed.repository.PaymentRepository;
import com.tahauddin.syed.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;

@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final StateMachineFactory<PaymentState, PaymentEvent> stateMachineFactory;

    @Override
    public Payment newPayment(Payment payment) {
        payment.setStae(PaymentState.NEW);
        return paymentRepository.save(payment);
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId) {

        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId) {
        return null;
    }

    @Override
    public StateMachine<PaymentState, PaymentEvent> declinePayment(Long paymentId) {
        return null;
    }
}
