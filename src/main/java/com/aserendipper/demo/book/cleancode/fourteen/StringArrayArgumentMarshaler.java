package com.aserendipper.demo.book.cleancode.fourteen;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    private String[] strings = null;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            strings = new String[]{parameter};
        } catch (NoSuchElementException e) {
            throw new ArgsException(ArgsException.ErrorCode.MISSING_INTEGER);
        } catch (NumberFormatException e) {
            throw new ArgsException(ArgsException.ErrorCode.INVALID_INTEGER, parameter);
        }
    }

    public static String[] getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArrayArgumentMarshaler) {
            return ((StringArrayArgumentMarshaler)am).strings;
        } else {
            return null;
        }
    }
}
