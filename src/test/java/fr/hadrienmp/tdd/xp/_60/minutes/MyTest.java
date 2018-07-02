package fr.hadrienmp.tdd.xp._60.minutes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MyTest {
    @Test
    public void shouldReturnEvenNumber() {
        int nombre = checkNumber();
        Assertions.assertThat(nombre%2).isEqualTo(0);
    }

    @Test
    public void shouldEndshWith2() {
        int nombre = checkNumber();
        Assertions.assertThat(nombre%10).isEqualTo(2);
    }

    @Test
    public void souldBeGreaterThan9() {
        int nombre = checkNumber();
        Assertions.assertThat(nombre).isGreaterThan(9);
    }

    @Test
    public void test2() {
        int nombre = checkNumber();
        Assertions.assertThat(nombre).isLessThan(100);
    }

    @Test
    public void test3() {
        int nombre = checkNumber();
        int dizaine = nombre/10;
        int unite = nombre%10;
        Assertions.assertThat(dizaine+unite).isEqualTo(6);
    }
    public int checkNumber(){
        return 42;
    }
}
