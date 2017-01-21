
package com.pacoworks.rxpartialapplication2;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import hu.akarnokd.rxjava2.functions.Consumer3;
import hu.akarnokd.rxjava2.functions.Consumer6;
import hu.akarnokd.rxjava2.functions.Consumer9;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class RxPartialConsumerTest {
    private static final Consumer6 ACTION_6 = new Consumer6() {
        @Override
        public void accept(Object o, Object o2, Object o3, Object o4, Object o5, Object o6) {
        }
    };

    private static final Consumer9 ACTION_9 = new Consumer9() {
        @Override
        public void accept(Object o, Object o2, Object o3, Object o4, Object o5, Object o6,
                Object o7, Object o8, Object o9) {
        }
    };

    @Test
    public void apply() throws Exception {
        List<Consumer3> consumers = Observable
                .fromArray(RxPartialConsumer.apply(ACTION_6, 1, 2, 3))
                .ofType(Consumer3.class).toList().blockingGet();
        Assert.assertEquals(1, consumers.size());
        List<Action> actions = Observable
                .fromArray(RxPartialConsumer.apply(ACTION_9, 1, 2, 3, 4, 5, 6, 7, 8, 9))
                .ofType(Action.class).toList().blockingGet();
        Assert.assertEquals(1, actions.size());
    }

    @Test
    public void applyEnd() throws Exception {
        List<Consumer3> consumers = Observable
                .fromArray(RxPartialConsumer.applyEnd(ACTION_6, 1, 2, 3))
                .ofType(Consumer3.class).toList().blockingGet();
        Assert.assertEquals(1, consumers.size());
        List<Consumer> actions = Observable
                .fromArray(RxPartialConsumer.applyEnd(ACTION_9, 1, 2, 3, 4, 5, 6, 7, 8))
                .ofType(Consumer.class).toList().blockingGet();
        Assert.assertEquals(1, actions.size());
    }
}
