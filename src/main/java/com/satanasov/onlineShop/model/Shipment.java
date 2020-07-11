package com.satanasov.onlineShop.model;

import com.satanasov.onlineShop.model.enums.ShipmentMethod;
import com.satanasov.onlineShop.model.enums.ShipmentType;

public class Shipment {
    private Long id;
    private ShipmentMethod shipmentMethod = ShipmentMethod.ECONOMY;
    private ShipmentType shipmentType= ShipmentType.POST;

    public Long getId() {
        return id;
    }

    public ShipmentMethod getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(ShipmentMethod shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }
}
