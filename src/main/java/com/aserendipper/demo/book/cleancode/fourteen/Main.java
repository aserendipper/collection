package com.aserendipper.demo.book.cleancode.fourteen;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        State state = State.valueOf(State.NEW.name());
        state.run();
        ArgumentMarshaler am = new StringArgumentMarshaler();
        Optional.ofNullable(am).map(s -> s.toString());
    }
}
