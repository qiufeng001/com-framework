package com.framework.core.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.TYPE}) 
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Label {
	public String value();
}
