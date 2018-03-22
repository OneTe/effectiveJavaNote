package Item22UseInterfacesOnlyToDefineTypes;

/**
 * Created by wangcheng  on 2018/3/22.
 */
public class PhysicalConstants1 {
    private PhysicalConstants1() { }  // Prevents instantiation
    //the use of the underscore character (_) in the numeric literals.
    //Underscores, which have been legal since Java 7, have no effect
    //on the values of numeric literals, but can make them much easier
    //to read if used with discretion
    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    public static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;
    public static final double ELECTRON_MASS = 9.109_383_56e-31;
}
