package com.repair.repair.dal;

import com.repair.repair.models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
public class DataAccessLayer {
  private final SessionFactory sessionFactory;

  @Autowired
  public DataAccessLayer(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  Session session = null;

  //Create

  public void createApplication(Application newApplication) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newApplication);
    session.getTransaction().commit();
    if (session != null) {
      session.close();
    }
  }

  public void createClient(Client newClient) {
    session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newClient);
    session.getTransaction().commit();
    if (session != null) {
      session.close();
    }
  }

  public void createDetail(Detail newDetail) {
    session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newDetail);
    session.getTransaction().commit();
    if (session != null) {
      session.close();
    }
  }

  public void createEmployee(Employee newEmployee) {
    session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newEmployee);
    session.getTransaction().commit();
    if (session != null) {
      session.close();
    }
  }

  public void createEquipmentClient(EquipmentClient newEquipmentClient) {
    session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newEquipmentClient);
    session.getTransaction().commit();
    if (session != null) {
      session.close();
    }
  }

  public void createService(Service newService) {
    Session session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newService);
    session.getTransaction().commit();
    if (session != null) {
      session.close();
    }
  }

  public void createSubtask(Subtask newSubtask) {
    session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newSubtask);
    session.getTransaction().commit();
    if (session != null) {
      session.close();
    }
  }

  public void createTask(Task newTask) {
    session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newTask);
    session.getTransaction().commit();
    if (session != null) {
      session.close();
    }
  }

  //Delete
  public void deleteApplicationById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Application application = session.get(Application.class, id);
    session.remove(application);
    session.getTransaction().commit();
    if (session != null){
      session.close();
    }
  }

  public void deleteClientById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Client client = session.get(Client.class, id);
    session.remove(client);
    session.getTransaction().commit();
    if (session != null){
      session.close();
    }
  }

  public void deleteDetailById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Detail detail = session.get(Detail.class, id);
    session.remove(detail);
    session.getTransaction().commit();
    if (session != null){
      session.close();
    }
  }

  public void deleteEmployeeById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Employee employee = session.get(Employee.class, id);
    session.remove(employee);
    session.getTransaction().commit();
    if (session != null){
      session.close();
    }
  }

  public void deleteEquipmentClientById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    EquipmentClient equipmentClient = session.get(EquipmentClient.class, id);
    session.remove(equipmentClient);
    session.getTransaction().commit();
    if (session != null){
      session.close();
    }
  }

  public void deleteServiceById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Service service = session.get(Service.class, id);
    session.remove(service);
    session.getTransaction().commit();
    if (session != null){
      session.close();
    }
  }

  public void deleteSubtaskById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Subtask subtask = session.get(Subtask.class, id);
    session.remove(subtask);
    session.getTransaction().commit();
    if (session != null){
      session.close();
    }
  }

  public void deleteTaskById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Task task = session.get(Task.class, id);
    session.remove(task);
    session.getTransaction().commit();
    if (session != null){
      session.close();
    }
  }

  //Get

  public Application getApplicationById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    try{
      Application application = session.get(Application.class, id);
      return application;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }

  public Client getClientById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    try{
      Client client = session.get(Client.class, id);
      return client;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }

  public Detail getDetailById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    try{
      Detail detail = session.get(Detail.class, id);
      return detail;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }

  public Employee getEmployeeById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    try{
      Employee employee = session.get(Employee.class, id);
      return employee;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }

  public EquipmentClient getEquipmentClientById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    try{
      EquipmentClient equipmentClient = session.get(EquipmentClient.class, id);
      return equipmentClient;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }

  public Service getServiceById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    try{
      Service service = session.get(Service.class, id);
      return service;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }

  public Subtask getSubtaskById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    try{
      Subtask subtask = session.get(Subtask.class, id);
      return subtask;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }

  public Task getTaskById(long id){
    session = sessionFactory.openSession();
    session.beginTransaction();
    try{
      Task task = session.get(Task.class, id);
      return task;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }

  //Patch

  public void updateApplication(long id, Application updateApplication){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Application application = session.get(Application.class, id);
    application.setApplicationDateCreation(updateApplication.getApplicationDateCreation());
    application.setApplicationDateEnd(updateApplication.getApplicationDateEnd());
    application.setApplicationPrice(updateApplication.getApplicationPrice());
    session.merge(application);
    session.getTransaction().commit();
  }

  public void updateClient(long id, Client updateClient){
    session = sessionFactory.openSession();
    session.beginTransaction();
    Client client = session.get(Client.class, id);
    client.setClientLogin(updateClient.getClientLogin());
    client.setClientPassword(updateClient.getClientPassword());
    client.setClientFirstname(updateClient.getClientFirstname());
    client.setClientLastname(updateClient.getClientLastname());
    client.setClientMiddlename(updateClient.getClientMiddlename());
    session.merge(client);
    session.getTransaction().commit();
  }

  public void updateDetail(long id, Detail updateDetail){
    session =  sessionFactory.openSession();
    session.beginTransaction();
    Detail detail = session.get(Detail.class, id);
    detail.setDetailName(updateDetail.getDetailName());
    detail.setDetailBrand(updateDetail.getDetailBrand());
    detail.setDetailModel(updateDetail.getDetailModel());
    detail.setDetailPrice(updateDetail.getDetailPrice());
    detail.setDetailQuantity(updateDetail.getDetailQuantity());
    session.merge(detail);
    session.getTransaction().commit();
  }

  public void updateEmployee(long id, Employee updateEmployee){
    session =  sessionFactory.openSession();
    session.beginTransaction();
    Employee employee = session.get(Employee.class, id);
    employee.setEmployeeLogin(updateEmployee.getEmployeeLogin());
    employee.setEmployeePassword(updateEmployee.getEmployeePassword());
    employee.setEmployeeFirstname(updateEmployee.getEmployeeFirstname());
    employee.setEmployeeLastname(updateEmployee.getEmployeeLastname());
    employee.setEmployeeMiddlename(updateEmployee.getEmployeeMiddlename());
    employee.setEmployeePost(updateEmployee.getEmployeePost());
    session.merge(employee);
    session.getTransaction().commit();
  }

  public void updateEquipmentClient(long id, EquipmentClient updateEquipmentClient){
    session =  sessionFactory.openSession();
    session.beginTransaction();
    EquipmentClient equipmentClient = session.get(EquipmentClient.class, id);
    equipmentClient.setEquipmentClientName(updateEquipmentClient.getEquipmentClientName());
    equipmentClient.setEquipmentClientBrand(updateEquipmentClient.getEquipmentClientBrand());
    equipmentClient.setEquipmentClientModel(updateEquipmentClient.getEquipmentClientModel());
    session.merge(equipmentClient);
    session.getTransaction().commit();
  }

  public void updateService(long id, Service updateService){
    session =  sessionFactory.openSession();
    session.beginTransaction();
    Service service = session.get(Service.class, id);
    service.setServiceName(updateService.getServiceName());
    service.setServiceDescription(updateService.getServiceDescription());
    service.setServicePrice(updateService.getServicePrice());
    session.merge(service);
    session.getTransaction().commit();
  }
  public void updateSubtask(long id, Subtask updateSubtask){
    session =  sessionFactory.openSession();
    session.beginTransaction();
    Subtask subtask = session.get(Subtask.class, id);
    subtask.setSubtaskDescription(updateSubtask.getSubtaskDescription());
    subtask.setSubtaskStatus(updateSubtask.getSubtaskStatus());
    subtask.setSubtaskDeadline(updateSubtask.getSubtaskDeadline());
    session.merge(subtask);
    session.getTransaction().commit();
  }

  public void updateTask(long id, Task updateTask){
    session =  sessionFactory.openSession();
    session.beginTransaction();
    Task task = session.get(Task.class, id);
    task.setTaskDateCreation(updateTask.getTaskDateCreation());
    task.setTaskStatus(updateTask.getTaskStatus());
    session.merge(task);
    session.getTransaction().commit();
  }

//  public String newUserToDatabase(User user){
//    session = sessionFactory.openSession();
//    session.beginTransaction();
//    String name = user.getUsername();
//
//    Query query = session
//            .createQuery("FROM User where userName = :username")
//            .setParameter("username", name);
//    User userFrom(User) query.uniqueResult;
//
//    if (userFrom != null) {
//      return "Выберите другое имя";
//    }
//    session.persist(user);
//    session.getTransaction().commit();
//    session.close();
//    return "Done";
//  }




  //ЭТО ЧЕ????
  public String newUserToDatabase(com.repair.repair.models.User user) {
    Session session = null;
    try {
      session = sessionFactory.openSession();
      session.beginTransaction();

      String name = user.getUsername();

      Query<User> query = session
              .createQuery("FROM User WHERE username = :username", User.class)
              .setParameter("username", name);

      User userFromDb = query.uniqueResult();

      if (userFromDb != null) {
        return "Выберите другое имя";
      }

      session.persist(user);
      session.getTransaction().commit();
      return "Done";
    } catch (Exception e) {
      if (session != null && session.getTransaction() != null) {
        session.getTransaction().rollback();
      }
      throw e;
    } finally {
      if (session != null) {
        session.close();
      }
    }
  }



}
