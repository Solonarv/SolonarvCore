package com.solonarv.mods.core.math.operators;

public abstract class BooleanOperators{
    public static IOperator<Boolean>
        OR  = new IOperator<Boolean>() { public Boolean apply(Boolean a, Boolean b) { return a || b; }},
        AND = new IOperator<Boolean>() { public Boolean apply(Boolean a, Boolean b) { return a && b; }},
        XOR = new IOperator<Boolean>() { public Boolean apply(Boolean a, Boolean b) { return a ^ b; }},
        IF  = new IOperator<Boolean>() { public Boolean apply(Boolean a, Boolean b) { return b || !a; }},
        IFF = new IOperator<Boolean>() { public Boolean apply(Boolean a, Boolean b) { return (b && a) || !(b || a); }}
        ;;
}
