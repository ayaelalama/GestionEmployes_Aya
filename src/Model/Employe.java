package Model;
public class Employe {
	private int id;
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}
	public Employe(int id, String nom, String prenom, String email, String telephone, double salaire, Role role,
			Poste poste) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.salaire = salaire;
		this.role = role;
		this.poste = poste;
	}
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private double salaire;
	private Role role;
	private Poste poste;
	
	public Employe(String nom,String prenom,String email,
			String telephone,double salaire,Role role,Poste poste) {
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
		this.telephone=telephone;
		this.salaire=salaire;
		this.role=role;
		this.poste=poste;
	}
	

	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	
	public String getPrenom() {
		return prenom;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public double getSalaire() {
		return salaire;
	}

	public Role getRole() {
		return role;
	}

	public Poste getPoste() {
		return poste;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

   public enum Role {
		ADMIN,
		EMPLOYE
		}
	public enum Poste {
		INGENIEURE,
		TEAM_LEADER,
		PILOTE
		}
	
}