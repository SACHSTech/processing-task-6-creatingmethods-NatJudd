import processing.core.PApplet;
/*
 * description: this code draws multiple objects at various locations in different colours
 * 
 * @author: NJudd 
 */

public class Sketch extends PApplet {
  // screen size
  public void settings() {
    size(1100, 550);
  }

  // background colour
  public void setup() {
    background(220);
  }

  // calls methods
  public void draw() {
    // calls draw house for the left side
    drawHouse(35, 61, 77, 30, 60);
    drawHouse(254, 127, 45, 30, 140);
    drawHouse(252, 202, 70, 30, 220);
    drawHouse(161, 193, 129, 30, 300);
    drawHouse(97, 155, 138, 30, 380);
    // calls draw circle
    drawCircle(40, 90, 145, 20);
    drawCircle(40, 150, 225, 20);
  }

  // draw house method
  private void drawHouse(int intR, int intG, int intB, int intPosX, int intPosY) {
    // calculates x position of the house
    for (int i = 0; i <= 16; i++) {
      // spacing
      int intRow = (i * 40 + i * 20);
      // colour
      stroke(intR, intG, intB);
      fill(intR, intG, intB);
      // base and ceiling
      line(intPosX + 20 + intRow, intPosY + 40, intPosX + 60 + intRow, intPosY + 40);
      line(intPosX + 20 + intRow, intPosY + 80, intPosX + 60 + intRow, intPosY + 80);
      // walls
      line(intPosX + 20 + intRow, intPosY + 40, intPosX + 20 + intRow, intPosY + 80);
      line(intPosX + 60 + intRow, intPosY + 40, intPosX + 60 + intRow, intPosY + 80);
      // roof
      triangle(intPosX + 20 + intRow, intPosY + 40, intPosX + 40 + intRow, intPosY + 20, intPosX + 60 + intRow,
          intPosY + 40);
      // door
      line(intPosX + 32 + intRow, intPosY + 80, intPosX + 32 + intRow, intPosY + 60);
      line(intPosX + 48 + intRow, intPosY + 80, intPosX + 48 + intRow, intPosY + 60);
      line(intPosX + 32 + intRow, intPosY + 60, intPosX + 48 + intRow, intPosY + 60);
      // doornob
      ellipse(intPosX + 42 + intRow, intPosY + 71, 2, 2);
    }
  }

  // draw circle method
  private void drawCircle(int intColor, int intPosX, int intPosY, int intDia) {
    // calculates x position of the circle
    for (int i = 0; i < 8; i++) {
      // calculates y position of the circle
      for (int j = 0; j < 2; j++) {
        // spacing
        int intRow = (i * 40 + i * 20) * 2 + 10;
        int intColumn = (j * 60 + j * 20) * 2 + 15;
        // colour
        stroke(intColor);
        fill(intColor);
        // draws circle
        ellipse(intPosX + intRow, intPosY + intColumn, intDia, intDia);
      }
    }
  }
}