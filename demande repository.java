package gestion des cervices.base de donne;

public class demande repository {
    
}
import org.springframework.data.jpa.repository.JpaRepository;
public interface DemandeRepository extends JpaRepository<Demande, Long> {
 }
 Mairie services.java
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import java.util.List;
 @Service
 public class MairieService {
 @Autowired
 private ServiceRepository serviceRepository;
 @Autowired
 private DemandeRepository demandeRepository;
 // Gestion des services
 public List<Service> getAllServices() {
 return serviceRepository.findAll();
 }
 public Service createService(Service service) {
 return serviceRepository.save(service);
 }
 // Gestion des demandes
 public List<Demande> getAllDemandes() {
 return demandeRepository.findAll();
 }
 public Demande createDemande(Demande demande) {
 return demandeRepository.save(demande);
 }
 public Demande updateDemandeStatus(Long demandeId, String status) {
 Demande demande = demandeRepository.findById(demandeId).orElseThrow();
 demande.setStatus(status);
 return demandeRepository.save(demande);
 }
 