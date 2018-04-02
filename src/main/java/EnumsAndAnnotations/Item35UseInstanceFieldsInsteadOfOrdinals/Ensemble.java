package EnumsAndAnnotations.Item35UseInstanceFieldsInsteadOfOrdinals;

/**
 * Created by wangcheng  on 2018/4/2.
 */
//Abuse of ordinal of derive an associated value-Don't do this
public enum  Ensemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, NONET, DECTET;
    public int numberOfMusicians(){
        return ordinal() + 1;
    }
}
