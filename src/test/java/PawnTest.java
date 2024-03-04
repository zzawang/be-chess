import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import piece.Pawn;

public class PawnTest {
    @Test
    @DisplayName("흰색 폰이 생성되어야 한다")
    public void create() {
        String whiteColor = "white";
        String blackColor = "black";
        verifyPawn(whiteColor);
        verifyPawn(blackColor);
    }

    private void verifyPawn(final String color) {
        Pawn pawn = new piece.Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }
}