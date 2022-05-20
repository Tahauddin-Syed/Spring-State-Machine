package com.tahauddin.syed;

import com.tahauddin.syed.domain.PaymentEvent;
import com.tahauddin.syed.domain.PaymentState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;

import java.util.UUID;

@SpringBootTest
class SpringStateMachineApplicationTests {

	@Autowired
	StateMachineFactory<PaymentState, PaymentEvent> factory;

	@Test
	void testStateMachineFactory() {

		StateMachine<PaymentState, PaymentEvent> stateMachine =
				factory.getStateMachine(UUID.randomUUID());

		stateMachine.start();
		System.out.println(stateMachine.getState().toString());

		stateMachine.sendEvent(PaymentEvent.PRE_AUTHORIZE);
		System.out.println(stateMachine.getState().toString());

		stateMachine.sendEvent(PaymentEvent.PRE_AUTHORIZE_APPROVED);
		System.out.println(stateMachine.getState().toString());

		stateMachine.sendEvent(PaymentEvent.PRE_AUTHORIZE_DECLINE);
		System.out.println(stateMachine.getState().toString());

	}
}
