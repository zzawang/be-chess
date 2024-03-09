package pieces;

import java.util.List;
import utils.Position;

public class Knight extends Piece {
    private Knight(Color color, PieceSymbol pieceSymbol, Position position) {
        super(color, pieceSymbol, position);
    }

    public static Knight create(Color color, Position position) {
        return new Knight(color, PieceSymbol.KNIGHT, position);
    }

    @Override
    public List<Direction> getDirections() {
        return Direction.knightDirection();
    }

    @Override
    public boolean verifyMovePosition(Position targetPos) {
        List<Position> positions = getDirections().stream()
                .filter(this.position::isValidDirection)
                .map(this.position::addPos)
                .toList(); // 이동 가능한 위치 리스트

        return positions.contains(targetPos);
    }

    @Override
    public boolean isObstacleInPath(Position targetPos, List<Position> obstacles) {
        return obstacles.contains(targetPos);
    }
}
