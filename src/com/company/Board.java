package com.company;

import java.util.ArrayList;

public class Board {

    int[][] board;
    private final ArrayList<Vector> availableBoardCo = new ArrayList<Vector>();

    Piece[] pieces;

    private ArrayList<Piece> currentPieces = new ArrayList<Piece>();

    public Board(){
        board = new int[][] {
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5, 6},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6, 7, 8},
                {0, 1, 2, 3, 4, 5, 6, 7},
                {0, 1, 2, 3, 4, 5, 6},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4}
        };

//        board = new int[][] {
//                {0, 1, 2, 3, 4},
//                {0, 1, 2, 3, 4, 5},
//                {0, 1, 2, 3, 4, 5, 6},
//                {0, 1, 2, 3, 4, 5, 6, 7}
//        };

        availableBoardCo.add(new Vector(0,0));
        availableBoardCo.add(new Vector(1,0));
        availableBoardCo.add(new Vector(2,0));
        availableBoardCo.add(new Vector(3,0));
        availableBoardCo.add(new Vector(4,0));

        availableBoardCo.add(new Vector(0,1));
        availableBoardCo.add(new Vector(1,1));
        availableBoardCo.add(new Vector(2,1));
        availableBoardCo.add(new Vector(3,1));
        availableBoardCo.add(new Vector(4,1));
        availableBoardCo.add(new Vector(5,1));

        availableBoardCo.add(new Vector(0,2));
        availableBoardCo.add(new Vector(1,2));
        availableBoardCo.add(new Vector(2,2));
        availableBoardCo.add(new Vector(3,2));
        availableBoardCo.add(new Vector(4,2));
        availableBoardCo.add(new Vector(5,2));
        availableBoardCo.add(new Vector(6,2));

        availableBoardCo.add(new Vector(0,3));
        availableBoardCo.add(new Vector(1,3));
        availableBoardCo.add(new Vector(2,3));
        availableBoardCo.add(new Vector(3,3));
        availableBoardCo.add(new Vector(4,3));
        availableBoardCo.add(new Vector(5,3));
        availableBoardCo.add(new Vector(6,3));
        availableBoardCo.add(new Vector(7,3));

