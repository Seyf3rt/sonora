import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Classe espelho de Musica.
 *
 * Planos cobertos (ver PLANOS_DE_TESTE.md):
 *   PL01 - Validar Musica.getDuracaoFormatada()
 *   PL02 - Validar construtor de Musica com dados inválidos
 *   PL07 - Validar Musica.reproduzir()
 *   PL08 - Contadores de id (bônus) - casos 1 a 4
 *
 * Observação: o contador de id de Musica é static e não é zerado entre os testes
 * (todas as classes de teste rodam na mesma JVM). Por isso os casos de id comparam
 * ids relativos (um em relação ao outro), nunca valores absolutos como 1, 2, 3.
 */
public class MusicaTest {

    private Musica bohemian;

    @BeforeEach
    public void montarCenario() {
        bohemian = new Musica("Bohemian Rhapsody", "Queen", 355);
    }

    // ------------------------------------------------------------------
    // PL01 - Validar Musica.getDuracaoFormatada()
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Duração com minutos e segundos")
    public void pl01Caso1_duracaoComMinutosESegundos() {
        Musica musica = new Musica("Faixa", "Artista", 125);
        assertEquals("02:05", musica.getDuracaoFormatada());
    }

    @Test
    @DisplayName("Duração redonda em minutos")
    public void pl01Caso2_duracaoRedondaEmMinutos() {
        Musica musica = new Musica("Faixa", "Artista", 90);
        assertEquals("01:30", musica.getDuracaoFormatada());
    }

    @Test
    @DisplayName("Menos de um minuto, com zero à esquerda")
    public void pl01Caso3_menosDeUmMinutoComZeroAEsquerda() {
        Musica musica = new Musica("Faixa", "Artista", 5);
        assertEquals("00:05", musica.getDuracaoFormatada());
    }

    @Test
    @DisplayName("Dois dígitos nos minutos")
    public void pl01Caso4_doisDigitosNosMinutos() {
        Musica musica = new Musica("Faixa", "Artista", 600);
        assertEquals("10:00", musica.getDuracaoFormatada());
    }

    @Test
    @DisplayName("Valor logo abaixo de dez minutos")
    public void pl01Caso5_valorLogoAbaixoDeDezMinutos() {
        Musica musica = new Musica("Faixa", "Artista", 599);
        assertEquals("09:59", musica.getDuracaoFormatada());
    }

    // ------------------------------------------------------------------
    // PL02 - Validar construtor de Musica com dados inválidos
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Título vazio deve ser rejeitado")
    public void pl02Caso1_tituloVazioDeveSerRejeitado() {
        // O 2º argumento do assertThrows é o trecho de código que deve estourar a
        // exceção; a sintaxe "() -> ..." só embrulha esse trecho pro JUnit executar.
        assertThrows(IllegalArgumentException.class, () -> new Musica("", "Queen", 355));
    }

    @Test
    @DisplayName("Título nulo deve ser rejeitado")
    public void pl02Caso2_tituloNuloDeveSerRejeitado() {
        assertThrows(IllegalArgumentException.class, () -> new Musica(null, "Queen", 355));
    }

    @Test
    @DisplayName("Artista vazio deve ser rejeitado")
    public void pl02Caso3_artistaVazioDeveSerRejeitado() {
        assertThrows(IllegalArgumentException.class, () -> new Musica("Bohemian Rhapsody", "", 355));
    }

    @Test
    @DisplayName("Duração zero deve ser rejeitada")
    public void pl02Caso4_duracaoZeroDeveSerRejeitada() {
        assertThrows(IllegalArgumentException.class, () -> new Musica("Bohemian Rhapsody", "Queen", 0));
    }

    @Test
    @DisplayName("Duração negativa deve ser rejeitada")
    public void pl02Caso5_duracaoNegativaDeveSerRejeitada() {
        assertThrows(IllegalArgumentException.class, () -> new Musica("Bohemian Rhapsody", "Queen", -10));
    }

    @Test
    @DisplayName("Dados válidos criam a música")
    public void pl02Caso6_dadosValidosCriamAMusica() {
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);

