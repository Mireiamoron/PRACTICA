package paquete;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class calculadoraTest {

	calculadora calculadora = new calculadora();
	@ParameterizedTest
	@CsvSource ({

	"2,3,5",
	"5,5,10",
	"1,4,5"

	})	


void testSuma(int a,int b, int resultadoEsperado) {
	assertEquals(resultadoEsperado, calculadora.sumar(a,b));
}
}