//        availableBoardCo.add(new Vector(0,4));
//        availableBoardCo.add(new Vector(1,4));
//        availableBoardCo.add(new Vector(2,4));
//        availableBoardCo.add(new Vector(3,4));
//        availableBoardCo.add(new Vector(4,4));
//        availableBoardCo.add(new Vector(5,4));
//        availableBoardCo.add(new Vector(6,4));
//        availableBoardCo.add(new Vector(7,4));
//        availableBoardCo.add(new Vector(8,4));
//
//        availableBoardCo.add(new Vector(1,5));
//        availableBoardCo.add(new Vector(2,5));
//        availableBoardCo.add(new Vector(3,5));
//        availableBoardCo.add(new Vector(4,5));
//        availableBoardCo.add(new Vector(5,5));
//        availableBoardCo.add(new Vector(6,5));
//        availableBoardCo.add(new Vector(7,5));
//        availableBoardCo.add(new Vector(8,5));
//
//        availableBoardCo.add(new Vector(2,6));
//        availableBoardCo.add(new Vector(3,6));
//        availableBoardCo.add(new Vector(4,6));
//        availableBoardCo.add(new Vector(5,6));
//        availableBoardCo.add(new Vector(6,6));
//        availableBoardCo.add(new Vector(7,6));
//        availableBoardCo.add(new Vector(8,6));
//
//        availableBoardCo.add(new Vector(3,7));
//        availableBoardCo.add(new Vector(4,7));
//        availableBoardCo.add(new Vector(5,7));
//        availableBoardCo.add(new Vector(6,7));
//        availableBoardCo.add(new Vector(7,7));
//        availableBoardCo.add(new Vector(8,7));
//
//        availableBoardCo.add(new Vector(4,8));
//        availableBoardCo.add(new Vector(5,8));
//        availableBoardCo.add(new Vector(6,8));
//        availableBoardCo.add(new Vector(7,8));
//        availableBoardCo.add(new Vector(8,8));

        pieces = new Piece[]{
                new Piece(1),
                new Piece(2),
                new Piece(3),
                new Piece(4),
//                new Piece(5),
//                new Piece(6),
//                new Piece(7),
//                new Piece(8),
//                new Piece(9),
//                new Piece(10),
//                new Piece(11),
//                new Piece(12)
        };

        SolveEnigma(1);
    }

    private boolean SolveEnigma(int p) {

        Vector currentBoardCo = new Vector(0,0);

        Piece piece = pieces[p-1];
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                currentBoardCo = new Vector(x, y);

                System.out.println("lay down p : "+p+" at ["+x+","+y+"]");

                for(int v = 1; v<4; v++) {
                    boolean result = TryToFit(piece, v, currentBoardCo);
                    if (result) {
                        System.out.println("piece " + piece.piece + " fits"+" version : "+v);
                        if (p < pieces.length) {
                            if (SolveEnigma(piece.piece + 1)) {
                                return true;
                            } else {
                                System.out.println("restore empty of piece " + p +" version : "+v);
                                restoreEmptySpots(currentBoardCo, currentPieces.get(currentPieces.size() - 1));
                                currentPieces.remove(currentPieces.size() - 1);
                            }
                        } else {
                            System.out.println("finish");
                            for (int c = 0; c<currentPieces.size(); c++){
                                System.out.println(
                                        "piece : "+currentPieces.get(c).piece+
                                        " version 1 : "+currentPieces.get(c).currentVersion+
                                        " currentBoardCo : ["+currentPieces.get(c).currentBoardCo.x+","+currentPieces.get(c).currentBoardCo.y+"]");
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean TryToFit(Piece piece, int v, Vector currentBoardCo){
            boolean pieceFit = true;

            Vector[] version = getVersionCoos(piece, v);

            for (int co = 0; co < version.length; co++) {
                Vector versionCo = currentBoardCo.add(version[co]);

                boolean match = false;

                for (int empty = 0; empty < availableBoardCo.size(); empty++) {
                    Vector emptySpot = availableBoardCo.get(empty);
                    if (versionCo.equals(emptySpot)) {
                        match = true;
                        break;
                    } else {
                        match = false;
                    }
                }

                if (!match) {
                    pieceFit = false;
                }

                if (co == version.length - 1 && pieceFit == true) {
                    //lay piece down, discard all used empty places
                    piece.currentVersion = v;
                    piece.currentBoardCo = currentBoardCo;
                    currentPieces.add(piece);
                    discardEmptySpots(currentBoardCo, version);
                    return true;
                }
            }
            return false;
    }

    public void discardEmptySpots(Vector currentBoardCo, Vector[] version){
        for (int co = 0; co < version.length; co++) {
            Vector versionCo = currentBoardCo.add(version[co]);
            for (int empty = 0; empty < availableBoardCo.size(); empty++) {
                Vector emptySpot = availableBoardCo.get(empty);
                if(versionCo.equals(emptySpot)){
                    availableBoardCo.remove(emptySpot);
                    break;
                }
            }
        }
    }

    public void restoreEmptySpots(Vector currentBoardCo, Piece piece){
        Vector[] version = getVersionCoos(piece, piece.currentVersion);

        for (int co = 0; co < version.length; co++) {
            Vector versionCo = currentBoardCo.add(version[co]);
            availableBoardCo.add(versionCo);
        }
    }

    public Vector[] getVersionCoos(Piece piece, int versiontInt){
        Vector[] version = new Vector[0];

        switch (versiontInt){
            case 1:
                version = piece.version1;
                break;
            case 2:
                version = piece.version2;
                break;
            case 3:
                version = piece.version3;
                break;
        }
        return version;
    }
}