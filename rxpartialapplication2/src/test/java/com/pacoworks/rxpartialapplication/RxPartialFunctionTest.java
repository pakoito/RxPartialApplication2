
package com.pacoworks.rxpartialapplication;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function9;

public class RxPartialFunctionTest {
    private static final Function6 ACTION_6 = new Function6() {
        @Override
        public Object apply(Object o, Object o2, Object o3, Object o4, Object o5, Object o6) {
            return "";
        }
    };

    private static final Function9 ACTION_9 = new Function9() {
        @Override
        public Object apply(Object o, Object o2, Object o3, Object o4, Object o5, Object o6,
                Object o7, Object o8, Object o9) {
            return "";
        }
    };

    @Test
    public void apply() throws Exception {
        List<Function3> functions = Observable
                .fromArray(RxPartialFunction.apply(ACTION_6, 1, 2, 3))
                .ofType(Function3.class).toList().blockingGet();
        Assert.assertEquals(1, functions.size());
        List<Callable> callables = Observable
                .fromArray(RxPartialFunction.apply(ACTION_9, 1, 2, 3, 4, 5, 6, 7, 8, 9))
                .ofType(Callable.class).toList().blockingGet();
        Assert.assertEquals(1, callables.size());
    }

    @Test
    public void applyEnd() throws Exception {
        List<Function3> functions = Observable
                .fromArray(RxPartialFunction.applyEnd(ACTION_6, 1, 2, 3))
                .ofType(Function3.class).toList().blockingGet();
        Assert.assertEquals(1, functions.size());
        List<Function> callables = Observable
                .fromArray(RxPartialFunction.applyEnd(ACTION_9, 1, 2, 3, 4, 5, 6, 7, 8))
                .ofType(Function.class).toList().blockingGet();
        Assert.assertEquals(1, callables.size());
    }
}
