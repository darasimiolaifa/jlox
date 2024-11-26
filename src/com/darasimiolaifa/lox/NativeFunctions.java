package com.darasimiolaifa.lox;

import java.util.List;

abstract class NativeFunctions {
    static class Clock implements LoxCallable {
        @Override
        public int arity() { return 0; }

        @Override
        public Object call(Interpreter interpreter, List<Object> arguments) {
            return (double)System.currentTimeMillis() / 1000.0;
        }

        @Override
        public String toString() { return "<native fn>"; }
    }
}
