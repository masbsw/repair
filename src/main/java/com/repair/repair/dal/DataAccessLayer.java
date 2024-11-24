package com.repair.repair.dal;

import com.repair.repair.models.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataAccessLayer {
  private final SessionFactory sessionFactory;

  @Autowired
  public DataAccessLayer(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  Session session = null;

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

  public void createComponent(Zapchast newZapchast) {
    session = sessionFactory.openSession();
    session.beginTransaction();
    session.persist(newZapchast);
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

}
