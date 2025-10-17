package aula0810.testeunitario;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmprestimoTest {

    private Usuario usuario;
    private Livro livro;

    @BeforeEach
    void setup() {
        usuario = new Usuario("Rafaela");
        livro = new Livro("Domain-Driven Design");
    }

    @Test
    @DisplayName("Ao criar empréstimo, livro fica indisponível")
    void emprestimoMarcaLivroIndisponivel() {

        // Arrange
        Emprestimo e = new Emprestimo(usuario, livro);

        // Act / Assert
        assertAll(
                () -> assertSame(usuario, e.getUsuario()),
                () -> assertSame(livro, e.getLivro()),
                () -> assertFalse(livro.isDisponivel()),
                () -> assertTrue(e.isAtivo())
        );
    }

    @Test
    @DisplayName("Devolver empréstimo torna livro disponível")
    void devolverEmprestimo() {

        // Arrange
        Emprestimo emprestimo = new Emprestimo(usuario, livro);

        // Act
        emprestimo.devolver();

        // Assert
        assertAll(
                () -> assertFalse(emprestimo.isAtivo()),
                () -> assertNotNull(emprestimo.getDataDevolucao()),
                () -> assertTrue(livro.isDisponivel())
        );
    }

    @Test
    @DisplayName("Não deve emprestar livro já indisponível")
    void naoEmprestaLivroIndisponivel() {
        // Arrange
        new Emprestimo(usuario, livro);

        // Act / Assert
        assertThrows(IllegalStateException.class,
                () -> new Emprestimo(new Usuario("Maria"),
                        livro));
    }
}