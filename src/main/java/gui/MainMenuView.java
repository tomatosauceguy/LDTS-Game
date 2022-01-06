package gui;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import gui.Stages.Start;

import java.io.IOException;

public class MainMenuView {
  
  private final Screen screen;
  private final TextGraphics graphics;
  private final Start a;
  
  public MainMenuView(GameView gui, int width, int height) {
    this.graphics = gui.getGraphics();
    this.screen = gui.getScreen();
    this.a = new Start(width,height);
  }
  
  public void draw() throws IOException {
    screen.clear();
    a.draw(graphics);
    screen.refresh();
  }
  
}
