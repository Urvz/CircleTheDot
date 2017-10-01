import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class GameController implements ActionListener{
    GameModel gameModel;
    GameView gameView;
    int size;
    int xx;
    int yy;
    public GameController (int size){
        this.size=size;
    }
    public void start(){
        gameModel = new GameModel (size);
        gameView = new GameView (gameModel,this);
    }
    public void reset(){

    }
    public void actionPerformed(ActionEvent e){
        if ( e.getSource() == gameView.reset) {
            System.out.println ("RESET");
            reset();
        } 
        else if ( e.getSource() == gameView.quit) {
            gameView.dispose();
        }
        else if(e.getSource() instanceof DotButton){
            DotButton x = (DotButton) e.getSource();
            //coordinates of the click
            int xval = x.row;
            int yval = x.column;
            //set dot to orange only if dot is available
            if (gameModel.getCurrentStatus(xval,yval)==0){
                x.setType(1);
                gameModel.select(xval,yval);

                
                //get points from original dot
                xx = gameModel.getCurrentDot().getX();
                yy = gameModel.getCurrentDot().getY();
                //make original dot AVAILABLE
                gameModel.setAvailable(xx,yy);
                //make the dot+1 the new DOT
                gameModel.setCurrentDot(xx,yy+1);
                //update the board
                gameView.getBoardView().update();
            }
            System.out.println("CLICKED AT "+x.row+","+ x.column);
        }
    }
}