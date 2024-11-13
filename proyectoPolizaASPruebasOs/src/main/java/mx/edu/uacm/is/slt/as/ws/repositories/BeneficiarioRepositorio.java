package mx.edu.uacm.is.slt.as.ws.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.uacm.is.slt.as.ws.modelo.Beneficiario;

public interface BeneficiarioRepositorio extends JpaRepository<Beneficiario, Long>{

}