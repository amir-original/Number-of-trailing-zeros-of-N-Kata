import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfTrailingZerosOfNShould {

    @Test
    void get_calculate_the_number_of_trailing_zeros_in_a_factorial_of_a_given_number() {
        final NumberCalculator numberCalculator = new NumberCalculator();

        assertThat(numberCalculator.zeros(0)).isEqualTo(0);
        assertThat(numberCalculator.zeros(2)).isEqualTo(0);
        assertThat(numberCalculator.zeros(4)).isEqualTo(0);
        assertThat(numberCalculator.zeros(5)).isEqualTo(1);
        assertThat(numberCalculator.zeros(6)).isEqualTo(1);
        assertThat(numberCalculator.zeros(7)).isEqualTo(1);
        assertThat(numberCalculator.zeros(12)).isEqualTo(2);
        assertThat(numberCalculator.zeros(14)).isEqualTo(2);
        assertThat(numberCalculator.zeros(18)).isEqualTo(3);
    }
}
