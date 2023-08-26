package Annotations.customAnnotations.classLevel;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// making class level annotation
// replace class keyword with the @interface
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ToDoGo {

}
