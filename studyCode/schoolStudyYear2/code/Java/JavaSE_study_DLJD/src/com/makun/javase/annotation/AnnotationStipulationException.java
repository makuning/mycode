package com.makun.javase.annotation;

// 自定义异常，注解规定异常，运行时异常
public class AnnotationStipulationException  extends RuntimeException {
    public AnnotationStipulationException() {
        super();
    }
    public AnnotationStipulationException(String information) {
        super(information);
    }
}
