import processing.core.PApplet;

/**
 * draws multiple objects at various locations in different colours
 * 
 * @author NJudd
 */

public class Sketch extends PApplet {
  /**
   * initializes screen size
   * 
   * @author Njudd
   */
  public void settings() {
    size(1100, 550);
  }

  /**
   * initializes background colour
   * 
   * @author NJudd
   */
  public void setup() {
    background(220);
  }

  /**
   * top level method to execute the program
   * 
   * @author NJudd
   */
  public void draw() {
    // calls draw house for the left side
    drawHouse(35, 61, 77, 0, 60);
    drawHouse(254, 127, 45, 0, 140);
    drawHouse(252, 202, 70, 0, 220);
    drawHouse(161, 193, 129, 0, 300);
    drawHouse(97, 155, 138, 0, 380);
    // calls draw house for the right side
    drawHouse(35, 61, 77, 660, 60);
    drawHouse(254, 127, 45, 660, 140);
    drawHouse(252, 202, 70, 660, 220);
    drawHouse(161, 193, 129, 660, 300);
    drawHouse(97, 155, 138, 660, 380);
    // calls draw circle for the left side
    drawCircle(40, 60, 145, 20);
    drawCircle(40, 120, 225, 20);
    // calls draw circle for the right side
    drawCircle(40, 720, 145, 20);
    drawCircle(40, 780, 225, 20);
    // calls draw mansion and findX
    drawMansion(40, findX(1100), 425);
  }

  /**
   * prints an array of houses
   * 
   * @param intR    red value of the house colour
   * @param intG    green value of the house colour
   * @param intB    blue value of the house colour
   * @param intPosX x coordinate of the house
   * @param intPosY y coordinate of the house
   * 
   * @author NJudd
   */
  private void drawHouse(int intR, int intG, int intB, int intPosX, int intPosY) {
    // calculates x position of the house
    for (int i = 0; i <= 6; i++) {
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

  /**
   * prints an array of circles
   * 
   * @param intColor rgb value of the circle colour
   * @param intPosX  x coordinate of the circle centre
   * @param intPosY  y coordinate of the circle centre
   * @param intDia   diameter of the circle
   * 
   * @author NJudd
   */
  private void drawCircle(int intColor, int intPosX, int intPosY, int intDia) {
    // calculates x position of the circle
    for (int i = 0; i < 3; i++) {
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

  /**
   * calculates x coordinate of the bottom left corner of the mansion
   * 
   * @param intScreenWidth width of the screen
   * 
   * @return intPosX the value of the x coordinate
   * 
   * @author NJudd
   */
  private int findX(int intScreenWidth) {
    int intPosX = intScreenWidth / 2 - 100;
    return intPosX;
  }

  /**
   * prints the mansion
   * 
   * @param intColor colour of the mansion
   * @param intPosX  x coordinate of the mansion
   * @param intPosY  y coordinate of the mansion
   * 
   * @author NJudd
   */
  private void drawMansion(int intColor, int intPosX, int intPosY) {
    // colour
    stroke(intColor);
    fill(intColor);
    // base and ceiling
    line(intPosX, intPosY, intPosX + 200, intPosY);
    line(intPosX, intPosY - 200, intPosX + 200, intPosY - 200);
    // walls
    line(intPosX, intPosY, intPosX, intPosY - 200);
    line(intPosX + 200, intPosY, intPosX + 200, intPosY - 200);
    // roof
    triangle(intPosX, intPosY - 200, intPosX + 100, intPosY - 300, intPosX + 200, intPosY - 200);
    // door
    line(intPosX + 70, intPosY, intPosX + 70, intPosY - 80);
    line(intPosX + 130, intPosY, intPosX + 130, intPosY - 80);
    line(intPosX + 70, intPosY - 80, intPosX + 130, intPosY - 80);
    // doornob
    ellipse(intPosX + 110, intPosY - 37, 10, 10);
  }
}