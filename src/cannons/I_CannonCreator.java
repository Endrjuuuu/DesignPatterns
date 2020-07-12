package cannons;

import cannons.type.E_CannonType;

public interface I_CannonCreator {
    I_AbstractCannon create(E_CannonType cannonType);
}
