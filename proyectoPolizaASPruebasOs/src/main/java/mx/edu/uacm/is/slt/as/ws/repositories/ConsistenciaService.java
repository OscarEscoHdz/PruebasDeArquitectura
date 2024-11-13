package mx.edu.uacm.is.slt.as.ws.repositories;

import mx.edu.uacm.is.slt.as.ws.modelo.Cliente;
import mx.edu.uacm.is.slt.as.ws.modelo.Poliza;

public class ConsistenciaService {
	
	private PolizaRepositorio polizaRepositorio;
	private ClienteRepositorio clienteRepositorio;
	private BeneficiarioRepositorio beneficiarioRepositorio;
	
	public boolean verificarConsistenciaPoliza(Long polizaID) {
		Poliza polizaEnRepo1 = polizaRepositorio.findById(polizaID).orElse(null);
		//Poliza polizaEnRepo2 = //aqui obtenemos la poliza
		
		
		if (polizaEnRepo1 == null || polizaEnRepo2 == null) {
            return false;
        }
		return polizaEnRepo1.equals(polizaEnRepo2);
	}
	
	public boolean verificarConsisteciaCLienteCurp(String curp) {
		Cliente clienteRepositorio = clienteRepositorio.f
	}

}
