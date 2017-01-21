/*
 * Copyright (c) pakoito 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pacoworks.rxpartialapplication2;

import hu.akarnokd.rxjava2.functions.Consumer3;
import hu.akarnokd.rxjava2.functions.Consumer4;
import hu.akarnokd.rxjava2.functions.Consumer5;
import hu.akarnokd.rxjava2.functions.Consumer6;
import hu.akarnokd.rxjava2.functions.Consumer7;
import hu.akarnokd.rxjava2.functions.Consumer8;
import hu.akarnokd.rxjava2.functions.Consumer9;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;

/**
 * Helper class to apply partial application to Consumers in order to get a version with lower arity.
 *
 * @author pakoito
 */
public final class RxPartialConsumer {
    private RxPartialConsumer() {
    }

    /* Action */
    public static <A> Action apply(final Consumer<A> action1, final A first) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action1.accept(first);
            }
        };
    }

    public static <A, B> Action apply(final BiConsumer<A, B> action2, final A first, final B second) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action2.accept(first, second);
            }
        };
    }

    public static <A, B, C> Action apply(final Consumer3<A, B, C> action3, final A first,
                                            final B second, final C third) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action3.accept(first, second, third);
            }
        };
    }

    public static <A, B, C, D> Action apply(final Consumer4<A, B, C, D> action4, final A first,
                                               final B second, final C third, final D fourth) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action4.accept(first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E> Action apply(final Consumer5<A, B, C, D, E> action5,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action5.accept(first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F> Action apply(final Consumer6<A, B, C, D, E, F> action6,
            final A first, final B second, final C third, final D fourth, final E fifth,
            final F sixth) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action6.accept(first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G> Action apply(final Consumer7<A, B, C, D, E, F, G> action7,
            final A first, final B second, final C third, final D fourth, final E fifth,
            final F sixth, final G seventh) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action7.accept(first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H> Action apply(
            final Consumer8<A, B, C, D, E, F, G, H> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action8.accept(first, second, third, fourth, fifth, sixth, seventh, eighth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, I> Action apply(
            final Consumer9<A, B, C, D, E, F, G, H, I> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth, final I ninth) {
        return new Action() {
            @Override
            public void run() throws Exception {
                action9.accept(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth);
            }
        };
    }

    /* Consumer */
    public static <A, T> Consumer<T> apply(final BiConsumer<A, T> action2, final A first) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action2.accept(first, last);
            }
        };
    }

    public static <A, T> Consumer<T> applyEnd(final BiConsumer<T, A> action2, final A first) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action2.accept(last, first);
            }
        };
    }

    public static <A, B, T> Consumer<T> apply(final Consumer3<A, B, T> action3, final A first,
            final B second) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action3.accept(first, second, last);
            }
        };
    }

    public static <A, B, T> Consumer<T> applyEnd(final Consumer3<T, A, B> action3, final A first,
            final B second) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action3.accept(last, first, second);
            }
        };
    }

    public static <A, B, C, T> Consumer<T> apply(final Consumer4<A, B, C, T> action4, final A first,
            final B second, final C third) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action4.accept(first, second, third, last);
            }
        };
    }

    public static <A, B, C, T> Consumer<T> applyEnd(final Consumer4<T, A, B, C> action4,
            final A first, final B second, final C third) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action4.accept(last, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T> Consumer<T> apply(final Consumer5<A, B, C, D, T> action5,
            final A first, final B second, final C third, final D fourth) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action5.accept(first, second, third, fourth, last);
            }
        };
    }

    public static <A, B, C, D, T> Consumer<T> applyEnd(final Consumer5<T, A, B, C, D> action5,
            final A first, final B second, final C third, final D fourth) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action5.accept(last, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T> Consumer<T> apply(final Consumer6<A, B, C, D, E, T> action6,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action6.accept(first, second, third, fourth, fifth, last);
            }
        };
    }

    public static <A, B, C, D, E, T> Consumer<T> applyEnd(final Consumer6<T, A, B, C, D, E> action6,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action6.accept(last, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T> Consumer<T> apply(
            final Consumer7<A, B, C, D, E, F, T> action7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action7.accept(first, second, third, fourth, fifth, sixth, last);
            }
        };
    }

    public static <A, B, C, D, E, F, T> Consumer<T> applyEnd(
            final Consumer7<T, A, B, C, D, E, F> action7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action7.accept(last, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T> Consumer<T> apply(
            final Consumer8<A, B, C, D, E, F, G, T> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action8.accept(first, second, third, fourth, fifth, sixth, seventh, last);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T> Consumer<T> applyEnd(
            final Consumer8<T, A, B, C, D, E, F, G> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action8.accept(last, first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, T> Consumer<T> apply(
            final Consumer9<A, B, C, D, E, F, G, H, T> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action9.accept(first, second, third, fourth, fifth, sixth, seventh, eighth, last);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, T> Consumer<T> applyEnd(
            final Consumer9<T, A, B, C, D, E, F, G, H> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Consumer<T>() {
            @Override
            public void accept(T last) throws Exception {
                action9.accept(last, first, second, third, fourth, fifth, sixth, seventh, eighth);
            }
        };
    }

    /* BiConsumer */
    public static <A, T, U> BiConsumer<T, U> apply(final Consumer3<A, T, U> action3, final A first) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action3.accept(first, one, two);
            }
        };
    }

    public static <A, T, U> BiConsumer<T, U> applyEnd(final Consumer3<T, U, A> action3, final A first) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action3.accept(one, two, first);
            }
        };
    }

    public static <A, B, T, U> BiConsumer<T, U> apply(final Consumer4<A, B, T, U> action4,
            final A first, final B second) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action4.accept(first, second, one, two);
            }
        };
    }

    public static <A, B, T, U> BiConsumer<T, U> applyEnd(final Consumer4<T, U, A, B> action4,
            final A first, final B second) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action4.accept(one, two, first, second);
            }
        };
    }

    public static <A, B, C, T, U> BiConsumer<T, U> apply(final Consumer5<A, B, C, T, U> action5,
            final A first, final B second, final C third) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action5.accept(first, second, third, one, two);
            }
        };
    }

    public static <A, B, C, T, U> BiConsumer<T, U> applyEnd(final Consumer5<T, U, A, B, C> action5,
            final A first, final B second, final C third) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action5.accept(one, two, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U> BiConsumer<T, U> apply(final Consumer6<A, B, C, D, T, U> action6,
            final A first, final B second, final C third, final D fourth) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action6.accept(first, second, third, fourth, one, two);
            }
        };
    }

    public static <A, B, C, D, T, U> BiConsumer<T, U> applyEnd(
            final Consumer6<T, U, A, B, C, D> action6, final A first, final B second, final C third,
            final D fourth) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action6.accept(one, two, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U> BiConsumer<T, U> apply(
            final Consumer7<A, B, C, D, E, T, U> action7, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action7.accept(first, second, third, fourth, fifth, one, two);
            }
        };
    }

    public static <A, B, C, D, E, T, U> BiConsumer<T, U> applyEnd(
            final Consumer7<T, U, A, B, C, D, E> action7, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action7.accept(one, two, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U> BiConsumer<T, U> apply(
            final Consumer8<A, B, C, D, E, F, T, U> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action8.accept(first, second, third, fourth, fifth, sixth, one, two);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U> BiConsumer<T, U> applyEnd(
            final Consumer8<T, U, A, B, C, D, E, F> action8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action8.accept(one, two, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, U> BiConsumer<T, U> apply(
            final Consumer9<A, B, C, D, E, F, G, T, U> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action9.accept(first, second, third, fourth, fifth, sixth, seventh, one, two);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, U> BiConsumer<T, U> applyEnd(
            final Consumer9<T, U, A, B, C, D, E, F, G> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new BiConsumer<T, U>() {
            @Override
            public void accept(T one, U two) throws Exception {
                action9.accept(one, two, first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    /* Consumer3 */
    public static <A, T, U, V> Consumer3<T, U, V> apply(final Consumer4<A, T, U, V> action4,
            final A first) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action4.accept(first, one, two, three);
            }
        };
    }

    public static <A, T, U, V> Consumer3<T, U, V> applyEnd(final Consumer4<T, U, V, A> action4,
            final A first) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action4.accept(one, two, three, first);
            }
        };
    }

    public static <A, B, T, U, V> Consumer3<T, U, V> apply(final Consumer5<A, B, T, U, V> action5,
            final A first, final B second) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action5.accept(first, second, one, two, three);
            }
        };
    }

    public static <A, B, T, U, V> Consumer3<T, U, V> applyEnd(final Consumer5<T, U, V, A, B> action5,
            final A first, final B second) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action5.accept(one, two, three, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V> Consumer3<T, U, V> apply(
            final Consumer6<A, B, C, T, U, V> action6, final A first, final B second, final C third) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action6.accept(first, second, third, one, two, three);
            }
        };
    }

    public static <A, B, C, T, U, V> Consumer3<T, U, V> applyEnd(
            final Consumer6<T, U, V, A, B, C> action6, final A first, final B second, final C third) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action6.accept(one, two, three, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V> Consumer3<T, U, V> apply(
            final Consumer7<A, B, C, D, T, U, V> action7, final A first, final B second,
            final C third, final D fourth) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action7.accept(first, second, third, fourth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, T, U, V> Consumer3<T, U, V> applyEnd(
            final Consumer7<T, U, V, A, B, C, D> action7, final A first, final B second,
            final C third, final D fourth) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action7.accept(one, two, three, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V> Consumer3<T, U, V> apply(
            final Consumer8<A, B, C, D, E, T, U, V> action8, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action8.accept(first, second, third, fourth, fifth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V> Consumer3<T, U, V> applyEnd(
            final Consumer8<T, U, V, A, B, C, D, E> action8, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action8.accept(one, two, three, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, V> Consumer3<T, U, V> apply(
            final Consumer9<A, B, C, D, E, F, T, U, V> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action9.accept(first, second, third, fourth, fifth, sixth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, V> Consumer3<T, U, V> applyEnd(
            final Consumer9<T, U, V, A, B, C, D, E, F> action9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Consumer3<T, U, V>() {
            @Override
            public void accept(T one, U two, V three) throws Exception {
                action9.accept(one, two, three, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    /* Consumer4 */
    public static <A, T, U, V, W> Consumer4<T, U, V, W> apply(final Consumer5<A, T, U, V, W> action5,
            final A first) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action5.accept(first, one, two, three, four);
            }
        };
    }

    public static <A, T, U, V, W> Consumer4<T, U, V, W> applyEnd(
            final Consumer5<T, U, V, W, A> action5, final A first) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action5.accept(one, two, three, four, first);
            }
        };
    }

    public static <A, B, T, U, V, W> Consumer4<T, U, V, W> apply(
            final Consumer6<A, B, T, U, V, W> action6, final A first, final B second) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action6.accept(first, second, one, two, three, four);
            }
        };
    }

    public static <A, B, T, U, V, W> Consumer4<T, U, V, W> applyEnd(
            final Consumer6<T, U, V, W, A, B> action6, final A first, final B second) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action6.accept(one, two, three, four, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W> Consumer4<T, U, V, W> apply(
            final Consumer7<A, B, C, T, U, V, W> action7, final A first, final B second, final C third) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action7.accept(first, second, third, one, two, three, four);
            }
        };
    }

    public static <A, B, C, T, U, V, W> Consumer4<T, U, V, W> applyEnd(
            final Consumer7<T, U, V, W, A, B, C> action7, final A first, final B second, final C third) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action7.accept(one, two, three, four, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W> Consumer4<T, U, V, W> apply(
            final Consumer8<A, B, C, D, T, U, V, W> action8, final A first, final B second,
            final C third, final D fourth) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action8.accept(first, second, third, fourth, one, two, three, four);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W> Consumer4<T, U, V, W> applyEnd(
            final Consumer8<T, U, V, W, A, B, C, D> action8, final A first, final B second,
            final C third, final D fourth) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action8.accept(one, two, three, four, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, W> Consumer4<T, U, V, W> apply(
            final Consumer9<A, B, C, D, E, T, U, V, W> action9, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action9.accept(first, second, third, fourth, fifth, one, two, three, four);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, W> Consumer4<T, U, V, W> applyEnd(
            final Consumer9<T, U, V, W, A, B, C, D, E> action9, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Consumer4<T, U, V, W>() {
            @Override
            public void accept(T one, U two, V three, W four) throws Exception {
                action9.accept(one, two, three, four, first, second, third, fourth, fifth);
            }
        };
    }

    /* Consumer5 */
    public static <A, T, U, V, W, X> Consumer5<T, U, V, W, X> apply(
            final Consumer6<A, T, U, V, W, X> action6, final A first) {
        return new Consumer5<T, U, V, W, X>() {
            @Override
            public void accept(T one, U two, V three, W four, X five) throws Exception {
                action6.accept(first, one, two, three, four, five);
            }
        };
    }

    public static <A, T, U, V, W, X> Consumer5<T, U, V, W, X> applyEnd(
            final Consumer6<T, U, V, W, X, A> action6, final A first) {
        return new Consumer5<T, U, V, W, X>() {
            @Override
            public void accept(T one, U two, V three, W four, X five) throws Exception {
                action6.accept(one, two, three, four, five, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X> Consumer5<T, U, V, W, X> apply(
            final Consumer7<A, B, T, U, V, W, X> action7, final A first, final B second) {
        return new Consumer5<T, U, V, W, X>() {
            @Override
            public void accept(T one, U two, V three, W four, X five) throws Exception {
                action7.accept(first, second, one, two, three, four, five);
            }
        };
    }

    public static <A, B, T, U, V, W, X> Consumer5<T, U, V, W, X> applyEnd(
            final Consumer7<T, U, V, W, X, A, B> action7, final A first, final B second) {
        return new Consumer5<T, U, V, W, X>() {
            @Override
            public void accept(T one, U two, V three, W four, X five) throws Exception {
                action7.accept(one, two, three, four, five, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X> Consumer5<T, U, V, W, X> apply(
            final Consumer8<A, B, C, T, U, V, W, X> action8, final A first, final B second,
            final C third) {
        return new Consumer5<T, U, V, W, X>() {
            @Override
            public void accept(T one, U two, V three, W four, X five) throws Exception {
                action8.accept(first, second, third, one, two, three, four, five);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X> Consumer5<T, U, V, W, X> applyEnd(
            final Consumer8<T, U, V, W, X, A, B, C> action8, final A first, final B second,
            final C third) {
        return new Consumer5<T, U, V, W, X>() {
            @Override
            public void accept(T one, U two, V three, W four, X five) throws Exception {
                action8.accept(one, two, three, four, five, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, X> Consumer5<T, U, V, W, X> apply(
            final Consumer9<A, B, C, D, T, U, V, W, X> action9, final A first, final B second,
            final C third, final D fourth) {
        return new Consumer5<T, U, V, W, X>() {
            @Override
            public void accept(T one, U two, V three, W four, X five) throws Exception {
                action9.accept(first, second, third, fourth, one, two, three, four, five);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, X> Consumer5<T, U, V, W, X> applyEnd(
            final Consumer9<T, U, V, W, X, A, B, C, D> action9, final A first, final B second,
            final C third, final D fourth) {
        return new Consumer5<T, U, V, W, X>() {
            @Override
            public void accept(T one, U two, V three, W four, X five) throws Exception {
                action9.accept(one, two, three, four, five, first, second, third, fourth);
            }
        };
    }

    /* Consumer6 */
    public static <A, T, U, V, W, X, Y> Consumer6<T, U, V, W, X, Y> apply(
            final Consumer7<A, T, U, V, W, X, Y> action7, final A first) {
        return new Consumer6<T, U, V, W, X, Y>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six) throws Exception {
                action7.accept(first, one, two, three, four, five, six);
            }
        };
    }

    public static <A, T, U, V, W, X, Y> Consumer6<T, U, V, W, X, Y> applyEnd(
            final Consumer7<T, U, V, W, X, Y, A> action7, final A first) {
        return new Consumer6<T, U, V, W, X, Y>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six) throws Exception {
                action7.accept(one, two, three, four, five, six, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y> Consumer6<T, U, V, W, X, Y> apply(
            final Consumer8<A, B, T, U, V, W, X, Y> action8, final A first, final B second) {
        return new Consumer6<T, U, V, W, X, Y>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six) throws Exception {
                action8.accept(first, second, one, two, three, four, five, six);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y> Consumer6<T, U, V, W, X, Y> applyEnd(
            final Consumer8<T, U, V, W, X, Y, A, B> action8, final A first, final B second) {
        return new Consumer6<T, U, V, W, X, Y>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six) throws Exception {
                action8.accept(one, two, three, four, five, six, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, Y> Consumer6<T, U, V, W, X, Y> apply(
            final Consumer9<A, B, C, T, U, V, W, X, Y> action9, final A first, final B second,
            final C third) {
        return new Consumer6<T, U, V, W, X, Y>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six) throws Exception {
                action9.accept(first, second, third, one, two, three, four, five, six);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, Y> Consumer6<T, U, V, W, X, Y> applyEnd(
            final Consumer9<T, U, V, W, X, Y, A, B, C> action9, final A first, final B second,
            final C third) {
        return new Consumer6<T, U, V, W, X, Y>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six) throws Exception {
                action9.accept(one, two, three, four, five, six, first, second, third);
            }
        };
    }

    /* Consumer7 */
    public static <A, T, U, V, W, X, Y, Z> Consumer7<T, U, V, W, X, Y, Z> apply(
            final Consumer8<A, T, U, V, W, X, Y, Z> action8, final A first) {
        return new Consumer7<T, U, V, W, X, Y, Z>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six, Z seven) throws Exception {
                action8.accept(first, one, two, three, four, five, six, seven);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, Z> Consumer7<T, U, V, W, X, Y, Z> applyEnd(
            final Consumer8<T, U, V, W, X, Y, Z, A> action8, final A first) {
        return new Consumer7<T, U, V, W, X, Y, Z>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six, Z seven) throws Exception {
                action8.accept(one, two, three, four, five, six, seven, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, Z> Consumer7<T, U, V, W, X, Y, Z> apply(
            final Consumer9<A, B, T, U, V, W, X, Y, Z> action9, final A first, final B second) {
        return new Consumer7<T, U, V, W, X, Y, Z>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six, Z seven) throws Exception {
                action9.accept(first, second, one, two, three, four, five, six, seven);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, Z> Consumer7<T, U, V, W, X, Y, Z> applyEnd(
            final Consumer9<T, U, V, W, X, Y, Z, A, B> action9, final A first, final B second) {
        return new Consumer7<T, U, V, W, X, Y, Z>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six, Z seven) throws Exception {
                action9.accept(one, two, three, four, five, six, seven, first, second);
            }
        };
    }

    /* Consumer8 */
    public static <A, T, U, V, W, X, Y, Z, P> Consumer8<T, U, V, W, X, Y, Z, P> apply(
            final Consumer9<A, T, U, V, W, X, Y, Z, P> action9, final A first) {
        return new Consumer8<T, U, V, W, X, Y, Z, P>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six, Z seven, P eight) throws Exception {
                action9.accept(first, one, two, three, four, five, six, seven, eight);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, Z, P> Consumer8<T, U, V, W, X, Y, Z, P> applyEnd(
            final Consumer9<T, U, V, W, X, Y, Z, P, A> action9, final A first) {
        return new Consumer8<T, U, V, W, X, Y, Z, P>() {
            @Override
            public void accept(T one, U two, V three, W four, X five, Y six, Z seven, P eight) throws Exception {
                action9.accept(one, two, three, four, five, six, seven, eight, first);
            }
        };
    }
}
