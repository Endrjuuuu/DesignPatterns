package base_package;

import cannons.CannonsCreator;
import cannons.I_AbstractCannon;
import cannons.type.E_CannonType;

public class FactoryMethodTester {
    public static void main(String[] args) {
        CannonsCreator cannonsCreateor = CannonsCreator.getInstance();
        I_AbstractCannon laserCannon = cannonsCreateor.create(E_CannonType.LASER_CANNON);
        I_AbstractCannon machineCannon = cannonsCreateor.create(E_CannonType.MACHINE_CANNON);

        System.out.println(laserCannon);
        System.out.println(machineCannon);

    }
}
