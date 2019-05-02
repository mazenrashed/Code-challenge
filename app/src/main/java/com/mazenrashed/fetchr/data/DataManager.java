package com.mazenrashed.fetchr.data;

import com.mazenrashed.fetchr.data.local.MagicSqareHelper;

public class DataManager {

    private MagicSqareHelper magicSqareHelper;

    public DataManager(MagicSqareHelper magicSqareHelper) {
        this.magicSqareHelper = magicSqareHelper;
    }

    public int[][] getCalculatedSquare(int n) {
        return magicSqareHelper.calculateMagicSquare(n);
    }
}
