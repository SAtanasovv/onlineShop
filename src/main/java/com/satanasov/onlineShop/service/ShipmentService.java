package com.satanasov.onlineShop.service;

import com.satanasov.onlineShop.model.Shipment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShipmentService {
    void createShipment(Shipment shipment);
    void updateShipment(Shipment shipment);
    Shipment getShipmentById(Long shipmentId);
    List<Shipment> getAllShipments();
    void deleteShipmentById(Long shipmentId);
}
