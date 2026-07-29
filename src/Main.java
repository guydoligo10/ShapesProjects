
public class Main {
	//זה מחלקה ראשית לדוגמה כדי שתבינו מה בעצם אתם הולכים לראות, עליכם בעצם למחוק את מה שיש בפעולה הראשית עצמה, 
	//לבנות במחלקה הראשית הזו את אוסף הצורות שלכם, ולבנות מחוץ לפעולה הראשית, אלא ממש כאן למטה
	//את הפעולות הסטטיות שלכם
    public static void move1(Square houseBody, Triangle roof, Rectangle door,
                             Circle doorHandle, Square windowLeft, Square windowRight,
                             Rectangle signBoard,Line windowLeftV, Line windowLeftH, Line windowRightV, Line windowRightH, Text signText, int newX, int newY) {
        int currentX = 400;
        int currentY = 250;

        int deltaX = newX - currentX;
        int deltaY = newY - currentY;

        //הפינה השמאלית
        int minXAfter = 400 + deltaX;
        //הפינה הימנית
        int maxXAfter = 600 + deltaX;
        //הפינה העליונה שעל הגג
        int minYAfter = 150 + deltaY;
        //הפינה התחתונה
        int maxYAfter = 450 + deltaY;


        if (minXAfter < 0 || maxXAfter > 1000 || minYAfter < 0 || maxYAfter > 600) {
            System.out.println("out of boundaries! try again with a different number...");
            return;
        }

        houseBody.move(deltaX, deltaY);
        roof.move(deltaX, deltaY);
        door.move(deltaX, deltaY);
        doorHandle.move(deltaX, deltaY);
        windowLeft.move(deltaX, deltaY);
        windowRight.move(deltaX, deltaY);
        signBoard.move(deltaX, deltaY);
        windowLeftV.move(deltaX, deltaY);
        windowLeftH.move(deltaX, deltaY);
        windowRightV.move(deltaX, deltaY);
        windowRightH.move(deltaX, deltaY);
        signText.move(deltaX, deltaY);
    }

    public static void move2(Square houseBody, Triangle roof, Rectangle door,
                             Circle doorHandle, Square windowLeft, Square windowRight,
                             Rectangle signBoard,Line windowLeftV, Line windowLeftH, Line windowRightV, Line windowRightH, Text signText, int deltaX, int deltaY){


        //הפינה השמאלית
        int minXAfter = 400 + deltaX;
        //הפינה הימנית
        int maxXAfter = 600 + deltaX;
        //הפינה העליונה שעל הגג
        int minYAfter = 150 + deltaY;
        //הפינה התחתונה
        int maxYAfter = 450 + deltaY;


        if (minXAfter < 0 || maxXAfter > 1000 || minYAfter < 0 || maxYAfter > 600) {
            System.out.println("out of boundaries! try again with a different number...");
            return;
        }

        houseBody.move(deltaX, deltaY);
        roof.move(deltaX, deltaY);
        door.move(deltaX, deltaY);
        doorHandle.move(deltaX, deltaY);
        windowLeft.move(deltaX, deltaY);
        windowRight.move(deltaX, deltaY);
        signBoard.move(deltaX, deltaY);
        windowLeftV.move(deltaX, deltaY);
        windowLeftH.move(deltaX, deltaY);
        windowRightV.move(deltaX, deltaY);
        windowRightH.move(deltaX, deltaY);
        signText.move(deltaX, deltaY);
    }



    public static void copyShape(Square houseBody, Triangle roof, Rectangle door,
                             Circle doorHandle, Square windowLeft, Square windowRight,
                             Rectangle signBoard,Line windowLeftV, Line windowLeftH, Line windowRightV, Line windowRightH, Text signText, int newX, int newY) {
        //הפינה השמאלית
        int minXAfter = newX;
        //הפינה הימנית
        int maxXAfter = newX + 200;
        //הפינה העליונה שעל הגג
        int minYAfter = newY - 100;
        //הפינה התחתונה
        int maxYAfter = newY + 200;

        if (minXAfter < 0 || maxXAfter > 1000 || minYAfter < 0 || maxYAfter > 600) {
            System.out.println("out of boundaries! try again with a different number...");
            return;
        }


        houseBody = new Square(newX, newY, 200, "red");
        roof = new Triangle(newX + 100, newY - 100, 200, 100, "yellow");
        door = new Rectangle(newX + 75, newY + 80, 50, 120, "blue");
        doorHandle = new Circle(newX + 115, newY + 140, 5, "white");
        windowLeft = new Square(newX + 20, newY + 30, 40, "blue");
        windowRight = new Square(newX + 140, newY + 30, 40, "blue");
        windowLeftV = new Line(newX + 40, newY + 30, newX + 40, newY + 70, "black");
        windowLeftH = new Line(newX + 20, newY + 50, newX + 60, newY + 50, "black");
        windowRightV = new Line(newX + 160, newY + 30, newX + 160, newY + 70, "black");
        windowRightH = new Line(newX + 140, newY + 50, newX + 180, newY + 50, "black");
        signBoard = new Rectangle(newX + 15, newY + 100, 50, 30, "magenta");
        signText = new Text(newX + 20, newY + 120, "HOME", "black");
    }


	public static void main(String[] args) {

                Square houseBody = new Square(400, 250, 200, "red");
                Triangle roof = new Triangle(500, 150, 200, 100, "yellow");
                Rectangle door = new Rectangle(475, 330, 50, 120, "blue");
                Circle doorHandle = new Circle(515, 390, 5, "white");
                Square windowLeft = new Square(420, 280, 40, "blue");
                Square windowRight = new Square(540, 280, 40, "blue");
                Line windowLeftV = new Line(440, 280, 440, 320, "black");
                Line windowLeftH = new Line(420, 300, 460, 300, "black");
                Line windowRightV = new Line(560, 280, 560, 320, "black");
                Line windowRightH = new Line(540, 300, 580, 300, "black");
                Rectangle signBoard = new Rectangle(415, 350, 50, 30, "magenta");
                Text signText = new Text(420, 370, "HOME", "black");

       // move1(houseBody, roof, door, doorHandle, windowLeft, windowRight, signBoard, windowLeftV, windowLeftH, windowRightV, windowRightH, signText, 700, 400);
        //move2(houseBody, roof, door, doorHandle, windowLeft, windowRight, signBoard, windowLeftV, windowLeftH, windowRightV, windowRightH, signText, 100, 100 );
        // copyShape(houseBody, roof, door, doorHandle, windowLeft, windowRight, signBoard, windowLeftV, windowLeftH, windowRightV, windowRightH, signText, 700, 400);

    }
    }
