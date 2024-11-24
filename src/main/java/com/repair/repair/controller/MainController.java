package com.repair.repair.controller;

import com.repair.repair.dal.DataAccessLayer;
import com.repair.repair.models.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unautorized")
@Slf4j
public class MainController {
  private final DataAccessLayer dataAccessLayer;

  public MainController(DataAccessLayer dataAccessLayer) {
    this.dataAccessLayer = dataAccessLayer;
  }

  @PostMapping("/create/application")
  public ResponseEntity<String> createApplication(@RequestBody Application application) {
    dataAccessLayer.createApplication(application);
    return ResponseEntity.ok("Application created");
  }

  @PostMapping("/create/client")
  public ResponseEntity<String> createClient(@RequestBody Client client) {
    dataAccessLayer.createClient(client);
    return ResponseEntity.ok("Client created");
  }

  @PostMapping("/create/component")
  public ResponseEntity<String> createComponent(@RequestBody Zapchast zapchast) {
    dataAccessLayer.createComponent(zapchast);
    return ResponseEntity.ok("Component created");
  }

  @PostMapping("/create/employee")
  public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
    dataAccessLayer.createEmployee(employee);
    return ResponseEntity.ok("Employee created");
  }

  @PostMapping("/create/equipmentClient")
  public ResponseEntity<String> createEquipmentClient(@RequestBody EquipmentClient equipmentClient) {
    dataAccessLayer.createEquipmentClient(equipmentClient);
    return ResponseEntity.ok("EquipmentClient created");
  }

  @PostMapping("/create/service")
  public ResponseEntity<String> createService(@RequestBody Service service) {
    dataAccessLayer.createService(service);
    return ResponseEntity.ok("Service created");
  }

  @PostMapping("/create/subtask")
  public ResponseEntity<String> createSubtask(@RequestBody Subtask subtask) {
    dataAccessLayer.createSubtask(subtask);
    return ResponseEntity.ok("Subtask created");
  }

  @PostMapping("/create/task")
  public ResponseEntity<String> createTask(@RequestBody Task task) {
    dataAccessLayer.createTask(task);
    return ResponseEntity.ok("Task created");
  }
}
