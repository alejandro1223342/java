package conm.krakedev.controlFlujo.test;
import com.krakedev.controlFlujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Validador validador= new Validador();
		
		validador.validarEdad(12);
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(16);
		validador.validarEdad(-3);


	}

}
