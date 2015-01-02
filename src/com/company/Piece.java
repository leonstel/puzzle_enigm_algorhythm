package com.company;

public class Piece {

    int piece;
    int currentVersion;

    Vector[] version1;
    Vector[] version2;
    Vector[] version3;
    public Vector currentBoardCo;

    public Piece(int piece){
        this.piece = piece;
        currentVersion = 1;

        switch (piece) {
            case 1:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 1),
                        new Vector(2, 2),
                        new Vector(3, 2),
                        new Vector(4, 2)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, -1),
                        new Vector(0, -2),
                        new Vector(-1, -3),
                        new Vector(-2, -4)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, 0),
                        new Vector(-2, 0),
                        new Vector(-2, 1),
                        new Vector(-2, 2)
                };
                break;
            case 2:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 1),
                        new Vector(1, 2),
                        new Vector(2, 2),
                        new Vector(3, 2)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, -1),
                        new Vector(1, -1),
                        new Vector(0, -2),
                        new Vector(-1, -3)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, 0),
                        new Vector(-2, -1),
                        new Vector(-2, 0),
                        new Vector(-2, 1)
                };
                break;
            case 3:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, 1),
                        new Vector(1, 1),
                        new Vector(1, 0),
                        new Vector(2, 0)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 0),
                        new Vector(0, -1),
                        new Vector(-1, -1),
                        new Vector(-2, -2)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, -1),
                        new Vector(-1, 0),
                        new Vector(0, 1),
                        new Vector(0, 2)
                };
                break;
            case 4:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, -1),
                        new Vector(1, 0),
                        new Vector(-1, -2),
                        new Vector(-1, -3)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, 0),
                        new Vector(-1, -1),
                        new Vector(-1, 1),
                        new Vector(-2, 1)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 1),
                        new Vector(0, 1),
                        new Vector(2, 1),
                        new Vector(3, 2)
                };
                break;
            case 5:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 0),
                        new Vector(2, 0),
                        new Vector(2, 1),
                        new Vector(3, 2)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, -1),
                        new Vector(-2, -2),
                        new Vector(-1, -2),
                        new Vector(-1, -3)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, 1),
                        new Vector(0, 2),
                        new Vector(-1, 1),
                        new Vector(-2, 1)
                };
                break;
            case 6:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 0),
                        new Vector(2, 0),
                        new Vector(2, -1),
                        new Vector(3, -1)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, -1),
                        new Vector(-2, -2),
                        new Vector(-3, -2),
                        new Vector(-4, -3)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, 1),
                        new Vector(0, 2),
                        new Vector(1, 3),
                        new Vector(1, 4)
                };
                break;
            case 7:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 0),
                        new Vector(1, -1),
                        new Vector(2, 1),
                        new Vector(3, 2)  // !!
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, -1),
                        new Vector(-2, -1),
                        new Vector(-1, -2),
                        new Vector(-1, -3)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, 1),
                        new Vector(1, 2),
                        new Vector(-1, 1),
                        new Vector(-2, 1)
                };
                break;
            case 8:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 1),
                        new Vector(2, 2),
                        new Vector(3, 3),
                        new Vector(4, 3)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, -1),
                        new Vector(0, -2),
                        new Vector(0, -3),
                        new Vector(-1, -4)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, 0),
                        new Vector(-2, 0),
                        new Vector(-3, 0),
                        new Vector(-3, 1)  // !!
                };
                break;
            case 9:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 1),
                        new Vector(1, 0),
                        new Vector(1, -1),
                        new Vector(2, -1)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, -1),
                        new Vector(-1, -1),
                        new Vector(-2, -1),
                        new Vector(-3, -2)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, 0),
                        new Vector(0, 1),
                        new Vector(1, 2),
                        new Vector(1, 3)  // !!
                };
                break;
            case 10:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 0),
                        new Vector(1, -1),
                        new Vector(2, -1),
                        new Vector(2, 0)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, -1),
                        new Vector(-2, -1),
                        new Vector(-3, -2),
                        new Vector(-2, -2)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, 1),
                        new Vector(1, 2),
                        new Vector(1, 3),
                        new Vector(0, 2)
                };
                break;
            case 11:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 0),
                        new Vector(2, 0),
                        new Vector(3, 0),
                        new Vector(3, 1)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, -1),
                        new Vector(-2, -2),
                        new Vector(-3, -3),
                        new Vector(-2, -3)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, 1),
                        new Vector(0, 2),
                        new Vector(0, 3),
                        new Vector(-1, 2)
                };
                break;
            case 12:
                version1 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(1, 1),
                        new Vector(2, 1),
                        new Vector(3, 1),
                        new Vector(2, 0)
                };

                version2 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(0, -1),
                        new Vector(-1, -2),
                        new Vector(-2, -3),
                        new Vector(-2, -2)
                };

                version3 = new Vector[]{
                        new Vector(0, 0),
                        new Vector(-1, 0),
                        new Vector(-1, 1),
                        new Vector(-1, 2),
                        new Vector(0, 2)
                };
                break;
        }
    }
}