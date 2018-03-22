package Item22UseInterfacesOnlyToDefineTypes;
//The constant interface pattern is a poor use of interface
/**
 * Created by wangcheng  on 2018/3/22.
 */
//Constant interface antipattern - do not use!

import java.io.ObjectStreamConstants;
//These interfaces should be regarded as anomalies and should not be emulated

public interface PhysicalConstants {
    // Avogadro's number (1/mol)
    static final double AVOGADROS_NUMBER = 6.02214199e23;
    // Boltzmann constant (J/K)
    static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
    // Mass of the electron (kg)
    static final double ELECTRON_MASS      = 9.10938188e-31;
}