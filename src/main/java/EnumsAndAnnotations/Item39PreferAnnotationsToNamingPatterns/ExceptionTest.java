package EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated method is a test method that
 * must throw the designated exception to succeed.
 *
 * Created by wangcheng  on 2018/4/8.
 */
//Annotation type with a parameter

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ExceptionTest {
    Class<? extends Throwable> value();
}
