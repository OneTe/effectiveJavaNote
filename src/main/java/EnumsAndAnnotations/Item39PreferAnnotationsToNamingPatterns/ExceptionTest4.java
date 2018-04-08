package EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns;

import java.lang.annotation.*;
//Java8 中增加了@Repeatable注解,代替ExceptionTest3中数组类型
/**
 * Created by wangcheng  on 2018/4/8.
 */
// Repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ExceptionTestContainer.class)
public @interface ExceptionTest4 {
    Class<? extends Exception> value();
}
