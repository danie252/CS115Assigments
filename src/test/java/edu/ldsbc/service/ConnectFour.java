package edu.ldsbc.service;

/**
 * Created by Daniel on 1/18/2018.
 */
public class ConnectFour {
   private String[][] grid = new String[7][6];


   public void addToken (int x, String playerColor){

       int y = findOpenSlot(x);
       grid [x][y] = playerColor;

   }

     int findOpenSlot(int x) {

         String[] xArray = grid[x];
         int y = 6;
         boolean filled = true;

         while (filled) {
             y = y - 1;
             if(this.grid[x][y] == null || y == -1) {
                 filled = false;
             }


         }
         return y;

     }


    //do we have a winner
    public boolean haveWinner()
    {
        return true;
    }


    public void print (){

    }

}
