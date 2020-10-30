/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.pss.avlimite.interfaces.Bonus;
import com.pss.avlimite.model.BonusAniversario;
import java.time.LocalDate;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author 55289
 */
public class BonusAniversarioTeste {

    public BonusAniversarioTeste() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    
    //teste para o metodo verificaBonus
    @ParameterizedTest
    @MethodSource("dataProvider")
    void CT01(LocalDate data) {
        Bonus exemplo = new BonusAniversario();
        assertEquals(exemplo.verificaBonus(data), true);
    }
    

    //gera os valores para o teste
    private static Stream dataProvider() {
        LocalDate aux;
        return Stream.of(
                Arguments.of("1958-4-09"),//false - limite inferior
                Arguments.of("1972-5-09"),//true
                Arguments.of("1988-10-09"),//true
                Arguments.of("1936-11-09")//false - limite superior
        );
    }
}
