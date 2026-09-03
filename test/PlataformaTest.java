import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Classe espelho de Plataforma.
 *
 * Planos cobertos (ver PLANOS_DE_TESTE.md):
 *   PL06 - Validar Plataforma.buscarMusica(titulo) e buscarMusica(id)
 *   PL11 - Validar Plataforma.cadastrarMusica e cadastrarUsuario
 *
 * Observação: a Plataforma usa Musica.getContagem() (contador static, global) pra
 * decidir em que posição do array guardar cada música. Por isso, no cenário base,
 * cada música é cadastrada logo depois de criada, exatamente como o App faz.
 */
public class PlataformaTest {

    private Plataforma plataforma;
    private Musica bohemian;
    private Musica hotel;
    private Usuario lucas;

    @BeforeEach
    public void montarCenario() {
        plataforma = new Plataforma();

        bohemian = new Musica("Bohemian Rhapsody", "Queen", 355);
        plataforma.cadastrarMusica(bohemian);

        hotel = new Musica("Hotel California", "Eagles", 391);
        plataforma.cadastrarMusica(hotel);

        lucas = new Usuario("Lucas", "lucas@sonora.com");
        plataforma.cadastrarUsuario(lucas);
    }

    // ------------------------------------------------------------------
    // PL06 - Validar Plataforma.buscarMusica(titulo) e buscarMusica(id)
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Buscar por id de música cadastrada devolve a música")
    public void pl06Caso1_buscarPorIdDeMusicaCadastradaDevolveAMusica() {
        assertEquals(bohemian, plataforma.buscarMusica(bohemian.getId()));
        assertEquals(hotel, plataforma.buscarMusica(hotel.getId()));
    }

    @Test
    @DisplayName("Buscar por título de música cadastrada devolve a música")
    public void pl06Caso2_buscarPorTituloDeMusicaCadastradaDevolveAMusica() {
        assertEquals(hotel, plataforma.buscarMusica("Hotel California"));
    }

    @Test
    @DisplayName("Buscar por título ignora maiúsculas e minúsculas")
    public void pl06Caso3_buscarPorTituloIgnoraMaiusculasEMinusculas() {
        assertEquals(bohemian, plataforma.buscarMusica("bohemian rhapsody"));
        assertEquals(bohemian, plataforma.buscarMusica("BOHEMIAN RHAPSODY"));
    }

    @Test
    @DisplayName("Buscar por id inexistente devolve null")
    public void pl06Caso4_buscarPorIdInexistenteDevolveNull() {
        // Os ids são sequenciais a partir de 1 e o contador nunca diminui nos testes,
        // então "contagem + 1" é um id que ainda não foi dado a música nenhuma.
        int idInexistente = Musica.getContagem() + 1;

        assertNull(plataforma.buscarMusica(idInexistente));
    }

    @Test
    @DisplayName("Buscar por título inexistente devolve null")
    public void pl06Caso5_buscarPorTituloInexistenteDevolveNull() {
        assertNull(plataforma.buscarMusica("Música que não existe"));
    }

    // ------------------------------------------------------------------
    // PL11 - Validar Plataforma.cadastrarMusica e cadastrarUsuario
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Música nula não é cadastrada (retorna false)")
    public void pl11Caso1_musicaNulaNaoECadastrada() {
        assertFalse(plataforma.cadastrarMusica(null));
    }

    @Test
    @DisplayName("Música válida é cadastrada (retorna true) e passa a ser encontrada")
    public void pl11Caso2_musicaValidaECadastradaEPassaASerEncontrada() {
        Musica stairway = new Musica("Stairway to Heaven", "Led Zeppelin", 482);

        assertTrue(plataforma.cadastrarMusica(stairway));
        assertEquals(stairway, plataforma.buscarMusica(stairway.getId()));
        assertEquals(stairway, plataforma.buscarMusica("Stairway to Heaven"));
    }

    @Test
    @DisplayName("Usuário nulo não é cadastrado (retorna false)")
    public void pl11Caso3_usuarioNuloNaoECadastrado() {
        assertFalse(plataforma.cadastrarUsuario(null));
    }

    @Test
    @DisplayName("Usuário válido é cadastrado (retorna true)")
    public void pl11Caso4_usuarioValidoECadastrado() {
        Usuario ana = new Usuario("Ana", "ana@sonora.com");

        assertTrue(plataforma.cadastrarUsuario(ana));
    }
}
