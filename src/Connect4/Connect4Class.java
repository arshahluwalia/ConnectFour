
package Connect4;

/**
 * @author group1
 */
public class Connect4Class {
      
    //ConectFourClass method is called to return the row which is avaiable to drop the piece onto 
    public int ConnectFourClass(String[][] board, int column)
    {
        for(int row = 5; row >= 0; row--)
        {
            //if the element at set index is O, then it returns that row in order to change the icon to the colour
            if(board[row][column].equals("O"))
            {
                return row; 
            }
        }
        //returns -1 if the row doesnt return
        return -1; 
 
    }
    
    //columnFull method to check if a column is full
    public boolean columnFull(String[][] board, int column)
    {
        //temp counter variable
        int tempCounter = 0; 
        //goes through each row in column
        for(int row = 5; row >= 0; row--)
        {
            //atts 1 to tempCounter if that element is not O
            if(!(board[row][column].equals("O")))
            {
                tempCounter ++;  
            }
        }
        //returns true if tempCounter == 6 , meaning it is full
        if(tempCounter == 6)
        {
            return true; 
        }
        //returns false if tempCounter is not equal to 6
        else
        {
            return false; 
        }
        
              
    }
    
    //checkForWin method to check rows, columns and diagonals fro a win
    public int checkForWin(String[][] board)
    {  
 
        //checks horizontally for a win
        for(int row = 0; row <= 5; row++) 
        {
            for(int col = 0; col <= 3; col++) 
            {
                //for temp strings for the 4 pieces 
                String temp1 = board[row][col]; 
                String temp2 = board[row][col+1]; 
                String temp3 = board[row][col+2]; 
                String temp4 = board[row][col+3]; 
                String red = "R"; 
                String yellow = "Y"; 
                
                //if the temp strings are equal to R, then it returns 2, meaning red/computer is the winner 
                if(red.equals(temp1) && temp1.equals(temp2)&& temp2.equals(temp3)&& temp3.equals(temp4))
                {
                    return  2; 
                }
                //if the temp strings are equal to Y, then it returns 1, meaning yellow/player is the winner
                else if(yellow.equals(temp1) && temp1.equals(temp2)&& temp2.equals(temp3)&& temp3.equals(temp4))
                {
                    return  1; 
                }
            }
        }
        
        //checks verticialy for a win
        for(int col = 0; col <= 6; col++)
        {
            for(int row = 0; row <= 2; row++)
            {
                String temp1 = board[row][col]; 
                String temp2 = board[row+1][col]; 
                String temp3 = board[row+2][col]; 
                String temp4 = board[row+3][col]; 
                String red = "R"; 
                String yellow = "Y"; 
                
                if(red.equals(temp1) && temp1.equals(temp2)&& temp2.equals(temp3)&& temp3.equals(temp4))
                {
                    return  2;
                }
                else if(yellow.equals(temp1) && temp1.equals(temp2)&& temp2.equals(temp3)&& temp3.equals(temp4))
                {
                    return  1; 
                }
            }
        }
        
        //checks diagonally left for a win
        for(int row = 3; row <= 5; row++)
        {
            for(int col = 3; col <= 6; col++)
            {
                String temp1 = board[row][col]; 
                String temp2 = board[row-1][col-1]; 
                String temp3 = board[row-2][col-2]; 
                String temp4 = board[row-3][col-3]; 
                String red = "R"; 
                String yellow = "Y"; 
                
                if(red.equals(temp1) && temp1.equals(temp2)&& temp2.equals(temp3)&& temp3.equals(temp4))
                {
                    return 2; 
                }
                else if(yellow.equals(temp1) && temp1.equals(temp2)&& temp2.equals(temp3)&& temp3.equals(temp4))
                {
                    return  1; 
                }
            }
        }
        
        //checks diagonally right for a win
        for(int row = 3; row <= 5; row++)
        {
            for(int col = 0; col <= 3; col++)
            {
                String temp1 = board[row][col]; 
                String temp2 = board[row-1][col+1]; 
                String temp3 = board[row-2][col+2]; 
                String temp4 = board[row-3][col+3]; 
                String red = "R"; 
                String yellow = "Y"; 
                
                if(red.equals(temp1) && temp1.equals(temp2)&& temp2.equals(temp3)&& temp3.equals(temp4))
                {
                    return  2; 
                }
                else if(yellow.equals(temp1) && temp1.equals(temp2)&& temp2.equals(temp3)&& temp3.equals(temp4))
                {
                    return  1;
                }
            }
        }
        
        //checks it is a tie 
        
        int tempCounter = 1; 
        //nested for loops go through all of the indexes in game board matrix
        for(int row = 0; row <= 5; row++)
        {
            for(int col = 0; col <= 6; col++)
            {
                if(!(board[row][col].equals("O")))
                {   
                    //adds 1 to tempCounter if the elemtn is not equal to O
                    tempCounter++; 
                }
            }
        }
        //if tempCounter adds up to 42, then it returns 3, meaning it is a draw
        if(tempCounter == 42)
        {
            return  3; 
        }
        
        //returns -1 is none of the above return statements work
        return -1; 
    }
    
}
