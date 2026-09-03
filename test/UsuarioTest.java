import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Classe espelho de Usuario.
 *
 * Planos cobertos (ver PLANOS_DE_TESTE.md):
 *   PL09 - Validar construtor de Usuario com dados inválidos
 *   PL08 - Contadores de id (bônus) - casos 5 e 6
 *
 * Observação: o contador de id de Usuario é static e não é zerado entre os testes,
 * por isso os casos de id comparam ids relativos, nunca valores absolutos.
 */
public class UsuarioTest {

    private Usuario lucas;

    @BeforeEach
    public void montarCenario() {
        lucas = new Usuario("Lucas", "lucas@sonora.com");
    }

    // ------------------------------------------------------------------
    // PL09 - Validar construtor de Usuario com dados inválidos
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Nome vazio deve ser rejeitado")
    public void pl09Caso1_nomeVazioDeveSerRejeitado() {
        assertThrows(IllegalArgumentException.class, () -> new Usuario("", "lucas@sonora.com"));
    }

    @Test
    @DisplayName("Nome nulo deve ser rejeitado")
    public void pl09Caso2_nomeNuloDeveSerRejeitado() {
        assertThrows(IllegalArgumentException.class, () -> new Usuario(null, "lucas@sonora.com"));
    }

    @Test
    @DisplayName("E-mail vazio deve ser rejeitado")
    public void pl09Caso3_emailVazioDeveSerRejeitado() {
        assertThrows(IllegalArgumentException.class, () -> new Usuario("Lucas", ""));
    }

    @Test
    @DisplayName("E-mail nulo deve ser rejeitado")
    public void pl09Caso4_emailNuloDeveSerRejeitado() {
        assertThrows(IllegalArgumentException.class, () -> new Usuario("Lucas", null));
    }

    @Test
    @DisplayName("E-mail sem @ deve ser rejeitado")
    public void pl09Caso5_emailSemArrobaDeveSerRejeitado() {
        IllegalArgumentException erro = assertThrows(IllegalArgumentException.class,
                () -> new Usuario("Lucas", "lucas.sonora.com"));

        // A mensagem precisa descrever o erro, não só dizer "erro".
        assertNotNull(erro.getMessage());
        assertFalse(erro.getMessage().trim().isEmpty());
    }

    @Test
    @DisplayName("Dados válidos criam o usuário")
    public void pl09Caso6_dadosValidosCriamOUsuario() {
        assertNotNull(lucas);
        assertTrue(lucas.getId() > 0);
        assertEquals("Lucas", lucas.getNome());
        assertEquals("lucas@sonora.com", lucas.getEmail());
    }

    // ------------------------------------------------------------------
    // PL08 (bônus) - Contadores de id - casos 5 e 6
    // (casos 1 a 4, sobre os ids de Música, estão em MusicaTest)
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Dois usuários criados em sequência têm ids consecutivos")
    public void pl08Caso5_doisUsuariosEmSequenciaTemIdsConsecutivos() {
        Usuario primeiro = new Usuario("Ana", "ana@sonora.com");
        Usuario segundo = new Usuario("Bruno", "bruno@sonora.com");

        assertEquals(primeiro.getId() + 1, segundo.getId());
    }

    @Test
    @DisplayName("Criar uma música entre dois usuários não interfere nos ids de Usuário")
    public void pl08Caso6_musicaNoMeioNaoInterfereNosIdsDeUsuario() {
        Usuario antes = new Usuario("Ana", "ana@sonora.com");
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);
        Usuario depois = new Usuario("Bruno", "bruno@sonora.com");

        assertNotNull(musica);
        assertEquals(antes.getId() + 1, depois.getId());
    }
}
