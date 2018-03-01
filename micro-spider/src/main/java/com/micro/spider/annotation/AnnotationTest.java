package com.micro.spider.annotation;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationTest {
    int id() default 1;
    String name() default "1";
}
