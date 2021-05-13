package com.easycodingnow.demo.annotation;

import java.lang.annotation.*;



@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DocMethod {
    boolean required() default true;
}
