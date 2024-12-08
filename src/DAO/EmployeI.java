package DAO;

import java.util.List;

import Model.Employe;
import Model.Employe.Poste;
import Model.Employe.Role;

public interface EmployeI {
	
Employe findById(int employeId);
List<Employe> findAll();
void add(Employe E);
void update(Employe E,int id);
void delete(int id);
List<Role>findAllRoles();
List<Poste>findAllPostes();


}
