package com.mazenrashed.fetchr.ui;

import com.mazenrashed.fetchr.data.DataManager;

public class ResultViewModel {

    private DataManager dataManager;

    ResultViewModel(DataManager dataManager){
        this.dataManager = dataManager;
    }

    public String getMagicSquare(int n) {
        int[][] magicSquare = dataManager.getCalculatedSquare(n);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = magicSquare.length - 1; j >= 0; j--) {
                builder.append(magicSquare[i][j]);
                builder.append(" ");
            }
            builder.append("\n");
        }

        return builder.toString();
    }


}
