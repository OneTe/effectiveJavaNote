package EnumsAndAnnotations.Item35UseInstanceFieldsInsteadOfOrdinals;

/**
 * Created by wangcheng  on 2018/4/2.
 */
//Never derive a value associated with an enum from its ordinal;
//store it in an instance field instead:

public enum Ensemble1 {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5), SEXTET(6),
    SEPTET(7), OCTET(8), DOUBLE_QUARTET(8), NONET(9), DECTET(10), TRIPLE_QUARTET(12);
    private final int numberOfMusicians;
    Ensemble1(int size){this.numberOfMusicians = size;}

    public int getNumberOfMusicians(){return numberOfMusicians;}
}
