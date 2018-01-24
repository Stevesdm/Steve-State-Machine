package com.steve.springstatemachine.state;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/24 下午3:06
 */
public enum States {

    UNPAID,                 // 待支付
    WAITING_FOR_RECEIVE,    // 待收货
    DONE                    // 结束
}
