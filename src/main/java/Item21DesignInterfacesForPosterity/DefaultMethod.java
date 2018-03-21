package Item21DesignInterfacesForPosterity;
//In Java 8,the default method construct was added [JLS 9.4],
//with the intent of allowing the addition of methods to existing interfaces
//https://www.zhihu.com/question/54479642
/**
 * Created by wangcheng  on 2018/3/21.
 */
public class DefaultMethod {
    // Default method added to the Collection interface in Java 8
//    default boolean removeIf(Predicate<? super E> filter) {
//        Objects.requireNonNull(filter);
//        boolean result = false;
//        for (Iterator<E> it = iterator(); it.hasNext(); ) {
//            if (filter.test(it.next())) { it.remove();
//                result = true;
//            } }
//        return result;
// }
}
