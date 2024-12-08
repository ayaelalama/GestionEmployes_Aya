package Model;

import DAO.EmployeImpl;
import Model.Employe.Poste;

public class EmployeModel {
  private EmployeImpl dao;

  public EmployeModel(EmployeImpl dao) {
	this.dao=dao;
}


public boolean addEmploye(String nom,String pronom,String email,String telephone,double salaire,Model.Employe.Role role,Poste poste) {
	if(salaire<=0) {
		System.out.println("Le salaire doit etre superieur de 0 !!!!!");
	   return false;}
	
	if (email == null || !email.contains("@")) {
        System.out.println("L'email n'est pas valide !");
        return false;
    }	
	
	Employe NvEmploye = new Employe(nom,pronom,email,telephone,salaire,role,poste);
	dao.add(NvEmploye);
return true;	

}}

