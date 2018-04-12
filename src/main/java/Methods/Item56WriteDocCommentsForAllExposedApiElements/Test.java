package Methods.Item56WriteDocCommentsForAllExposedApiElements;

import java.math.BigInteger;

/**
 * Created by wangcheng  on 2018/4/12.
 */
public interface Test<E> {
    /**
     * Returns the element at the specified position in this list.
     *
     * <p>This method is <i>not</i> guaranteed to run in constant
     * time. In some implementations is may run in time proportional
     * to the element position.
     *
     * @param index index of element to return; must be
     *              none-negative and less than ths size of this list
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         ({@code index < 0 || index >= this.size()})
     */
    E get(int index);


}
