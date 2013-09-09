package com.solonarv.mods.core.math.operators;

public class IntegerOperators {
    public static IOperator<Integer>
        ADD = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return a + b; }},
        SUB = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return a - b; }},
        MUL = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return a * b; }},
        DIV = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return a / b; }},
        MOD = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return a % b; }},
        EXP = new IOperator<Integer>() {
            public Integer apply(Integer a, Integer b){
                if(b < 0) throw new IllegalArgumentException("Can't raise integers to negative powers!");
                if(b == 0) return 1;
                if(a == 0 || a == 1 || b == 1) return a;
                return a * this.apply(a, b - 1);
            }
        }
        ;;
    public static class Bitwise{
        public static IOperator<Integer>
        OR  = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return a | b; }},
        AND = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return a & b; }},
        XOR = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return a ^ b; }},
        IF  = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return b | ~a; }},
        IFF = new IOperator<Integer>() { public Integer apply(Integer a, Integer b){ return (a & b) |~ (a | b); }}
        ;;
    }
}
