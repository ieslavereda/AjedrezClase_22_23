package es.ieslavereda.model;

public interface IDeletePieceManager {
    void addPiece(Piece piece);
    int count(Piece.PieceType pieceType);
    Piece removeLast();
}
