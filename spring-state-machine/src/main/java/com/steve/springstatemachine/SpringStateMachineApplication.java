package com.steve.springstatemachine;

import com.steve.springstatemachine.state.Events;
import com.steve.springstatemachine.state.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class SpringStateMachineApplication {



	public static void main(String[] args) throws InterruptedException {

		ApplicationContext context = SpringApplication.run(SpringStateMachineApplication.class, args);
		context.getBean(Start.class).test();
	}
}
