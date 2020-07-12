package cannons;

import cannons.type.E_CannonType;

public class MachineCannon extends AbstractCannon {
    MachineCannon() {
        this.cannonType = E_CannonType.MACHINE_CANNON;
        this.fireRate = 75;
        this.fireRange = 50;
        this.shotPower = 50;
        this.armor = 80;
    }

    void setPrice(float price) {
        this.price = price;
    }
}
