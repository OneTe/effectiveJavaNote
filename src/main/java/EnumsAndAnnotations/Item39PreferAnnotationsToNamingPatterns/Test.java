package EnumsAndAnnotations.Item39PreferAnnotationsToNamingPatterns;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated method is a test method.
 * Use only on parameterless static methods.
 *
 * Created by wangcheng  on 2018/4/8.
 */
//Marker annotation type declaration
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
