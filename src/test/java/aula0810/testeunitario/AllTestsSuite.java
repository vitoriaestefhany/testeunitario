package aula0810.testeunitario;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        LivroTest.class,
        UsuarioTest.class,
        EmprestimoTest.class,
        ValidadorSenhaTest.class
        
})
public class AllTestsSuite {
    // Nada aqui: as anotações definem a suíte.
}