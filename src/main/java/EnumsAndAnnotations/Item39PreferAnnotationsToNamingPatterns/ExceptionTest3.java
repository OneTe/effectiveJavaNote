package EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by wangcheng  on 2018/4/8.
 */
//Annotation type with an array parameter

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest3 {
    Class<? extends Exception>[] value();
}
