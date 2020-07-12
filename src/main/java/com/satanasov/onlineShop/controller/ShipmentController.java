package com.satanasov.onlineShop.controller;


import com.satanasov.onlineShop.model.Address;
import com.satanasov.onlineShop.model.Shipment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/shipments")
public class ShipmentController {
    @PostMapping
    public void createShipment(@RequestBody Shipment shipment) {

    }

    @PutMapping
    public void updateShipment(@RequestBody Shipment shipment) {

    }
    @GetMapping
    public List<Shipment> getAllShipments() {
        return null;

    }
    @GetMapping("/{shipmentId}")
    public Shipment getShipment(@PathVariable Long shipmentId){
        return null;

    }
    @DeleteMapping("/{shipmentId}")
    public void deleteShipment(@PathVariable("shipmentId") Long shipmentId){

    }
}
