package mx.edu.uacm.is.slt.as.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.edu.uacm.is.slt.as.ws.modelo.Poliza;

public interface PolizaRepositorio extends JpaRepository<Poliza, Long>{

}
