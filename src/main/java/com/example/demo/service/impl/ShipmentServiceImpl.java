package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.ShipmentService;
import java.time.LocalDate;

public class ShipmentServiceImpl implements ShipmentService {

private final ShipmentRepository repo;
private final VehicleRepository vehicleRepo;
private final LocationRepository locationRepo;

public ShipmentServiceImpl(ShipmentRepository r, VehicleRepository v, LocationRepository l) {
this.repo = r;
this.vehicleRepo = v;
this.locationRepo = l;
}

public Shipment createShipment(Long vehicleId, Shipment s) {
Vehicle v = vehicleRepo.findById(vehicleId)
.orElseThrow(() -> new ResourceNotFoundException("Vehicle not found"));

if (s.getWeightKg() > v.getCapacityKg())
throw new IllegalArgumentException("Weight exceeds");

if (s.getScheduledDate().isBefore(LocalDate.now()))
throw new IllegalArgumentException("Date in past");

s.setVehicle(v);
s.setPickupLocation(locationRepo.findById(s.getPickupLocation().getId()).get());
s.setDropLocation(locationRepo.findById(s.getDropLocation().getId()).get());
return repo.save(s);
}

public Shipment getShipment(Long id) {
return repo.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
}
}
