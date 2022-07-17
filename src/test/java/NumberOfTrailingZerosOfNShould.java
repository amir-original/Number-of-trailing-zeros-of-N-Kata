import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfTrailingZerosOfNShould {

    @Test
    void get_calculate_the_number_of_trailing_zeros_in_a_factorial_of_a_given_number() {
        final Solution numberCalculator = new Solution();
        assertThat(numberCalculator.zeros(0)).isEqualTo(0);
        assertThat(numberCalculator.zeros(6)).isEqualTo(1);
        assertThat(numberCalculator.zeros(14)).isEqualTo(2);
        assertThat(numberCalculator.zeros(20)).isEqualTo(4);
        assertThat(numberCalculator.zeros(25)).isEqualTo(6);
        assertThat(numberCalculator.zeros(30)).isEqualTo(7);
        assertThat(numberCalculator.zeros(35)).isEqualTo(8);
        assertThat(numberCalculator.zeros(40)).isEqualTo(9);
        assertThat(numberCalculator.zeros(45)).isEqualTo(10);
        assertThat(numberCalculator.zeros(50)).isEqualTo(12);
        assertThat(numberCalculator.zeros(55)).isEqualTo(13);
        assertThat(numberCalculator.zeros(100)).isEqualTo(24);
        assertThat(numberCalculator.zeros(120)).isEqualTo(28);
        assertThat(numberCalculator.zeros(125)).isEqualTo(31);
        assertThat(numberCalculator.zeros(150)).isEqualTo(37);
        assertThat(numberCalculator.zeros(200)).isEqualTo(49);
        assertThat(numberCalculator.zeros(200)).isEqualTo(49);
        assertThat(numberCalculator.zeros(250)).isEqualTo(62);
        assertThat(numberCalculator.zeros(300)).isEqualTo(74);
        assertThat(numberCalculator.zeros(300)).isEqualTo(74);
        assertThat(numberCalculator.zeros(500)).isEqualTo(124);
        assertThat(numberCalculator.zeros(800)).isEqualTo(199);
        assertThat(numberCalculator.zeros(1000)).isEqualTo(249);
    }
}
