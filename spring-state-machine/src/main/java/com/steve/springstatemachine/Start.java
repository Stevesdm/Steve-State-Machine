package com.steve.springstatemachine;

import com.steve.springstatemachine.state.Events;
import com.steve.springstatemachine.state.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/24 下午3:14
 */
@Component
public class Start {

    @Autowired
    private StateMachine<States, Events> stateMachine;

    public void test() throws InterruptedException {
        stateMachine.start();
        Thread.sleep(3000);
        stateMachine.sendEvent(Events.PAY);
        Thread.sleep(3000);
        stateMachine.sendEvent(Events.RECEIVE);
    }
}
