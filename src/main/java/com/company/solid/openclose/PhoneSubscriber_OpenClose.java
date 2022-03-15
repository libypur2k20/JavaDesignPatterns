package com.company.solid.openclose;

import java.util.List;

public class PhoneSubscriber_OpenClose extends Subscriber{

    // Open for extension
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

}