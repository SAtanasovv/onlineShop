package com.satanasov.onlineShop.model;

import com.satanasov.onlineShop.model.enums.ShipmentMethod;
import com.satanasov.onlineShop.model.enums.ShipmentType;

import javax.persistence.*;

@Entity
@Table(name="shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "shipment_method")
    @Enumerated(EnumType.STRING)
    private ShipmentMethod shipmentMethod = ShipmentMethod.ECONOMY;
    @Column(name = "shipment_type")
    @Enumerated(EnumType.STRING)
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
