package com.company;

public enum Result {
    WIN, DRAW, LOSS;

    public Result getInverseResult (Result result) {
        if (result.equals(WIN)) {
            return LOSS;
        } else if (result.equals(DRAW)) {
            return DRAW;
        } else if (result.equals(LOSS)) {
            return WIN;
        } else {
            return null;
        }
    }
}
