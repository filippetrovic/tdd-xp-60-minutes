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
    public int checkNumber(){
        return 12;
    }
}
