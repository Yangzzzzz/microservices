package com.micro.spider.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;

public class AnnotationInstanceTest {
    @Test
    public void test_01() throws NoSuchFieldException {
        Annotation annotation = AnnotationInstance.class.getDeclaredField("id").getAnnotation(AnnotationTest.class);
        AnnotationTest annotationTest = (AnnotationTest) annotation;
        int id = annotationTest.id();
        System.out.println(id);



    }
}
