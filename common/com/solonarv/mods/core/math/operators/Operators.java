package com.solonarv.mods.core.math.operators;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.base.Function;

public class Operators {
    public static <T> Function<Pair<T, T>, T> asFunction(final IOperator<T> op){
        return new Function<Pair<T,T>, T>(){
            public T apply(Pair<T, T> args){
                return op.apply(args.getLeft(), args.getRight());
            }
        };
    }
}
