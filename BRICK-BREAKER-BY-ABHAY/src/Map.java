import java.awt.*;
import java.util.Random;

public class Map {
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    public int totalBricks;
    public Map(int row,int col){
       remap(row,col);
    }
    public void remap(int row , int col)
    {
         totalBricks=0;
        Random random = new Random();
        map=new int[row][col];
        for(int i=0;i< 15;i++){
            
               int x = random.nextInt(row);
               int y = random.nextInt(col);
               map[x][y]=1;

        }
         for(int i=0;i< map.length;i++){
            for(int j=0;j<map[0].length;j++){
              if(map[i][j]>0){
                 totalBricks++;
                
              }
            }
        }
        brickWidth=450/col;
        brickHeight=150/row;
    }
    public void draw(Graphics2D g){
        for(int i=0;i< map.length;i++){
            for(int j=0;j<map[0].length;j++){
              if(map[i][j]>0){
                  g.setColor(Color.blue);
                  g.fillRect(j*brickWidth+80,i*brickHeight+50, brickWidth,brickHeight);
                  g.setStroke(new BasicStroke(3));
                  g.setColor(Color.black);
                  g.drawRect(j*brickWidth+80,i*brickHeight+50, brickWidth,brickHeight);
                
              }
            }
        }

    }
    public void setBrickValue(int value,int row,int col){
        map[row][col]=value;
    }
}
