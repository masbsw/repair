package com.repair.repair.controller;

import com.repair.repair.dal.DataAccessLayer;
import com.repair.repair.models.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/unautorized")
@Slf4j
public class MainController {
  private final DataAccessLayer dataAccessLayer;

  public MainController(DataAccessLayer dataAccessLayer) {
    this.dataAccessLayer = dataAccessLayer;
  }

  //Create

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

  @PostMapping("/create/detail")
  public ResponseEntity<String> createDetail(@RequestBody Detail detail) {
    dataAccessLayer.createDetail(detail);
    return ResponseEntity.ok("Detail created");
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

  //Delete

  @DeleteMapping("/delete/application/{id}")
  public ResponseEntity<String> deleteApplicationById(@PathVariable("id") long id){
    dataAccessLayer.deleteApplicationById(id);
    return  ResponseEntity.ok("Application deleted");
  }

  @DeleteMapping("/delete/client/{id}")
  public ResponseEntity<String> deleteClientById(@PathVariable("id") long id){
    dataAccessLayer.deleteClientById(id);
    return  ResponseEntity.ok("Client deleted");
  }
  @DeleteMapping("/delete/detail/{id}")
  public ResponseEntity<String> deleteDetailById(@PathVariable("id") long id){
    dataAccessLayer.deleteDetailById(id);
    return  ResponseEntity.ok("Detail deleted");
  }

  @DeleteMapping("/delete/employee/{id}")
  public ResponseEntity<String> deleteEmployeeById(@PathVariable("id") long id){
    dataAccessLayer.deleteEmployeeById(id);
    return  ResponseEntity.ok("Employee deleted");
  }

  @DeleteMapping("/delete/equipmentClient/{id}")
  public ResponseEntity<String> deleteEquipmentClientById(@PathVariable("id") long id){
    dataAccessLayer.deleteEquipmentClientById(id);
    return  ResponseEntity.ok("Equipment client deleted");
  }

  @DeleteMapping("/delete/service/{id}")
  public ResponseEntity<String> deleteServiceById(@PathVariable("id") long id){
    dataAccessLayer.deleteServiceById(id);
    return  ResponseEntity.ok("Service deleted");
  }

  @DeleteMapping("/delete/subtask/{id}")
  public ResponseEntity<String> deleteSubtaskById(@PathVariable("id") long id){
    dataAccessLayer.deleteSubtaskById(id);
    return  ResponseEntity.ok("Subtask deleted");
  }

  @DeleteMapping("/delete/task/{id}")
  public ResponseEntity<String> deleteTaskById(@PathVariable("id") long id){
    dataAccessLayer.deleteTaskById(id);
    return  ResponseEntity.ok("Task deleted");
  }

  //Get

  @GetMapping("get/application/{id}")
  public ResponseEntity<Application> getApplicationById(@PathVariable("id") long id){
    Application application = dataAccessLayer.getApplicationById(id);
    if(application == null){
      return ResponseEntity.notFound().build();
    }
    else {
      return ResponseEntity.ok(application);
    }
  }

  @GetMapping("get/client/{id}")
  public ResponseEntity<Client> getClientById(@PathVariable("id") long id){
    Client client = dataAccessLayer.getClientById(id);
    if(client == null){
      return ResponseEntity.notFound().build();
    }
    else {
      return ResponseEntity.ok(client);
    }
  }

  @GetMapping("get/detail/{id}")
  public ResponseEntity<Detail> getDetailById(@PathVariable("id") long id){
    Detail detail = dataAccessLayer.getDetailById(id);
    if(detail == null){
      return ResponseEntity.notFound().build();
    }
    else {
      return ResponseEntity.ok(detail);
    }
  }

  @GetMapping("get/employee/{id}")
  public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long id){
    Employee employee = dataAccessLayer.getEmployeeById(id);
    if(employee == null){
      return ResponseEntity.notFound().build();
    }
    else {
      return ResponseEntity.ok(employee);
    }
  }

