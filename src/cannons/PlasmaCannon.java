package cannons;

import cannons.type.E_CannonType;

public class PlasmaCannon extends AbstractCannon {
    PlasmaCannon() {
        this.cannonType = E_CannonType.PLASMA_CANNON;
        this.fireRate = 75;
        this.fireRange = 40;
        this.shotPower = 75;
        this.armor = 50;
    }

    void setPrice(float price) {
        this.price = price;
    }
}
