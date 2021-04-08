package com.jwetherell.algorithms.reflection;

import java.lang.reflect.Method;

public class TesteClass implements InterfaceB {

    public static void main(String[] args) throws NoSuchMethodException {
        for (Method m : new TesteClass().getClass().getMethods()) {
            if (m.getName().equals("teste")) {
                ReflectUtils.getAnnotations(m, Anot.class).forEach(System.out::println);
                ReflectUtils.getAnnotation(m, Anot.class).ifPresent(System.out::println);
            }

        }
    }

    @Override
    @Anot("ANBCS")
    public String teste(String a) {
        return "";
    }
}
