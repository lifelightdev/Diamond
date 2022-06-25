import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Diamond_Test {

    @Test
    void diamon_A(){
        String A = Diamond.drow('A');
        assertThat(A).isEqualTo("A");
    }


}