        assertNotNull(musica);
        assertTrue(musica.getId() > 0);
        assertEquals("Bohemian Rhapsody", musica.getTitulo());
        assertEquals("Queen", musica.getArtista());
        assertEquals(355, musica.getDuracaoSegundos());
    }

    @Test
    @DisplayName("Título só com espaços deve ser rejeitado")
    public void pl02Caso7_tituloSoComEspacosDeveSerRejeitado() {
        assertThrows(IllegalArgumentException.class, () -> new Musica("   ", "Queen", 355));
    }

    @Test
    @DisplayName("A mensagem da exceção descreve o erro")
    public void pl02Caso8_mensagemDaExcecaoDescreveOErro() {
        IllegalArgumentException erro = assertThrows(IllegalArgumentException.class,
                () -> new Musica("Bohemian Rhapsody", "Queen", -30));

        assertNotNull(erro.getMessage());
        assertFalse(erro.getMessage().trim().isEmpty());
        assertTrue(erro.getMessage().contains("-30"));
    }

    // ------------------------------------------------------------------
    // PL07 - Validar Musica.reproduzir()
    // ------------------------------------------------------------------

    @Test
    @DisplayName("Música recém-criada começa com zero reproduções")
    public void pl07Caso1_musicaRecemCriadaComecaComZeroReproducoes() {
        assertEquals(0, bohemian.getReproducoes());
    }

    @Test
    @DisplayName("Uma chamada de reproduzir() aumenta o contador em um")
    public void pl07Caso2_umaChamadaAumentaOContadorEmUm() {
        int antes = bohemian.getReproducoes();

        bohemian.reproduzir();

        assertEquals(antes + 1, bohemian.getReproducoes());
    }

    @Test
    @DisplayName("Três chamadas de reproduzir() resultam em três reproduções")
    public void pl07Caso3_tresChamadasResultamEmTresReproducoes() {
        bohemian.reproduzir();
        bohemian.reproduzir();
        bohemian.reproduzir();

        assertEquals(3, bohemian.getReproducoes());
    }

    @Test
    @DisplayName("Reproduzir uma música não altera o contador de outra")
    public void pl07Caso4_reproduzirNaoAlteraOContadorDeOutraMusica() {
        Musica outra = new Musica("Hotel California", "Eagles", 391);

        bohemian.reproduzir();
        bohemian.reproduzir();

        assertEquals(2, bohemian.getReproducoes());
        assertEquals(0, outra.getReproducoes());
    }

    // ------------------------------------------------------------------
    // PL08 (bônus) - Contadores de id - casos 1 a 4
    // (casos 5 e 6, sobre os ids de Usuário, estão em UsuarioTest)
    // ------------------------------------------------------------------

    @Test
    @DisplayName("A segunda música criada recebe o id da primeira mais um")
    public void pl08Caso1_segundaMusicaRecebeOIdDaPrimeiraMaisUm() {
        Musica primeira = new Musica("Faixa 1", "Artista", 100);
        Musica segunda = new Musica("Faixa 2", "Artista", 100);

        assertEquals(primeira.getId() + 1, segunda.getId());
    }

    @Test
    @DisplayName("Três músicas criadas em sequência têm ids consecutivos")
    public void pl08Caso2_tresMusicasEmSequenciaTemIdsConsecutivos() {
        Musica primeira = new Musica("Faixa 1", "Artista", 100);
        Musica segunda = new Musica("Faixa 2", "Artista", 100);
        Musica terceira = new Musica("Faixa 3", "Artista", 100);

        assertEquals(primeira.getId() + 1, segunda.getId());
        assertEquals(primeira.getId() + 2, terceira.getId());
    }

    @Test
    @DisplayName("Criar um usuário entre duas músicas não interfere nos ids de Música")
    public void pl08Caso3_usuarioNoMeioNaoInterfereNosIdsDeMusica() {
        Musica antes = new Musica("Faixa 1", "Artista", 100);
        Usuario usuario = new Usuario("Lucas", "lucas@sonora.com");
        Musica depois = new Musica("Faixa 2", "Artista", 100);

        assertNotNull(usuario);
        assertEquals(antes.getId() + 1, depois.getId());
    }

    @Test
    @DisplayName("O id da música é igual ao total de músicas criadas até ela")
    public void pl08Caso4_idDaMusicaEIgualAoTotalDeMusicasCriadas() {
        // A 1ª música criada recebe 1, a 2ª recebe 2, e assim por diante:
        // o id sempre coincide com a contagem no momento da criação.
        Musica musica = new Musica("Faixa", "Artista", 100);

        assertEquals(Musica.getContagem(), musica.getId());
    }
}
