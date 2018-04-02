package EnumsAndAnnotations.Item34UseEnumsInsteadOFIntConstants;

/**
 * Created by wangcheng  on 2018/3/29.
 */
//* Enum types are effectively final
//* By virtue of having no accessible constructors
//* Cannot create instances of an enum type nor extend it
//* Enum types are instance-controlled and generalization of singletonsx
//* Provide compile-time type safety
//* Enum types let you add arbitrary methods and fields and implement arbitrary interfaces

public enum  EnumType {
}
enum Apple{FUJI, PIPPIN, GRANNY_SMITH }
enum Orange{ NAVEL, TEMPLE, BLOOD}