  @GetMapping("get/equipmentClient/{id}")
  public ResponseEntity<EquipmentClient> getEquipmentClientById(@PathVariable("id") long id){
    EquipmentClient equipmentClient = dataAccessLayer.getEquipmentClientById(id);
    if(equipmentClient == null){
      return ResponseEntity.notFound().build();
    }
    else {
      return ResponseEntity.ok(equipmentClient);
    }
  }

  @GetMapping("get/service/{id}")
  public ResponseEntity<Service> getServiceById(@PathVariable("id") long id){
    Service service = dataAccessLayer.getServiceById(id);
    if(service == null){
      return ResponseEntity.notFound().build();
    }
    else {
      return ResponseEntity.ok(service);
    }
  }

  @GetMapping("get/subtask/{id}")
  public ResponseEntity<Subtask> getSubtaskById(@PathVariable("id") long id){
    Subtask subtask = dataAccessLayer.getSubtaskById(id);
    if(subtask == null){
      return ResponseEntity.notFound().build();
    }
    else {
      return ResponseEntity.ok(subtask);
    }
  }

  @GetMapping("get/task/{id}")
  public ResponseEntity<Task> getTaskById(@PathVariable("id") long id){
    Task task = dataAccessLayer.getTaskById(id);
    if(task == null){
      return ResponseEntity.notFound().build();
    }
    else {
      return ResponseEntity.ok(task);
    }
  }


  //Patch

  @PatchMapping("/patch/application/{id}")
  public ResponseEntity<String> updateApplication(@PathVariable("id") long id, @RequestBody Application updateApplication){
    dataAccessLayer.updateApplication(id, updateApplication);
    return ResponseEntity.ok("Update application");
  }

  @PatchMapping("/patch/client/{id}")
  public ResponseEntity<String> updateClient(@PathVariable("id") long id, @RequestBody Client updateClient){
    dataAccessLayer.updateClient(id, updateClient);
    return ResponseEntity.ok("Update client");
  }

  @PatchMapping("/patch/detail/{id}")
  public ResponseEntity<String> updateDetail(@PathVariable("id") long id, @RequestBody Detail updateDetail){
    dataAccessLayer.updateDetail(id, updateDetail);
    return ResponseEntity.ok("Update detail");
  }

  @PatchMapping("/patch/employee/{id}")
  public ResponseEntity<String> updateEmployee(@PathVariable("id") long id, @RequestBody Employee updateEmployee){
    dataAccessLayer.updateEmployee(id, updateEmployee);
    return ResponseEntity.ok("Update employee");
  }

  @PatchMapping("/patch/equipmentClient/{id}")
  public ResponseEntity<String> updateEquipmentClient(@PathVariable("id") long id, @RequestBody EquipmentClient updateEquipmentClient){
    dataAccessLayer.updateEquipmentClient(id, updateEquipmentClient);
    return ResponseEntity.ok("Update equipment client");
  }

  @PatchMapping("/patch/service/{id}")
  public ResponseEntity<String> updateService(@PathVariable("id") long id, @RequestBody Service updateService){
    dataAccessLayer.updateService(id, updateService);
    return ResponseEntity.ok("Update service");
  }

  @PatchMapping("/patch/subtask/{id}")
  public ResponseEntity<String> updateSubtask(@PathVariable("id") long id, @RequestBody Subtask updateSubtask){
    dataAccessLayer.updateSubtask(id, updateSubtask);
    return ResponseEntity.ok("Update subtask");
  }

  @PatchMapping("/patch/task/{id}")
  public ResponseEntity<String> updateTask(@PathVariable("id") long id, @RequestBody Task updateTask){
    dataAccessLayer.updateTask(id, updateTask);
    return ResponseEntity.ok("Update task");
  }

  //security

  @GetMapping("/user")
  public String userAccess(Principal principal){
    if (principal == null)
      return null;
    return principal.getName();
  }



}
