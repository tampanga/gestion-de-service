import java.beans.ConstructorProperties;

@Entity
public class Demande {
@Id
@GeneratedValue(strategy = 'GenerationType'.IDENTITY)
private Long id;
private String citoyenNom;
@ManyToOne
private Service service;
private String status;
// Constructeurs, getters, setters
public Demande() {}
public Demande(String citoyenNom, Service service, String status) {
this.citoyenNom = citoyenNom;
this.service = service;
this.status = status;
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getCitoyenNom() {
return citoyenNom;
}
public void setCitoyenNom(String citoyenNom) {
this.citoyenNom = citoyenNom;
}
public Service getService() {
return service;
}
public void setService(Service service) {
this.service = service;
}
public String getStatus() {
return status;
}
public void setStatus(String status) {
this.status = status;
}
}