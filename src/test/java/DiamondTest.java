import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DiamondTest {

    @Test
    void diamon_A(){
        String A = Diamond.drow('A');
        assertThat(A).isEqualTo("A");
    }

    @Test
    void diamon_B(){
        String A = Diamond.drow('B');
        assertThat(A).isEqualTo(" A\nB B\n A");
    }

    @Test
    void diamon_C(){
        String A = Diamond.drow('C');
        assertThat(A).isEqualTo("""
                  A
                 B B
                C   C
                 B B
                  A""");
    }


}
