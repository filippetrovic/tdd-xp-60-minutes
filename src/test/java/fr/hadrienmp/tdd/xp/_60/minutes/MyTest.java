package fr.hadrienmp.tdd.xp._60.minutes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MyTest {
    @Test
    public void shouldReturnEvenNumber() {
        int nombre = checkNumber();
        Assertions.assertThat(nombre%2).isEqualTo(0);
    }

    public int checkNumber(){
        return 0;
    }
}
