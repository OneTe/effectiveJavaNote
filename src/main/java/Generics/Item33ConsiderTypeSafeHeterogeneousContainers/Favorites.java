package Generics.Item33ConsiderTypeSafeHeterogeneousContainers;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by wangcheng  on 2018/3/29.
 */
//Typesafe heterogeneous container pattern - implementation
public class Favorites {
    private Map<Class<?>,Object> favorites = new HashMap<>();
    public <T> void putFavorite(Class<T> type,T instance){
        favorites.put(Objects.requireNonNull(type),instance);
    }
    // Achieving runtime type safety with a dynamic cast
    public <T> void putFavorite2(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), type.cast(instance));
    }

    public <T> T getFavorite(Class<T> type){
        return type.cast(favorites.get(type));
    }

    //Use of asSubclass to safely cast to a bounded type token
    static Annotation getAnnotation(AnnotatedElement element,String annotationTypeName){
        Class<?> annotationType = null;//Unbounded type token
        try {
            annotationType = Class.forName(annotationTypeName);
        }catch (Exception e){
            throw new IllegalArgumentException(e);
        }
        //asSubclass, and it casts the Class object on which it is called
        //to represent a subclass of the class represented by its argument.
        //If the cast succeeds, the method returns its argument; if it fails,
        //it throws a ClassCastException.
        return element.getAnnotation(annotationType.asSubclass(Annotation.class));
    }

    public static void main(String[] args){
        Favorites f = new Favorites();
        f.putFavorite(String.class,"JAVA");
        f.putFavorite(Class.class,Favorites.class);
        String favoriteString = f.getFavorite(String.class);
        Class<?> favoriteClass = f.getFavorite(Class.class);
        System.out.printf("%s%s%n",favoriteString,favoriteClass.getName());
    }
}
