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

package com.pacoworks.rxpartialapplication;

import java.util.concurrent.Callable;

import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;

/**
 * Helper class to apply partial application to Functions in order to get a version with lower
 * arity.
 *
 * @author pakoito
 */
public final class RxPartialFunction {
    private RxPartialFunction() {
        // No instances
    }

    /* Callable */
    public static <A, R> Callable<R> apply(final Function<A, R> func1, final A first) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func1.apply(first);
            }
        };
    }

    public static <A, B, R> Callable<R> apply(final BiFunction<A, B, R> func2, final A first, final B second) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func2.apply(first, second);
            }
        };
    }

    public static <A, B, C, R> Callable<R> apply(final Function3<A, B, C, R> func3, final A first,
            final B second, final C third) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func3.apply(first, second, third);
            }
        };
    }

    public static <A, B, C, D, R> Callable<R> apply(final Function4<A, B, C, D, R> func4, final A first,
            final B second, final C third, final D fourth) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func4.apply(first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, R> Callable<R> apply(final Function5<A, B, C, D, E, R> func5,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func5.apply(first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, R> Callable<R> apply(final Function6<A, B, C, D, E, F, R> func6,
            final A first, final B second, final C third, final D fourth, final E fifth,
            final F sixth) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func6.apply(first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, R> Callable<R> apply(
            final Function7<A, B, C, D, E, F, G, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func7.apply(first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, R> Callable<R> apply(
            final Function8<A, B, C, D, E, F, G, H, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func8.apply(first, second, third, fourth, fifth, sixth, seventh, eighth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, I, R> Callable<R> apply(
            final Function9<A, B, C, D, E, F, G, H, I, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth, final I ninth) {
        return new Callable<R>() {
            @Override
            public R call() throws Exception {
                return func9.apply(first, second, third, fourth, fifth, sixth, seventh, eighth,
                        ninth);
            }
        };
    }

    /* Function */
    public static <A, T, R> Function<T, R> apply(final BiFunction<A, T, R> func2, final A first) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func2.apply(first, last);
            }
        };
    }

    public static <A, T, R> Function<T, R> applyEnd(final BiFunction<T, A, R> func2, final A first) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func2.apply(last, first);
            }
        };
    }

    public static <A, B, T, R> Function<T, R> apply(final Function3<A, B, T, R> func3, final A first,
            final B second) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func3.apply(first, second, last);
            }
        };
    }

    public static <A, B, T, R> Function<T, R> applyEnd(final Function3<T, A, B, R> func3, final A first,
            final B second) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func3.apply(last, first, second);
            }
        };
    }

    public static <A, B, C, T, R> Function<T, R> apply(final Function4<A, B, C, T, R> func4,
            final A first, final B second, final C third) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func4.apply(first, second, third, last);
            }
        };
    }

    public static <A, B, C, T, R> Function<T, R> applyEnd(final Function4<T, A, B, C, R> func4,
            final A first, final B second, final C third) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func4.apply(last, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, R> Function<T, R> apply(final Function5<A, B, C, D, T, R> func5,
            final A first, final B second, final C third, final D fourth) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func5.apply(first, second, third, fourth, last);
            }
        };
    }

    public static <A, B, C, D, T, R> Function<T, R> applyEnd(final Function5<T, A, B, C, D, R> func5,
            final A first, final B second, final C third, final D fourth) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func5.apply(last, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, R> Function<T, R> apply(final Function6<A, B, C, D, E, T, R> func6,
            final A first, final B second, final C third, final D fourth, final E fifth) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func6.apply(first, second, third, fourth, fifth, last);
            }
        };
    }

    public static <A, B, C, D, E, T, R> Function<T, R> applyEnd(
            final Function6<T, A, B, C, D, E, R> func6, final A first, final B second, final C third,
            final D fourth, final E fifth) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func6.apply(last, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, R> Function<T, R> apply(
            final Function7<A, B, C, D, E, F, T, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func7.apply(first, second, third, fourth, fifth, sixth, last);
            }
        };
    }

    public static <A, B, C, D, E, F, T, R> Function<T, R> applyEnd(
            final Function7<T, A, B, C, D, E, F, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func7.apply(last, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, R> Function<T, R> apply(
            final Function8<A, B, C, D, E, F, G, T, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func8.apply(first, second, third, fourth, fifth, sixth, seventh, last);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, R> Function<T, R> applyEnd(
            final Function8<T, A, B, C, D, E, F, G, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func8.apply(last, first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, T, R> Function<T, R> apply(
            final Function9<A, B, C, D, E, F, G, H, T, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func9
                        .apply(first, second, third, fourth, fifth, sixth, seventh, eighth, last);
            }
        };
    }

    public static <A, B, C, D, E, F, G, H, T, R> Function<T, R> applyEnd(
            final Function9<T, A, B, C, D, E, F, G, H, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh,
            final H eighth) {
        return new Function<T, R>() {
            @Override
            public R apply(T last) throws Exception {
                return func9
                        .apply(last, first, second, third, fourth, fifth, sixth, seventh, eighth);
            }
        };
    }

    /* BiFunction */
    public static <A, T, U, R> BiFunction<T, U, R> apply(final Function3<A, T, U, R> func3, final A first) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func3.apply(first, one, two);
            }
        };
    }

    public static <A, T, U, R> BiFunction<T, U, R> applyEnd(final Function3<T, U, A, R> func3,
            final A first) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func3.apply(one, two, first);
            }
        };
    }

    public static <A, B, T, U, R> BiFunction<T, U, R> apply(final Function4<A, B, T, U, R> func4,
            final A first, final B second) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func4.apply(first, second, one, two);
            }
        };
    }

    public static <A, B, T, U, R> BiFunction<T, U, R> applyEnd(final Function4<T, U, A, B, R> func4,
            final A first, final B second) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func4.apply(one, two, first, second);
            }
        };
    }

    public static <A, B, C, T, U, R> BiFunction<T, U, R> apply(final Function5<A, B, C, T, U, R> func5,
            final A first, final B second, final C third) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func5.apply(first, second, third, one, two);
            }
        };
    }

    public static <A, B, C, T, U, R> BiFunction<T, U, R> applyEnd(final Function5<T, U, A, B, C, R> func5,
            final A first, final B second, final C third) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func5.apply(one, two, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, R> BiFunction<T, U, R> apply(
            final Function6<A, B, C, D, T, U, R> func6, final A first, final B second, final C third,
            final D fourth) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func6.apply(first, second, third, fourth, one, two);
            }
        };
    }

    public static <A, B, C, D, T, U, R> BiFunction<T, U, R> applyEnd(
            final Function6<T, U, A, B, C, D, R> func6, final A first, final B second, final C third,
            final D fourth) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func6.apply(one, two, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, R> BiFunction<T, U, R> apply(
            final Function7<A, B, C, D, E, T, U, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func7.apply(first, second, third, fourth, fifth, one, two);
            }
        };
    }

    public static <A, B, C, D, E, T, U, R> BiFunction<T, U, R> applyEnd(
            final Function7<T, U, A, B, C, D, E, R> func7, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func7.apply(one, two, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, R> BiFunction<T, U, R> apply(
            final Function8<A, B, C, D, E, F, T, U, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func8.apply(first, second, third, fourth, fifth, sixth, one, two);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, R> BiFunction<T, U, R> applyEnd(
            final Function8<T, U, A, B, C, D, E, F, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func8.apply(one, two, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, U, R> BiFunction<T, U, R> apply(
            final Function9<A, B, C, D, E, F, G, T, U, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func9.apply(first, second, third, fourth, fifth, sixth, seventh, one, two);
            }
        };
    }

    public static <A, B, C, D, E, F, G, T, U, R> BiFunction<T, U, R> applyEnd(
            final Function9<T, U, A, B, C, D, E, F, G, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth, final G seventh) {
        return new BiFunction<T, U, R>() {
            @Override
            public R apply(T one, U two) throws Exception {
                return func9.apply(one, two, first, second, third, fourth, fifth, sixth, seventh);
            }
        };
    }

    /* Function3 */
    public static <A, T, U, V, R> Function3<T, U, V, R> apply(final Function4<A, T, U, V, R> func4,
            final A first) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func4.apply(first, one, two, three);
            }
        };
    }

    public static <A, T, U, V, R> Function3<T, U, V, R> applyEnd(final Function4<T, U, V, A, R> func4,
            final A first) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func4.apply(one, two, three, first);
            }
        };
    }

    public static <A, B, T, U, V, R> Function3<T, U, V, R> apply(final Function5<A, B, T, U, V, R> func5,
            final A first, final B second) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func5.apply(first, second, one, two, three);
            }
        };
    }

    public static <A, B, T, U, V, R> Function3<T, U, V, R> applyEnd(
            final Function5<T, U, V, A, B, R> func5, final A first, final B second) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func5.apply(one, two, three, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, R> Function3<T, U, V, R> apply(
            final Function6<A, B, C, T, U, V, R> func6, final A first, final B second, final C third) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func6.apply(first, second, third, one, two, three);
            }
        };
    }

    public static <A, B, C, T, U, V, R> Function3<T, U, V, R> applyEnd(
            final Function6<T, U, V, A, B, C, R> func6, final A first, final B second, final C third) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func6.apply(one, two, three, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, R> Function3<T, U, V, R> apply(
            final Function7<A, B, C, D, T, U, V, R> func7, final A first, final B second,
            final C third, final D fourth) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func7.apply(first, second, third, fourth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, T, U, V, R> Function3<T, U, V, R> applyEnd(
            final Function7<T, U, V, A, B, C, D, R> func7, final A first, final B second,
            final C third, final D fourth) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func7.apply(one, two, three, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, R> Function3<T, U, V, R> apply(
            final Function8<A, B, C, D, E, T, U, V, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func8.apply(first, second, third, fourth, fifth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, R> Function3<T, U, V, R> applyEnd(
            final Function8<T, U, V, A, B, C, D, E, R> func8, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func8.apply(one, two, three, first, second, third, fourth, fifth);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, V, R> Function3<T, U, V, R> apply(
            final Function9<A, B, C, D, E, F, T, U, V, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func9.apply(first, second, third, fourth, fifth, sixth, one, two, three);
            }
        };
    }

    public static <A, B, C, D, E, F, T, U, V, R> Function3<T, U, V, R> applyEnd(
            final Function9<T, U, V, A, B, C, D, E, F, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth, final F sixth) {
        return new Function3<T, U, V, R>() {
            @Override
            public R apply(T one, U two, V three) throws Exception {
                return func9.apply(one, two, three, first, second, third, fourth, fifth, sixth);
            }
        };
    }

    /* Function4 */
    public static <A, T, U, V, W, R> Function4<T, U, V, W, R> apply(
            final Function5<A, T, U, V, W, R> func5, final A first) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func5.apply(first, one, two, three, four);
            }
        };
    }

    public static <A, T, U, V, W, R> Function4<T, U, V, W, R> applyEnd(
            final Function5<T, U, V, W, A, R> func5, final A first) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func5.apply(one, two, three, four, first);
            }
        };
    }

    public static <A, B, T, U, V, W, R> Function4<T, U, V, W, R> apply(
            final Function6<A, B, T, U, V, W, R> func6, final A first, final B second) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func6.apply(first, second, one, two, three, four);
            }
        };
    }

    public static <A, B, T, U, V, W, R> Function4<T, U, V, W, R> applyEnd(
            final Function6<T, U, V, W, A, B, R> func6, final A first, final B second) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func6.apply(one, two, three, four, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, R> Function4<T, U, V, W, R> apply(
            final Function7<A, B, C, T, U, V, W, R> func7, final A first, final B second, final C third) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func7.apply(first, second, third, one, two, three, four);
            }
        };
    }

    public static <A, B, C, T, U, V, W, R> Function4<T, U, V, W, R> applyEnd(
            final Function7<T, U, V, W, A, B, C, R> func7, final A first, final B second, final C third) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func7.apply(one, two, three, four, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, R> Function4<T, U, V, W, R> apply(
            final Function8<A, B, C, D, T, U, V, W, R> func8, final A first, final B second,
            final C third, final D fourth) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func8.apply(first, second, third, fourth, one, two, three, four);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, R> Function4<T, U, V, W, R> applyEnd(
            final Function8<T, U, V, W, A, B, C, D, R> func8, final A first, final B second,
            final C third, final D fourth) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func8.apply(one, two, three, four, first, second, third, fourth);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, W, R> Function4<T, U, V, W, R> apply(
            final Function9<A, B, C, D, E, T, U, V, W, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func9.apply(first, second, third, fourth, fifth, one, two, three, four);
            }
        };
    }

    public static <A, B, C, D, E, T, U, V, W, R> Function4<T, U, V, W, R> applyEnd(
            final Function9<T, U, V, W, A, B, C, D, E, R> func9, final A first, final B second,
            final C third, final D fourth, final E fifth) {
        return new Function4<T, U, V, W, R>() {
            @Override
            public R apply(T one, U two, V three, W four) throws Exception {
                return func9.apply(one, two, three, four, first, second, third, fourth, fifth);
            }
        };
    }

    /* Function5 */
    public static <A, T, U, V, W, X, R> Function5<T, U, V, W, X, R> apply(
            final Function6<A, T, U, V, W, X, R> func6, final A first) {
        return new Function5<T, U, V, W, X, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five) throws Exception {
                return func6.apply(first, one, two, three, four, five);
            }
        };
    }

    public static <A, T, U, V, W, X, R> Function5<T, U, V, W, X, R> applyEnd(
            final Function6<T, U, V, W, X, A, R> func6, final A first) {
        return new Function5<T, U, V, W, X, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five) throws Exception {
                return func6.apply(one, two, three, four, five, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, R> Function5<T, U, V, W, X, R> apply(
            final Function7<A, B, T, U, V, W, X, R> func7, final A first, final B second) {
        return new Function5<T, U, V, W, X, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five) throws Exception {
                return func7.apply(first, second, one, two, three, four, five);
            }
        };
    }

    public static <A, B, T, U, V, W, X, R> Function5<T, U, V, W, X, R> applyEnd(
            final Function7<T, U, V, W, X, A, B, R> func7, final A first, final B second) {
        return new Function5<T, U, V, W, X, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five) throws Exception {
                return func7.apply(one, two, three, four, five, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, R> Function5<T, U, V, W, X, R> apply(
            final Function8<A, B, C, T, U, V, W, X, R> func8, final A first, final B second,
            final C third) {
        return new Function5<T, U, V, W, X, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five) throws Exception {
                return func8.apply(first, second, third, one, two, three, four, five);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, R> Function5<T, U, V, W, X, R> applyEnd(
            final Function8<T, U, V, W, X, A, B, C, R> func8, final A first, final B second,
            final C third) {
        return new Function5<T, U, V, W, X, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five) throws Exception {
                return func8.apply(one, two, three, four, five, first, second, third);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, X, R> Function5<T, U, V, W, X, R> apply(
            final Function9<A, B, C, D, T, U, V, W, X, R> func9, final A first, final B second,
            final C third, final D fourth) {
        return new Function5<T, U, V, W, X, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five) throws Exception {
                return func9.apply(first, second, third, fourth, one, two, three, four, five);
            }
        };
    }

    public static <A, B, C, D, T, U, V, W, X, R> Function5<T, U, V, W, X, R> applyEnd(
            final Function9<T, U, V, W, X, A, B, C, D, R> func9, final A first, final B second,
            final C third, final D fourth) {
        return new Function5<T, U, V, W, X, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five) throws Exception {
                return func9.apply(one, two, three, four, five, first, second, third, fourth);
            }
        };
    }

    /* Function6 */
    public static <A, T, U, V, W, X, Y, R> Function6<T, U, V, W, X, Y, R> apply(
            final Function7<A, T, U, V, W, X, Y, R> func7, final A first) {
        return new Function6<T, U, V, W, X, Y, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six) throws Exception {
                return func7.apply(first, one, two, three, four, five, six);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, R> Function6<T, U, V, W, X, Y, R> applyEnd(
            final Function7<T, U, V, W, X, Y, A, R> func7, final A first) {
        return new Function6<T, U, V, W, X, Y, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six) throws Exception {
                return func7.apply(one, two, three, four, five, six, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, R> Function6<T, U, V, W, X, Y, R> apply(
            final Function8<A, B, T, U, V, W, X, Y, R> func8, final A first, final B second) {
        return new Function6<T, U, V, W, X, Y, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six) throws Exception {
                return func8.apply(first, second, one, two, three, four, five, six);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, R> Function6<T, U, V, W, X, Y, R> applyEnd(
            final Function8<T, U, V, W, X, Y, A, B, R> func8, final A first, final B second) {
        return new Function6<T, U, V, W, X, Y, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six) throws Exception {
                return func8.apply(one, two, three, four, five, six, first, second);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, Y, R> Function6<T, U, V, W, X, Y, R> apply(
            final Function9<A, B, C, T, U, V, W, X, Y, R> func9, final A first, final B second,
            final C third) {
        return new Function6<T, U, V, W, X, Y, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six) throws Exception {
                return func9.apply(first, second, third, one, two, three, four, five, six);
            }
        };
    }

    public static <A, B, C, T, U, V, W, X, Y, R> Function6<T, U, V, W, X, Y, R> applyEnd(
            final Function9<T, U, V, W, X, Y, A, B, C, R> func9, final A first, final B second,
            final C third) {
        return new Function6<T, U, V, W, X, Y, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six) throws Exception {
                return func9.apply(one, two, three, four, five, six, first, second, third);
            }
        };
    }

    /* Function7 */
    public static <A, T, U, V, W, X, Y, Z, R> Function7<T, U, V, W, X, Y, Z, R> apply(
            final Function8<A, T, U, V, W, X, Y, Z, R> func8, final A first) {
        return new Function7<T, U, V, W, X, Y, Z, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six, Z seven) throws Exception {
                return func8.apply(first, one, two, three, four, five, six, seven);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, Z, R> Function7<T, U, V, W, X, Y, Z, R> applyEnd(
            final Function8<T, U, V, W, X, Y, Z, A, R> func8, final A first) {
        return new Function7<T, U, V, W, X, Y, Z, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six, Z seven) throws Exception {
                return func8.apply(one, two, three, four, five, six, seven, first);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, Z, R> Function7<T, U, V, W, X, Y, Z, R> apply(
            final Function9<A, B, T, U, V, W, X, Y, Z, R> func9, final A first, final B second) {
        return new Function7<T, U, V, W, X, Y, Z, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six, Z seven) throws Exception {
                return func9.apply(first, second, one, two, three, four, five, six, seven);
            }
        };
    }

    public static <A, B, T, U, V, W, X, Y, Z, R> Function7<T, U, V, W, X, Y, Z, R> applyEnd(
            final Function9<T, U, V, W, X, Y, Z, A, B, R> func9, final A first, final B second) {
        return new Function7<T, U, V, W, X, Y, Z, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six, Z seven) throws Exception {
                return func9.apply(one, two, three, four, five, six, seven, first, second);
            }
        };
    }

    /* Function8 */
    public static <A, T, U, V, W, X, Y, Z, P, R> Function8<T, U, V, W, X, Y, Z, P, R> apply(
            final Function9<A, T, U, V, W, X, Y, Z, P, R> func9, final A first) {
        return new Function8<T, U, V, W, X, Y, Z, P, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six, Z seven, P eight) throws Exception {
                return func9.apply(first, one, two, three, four, five, six, seven, eight);
            }
        };
    }

    public static <A, T, U, V, W, X, Y, Z, P, R> Function8<T, U, V, W, X, Y, Z, P, R> applyEnd(
            final Function9<T, U, V, W, X, Y, Z, P, A, R> func9, final A first) {
        return new Function8<T, U, V, W, X, Y, Z, P, R>() {
            @Override
            public R apply(T one, U two, V three, W four, X five, Y six, Z seven, P eight) throws Exception {
                return func9.apply(one, two, three, four, five, six, seven, eight, first);
            }
        };
    }
}
