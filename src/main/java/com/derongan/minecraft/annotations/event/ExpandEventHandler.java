package com.derongan.minecraft.annotations.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface ExpandEventHandler {
    boolean includeDeprecated() default false;
    String[] excludedClassnames() default {};
    String[] includedPackages() default {};
}
