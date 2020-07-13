package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Shipment;
import com.satanasov.onlineShop.repository.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ShipmentServiceImpl implements ShipmentService {
    private final ShipmentRepository shipmentRepository;
    @Autowired
    public ShipmentServiceImpl(ShipmentRepository shipmentRepository) {
        this.shipmentRepository = shipmentRepository;
    }

    @Override
    public void createShipment(Shipment shipment) {

    }

    @Override
    public void updateShipment(Shipment shipment) {

    }

    @Override
    public Shipment getShipmentById(Long shipmentId) {
        return null;
    }

    @Override
    public List<Shipment> getAllShipments() {
        return null;
    }

    @Override
    public void deleteShipmentById(Long shipmentId) {

    }
}
