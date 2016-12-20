public class MineSweeper{
private Mines[][] mines;
private int coordinates;
private int bombCounter;
private boolean isFlagged;
private boolean isActive;
private Random rand = new Random();

// ==CONSTRUCTOR == //
public MineSweeper(){

}
//== do I need a method over the switch statemente? or is the switch statement a method in itself? ==//
public void gameSelection(int level){
  switch(level){
    case 1: MineSweeper.easyLevel();
    break;
    case 2: MineSweeper.mediumLevel();
    break;
    case 3: MineSweeper.hardLevel();
    break;
    default: MineSweeper.easyLevel();
//== or: case 1 : mines = new mines[10][10];
//== case 2: mines = new mines[20][20];
//== case 3: mines = new mines[30][30];  then do a for loop to assign boolean
// values to everything


  }
}
// == I did this since I believe that ths way java will create a new instance of random everytime it's called and it wont use the same numbers == //
public int getRand(int max){
  Random rand = new Random();
  return rand.nextInt(max);
}
//public void minesDistribution()
// == how do I get the program to return more false than true values? ==//

public boolean isActive(int i int j){
  return mines[i][j];

}
public void easyLevel(){
  mines = new mines[10][10];
  for(int i = 0; i< mines.length; i++){
    for(int j = 0; i< mines[i].length; j++){
      mines[i][j].rand.nextBoolean();
    }
  }
}
public void MediumLevel(){
  mines = new mines[20][20];
  for(int i = 0; i< mines.length; i++){
    for(int j = 0; i< mines[i].length; j++){
      mines[i][j].rand.nextBoolean();
    }
  }
}
public void hardLevel(){
  mines = new mines[30][30];
  for(int i = 0; i< mines.length; i++){
    for(int j = 0; i< mines[i].length; j++){
      mines[i][j].rand.nextBoolean();
    }
  }
}

}
