import java.util.ArrayList;
import java.util.Scanner;

public class Cube {

    static boolean proceed = true;
    static ArrayList <String> solutionStack = new ArrayList<>();

    static void solve(){
        for(int i = solutionStack.size()-1; i>=0; i--){
            System.out.print(solutionStack.get(i)+" ");
            solutionStack.remove(i);
        }
    }

	 static String[][] face = {
        {"1","2","3"},
        {"4","5","6"},
        {"7","8","9"}
    };

    // static String[][] cube2 = {
    //     {"r","r","r",
    //      "r","r","r",
    //      "r","r","r"},

    //     {"b","b","b",
    //      "b","b","b",
    //      "b","b","b"},

    //     {"g","g","g",
    //      "g","g","g",
    //      "g","g","g"},

    //     {"r","r","r",
    //      "r","r","r",
    //      "r","r","r"},

    //     {"r","r","r",
    //      "r","r","r",
    //      "r","r","r"},

    //     {"r","r","r",
    //      "r","r","r",
    //      "r","r","r"},

    //     {"r","r","r",
    //      "r","r","r",
    //      "r","r","r"},
    // }

    static String[][][] cube = {
        {
            {"1r","2r","3r"},
            {"4r","5r","6r"},
            {"7r","8r","9r"}
        },
        {
            {"1b","2b","3b"},
            {"4b","5b","6b"},
            {"7b","8b","9b"}
        },
        {
            {"1g","2g","3g"},
            {"4g","5g","6g"},
            {"7g","8g","9g"}
        },
        {
            {"1y","2y","3y"},
            {"4y","5y","6y"},
            {"7y","8y","9y"}
        },
        {
            {"1w","2w","3w"},
            {"4w","5w","6w"},
            {"7w","8w","9w"}
        },
        {
            {"1o","2o","3o"},
            {"4o","5o","6o"},
            {"7o","8o","9o"}
        }
    };

    static void move(String[][][] Cube, String input){
        switch(input.toLowerCase()){
            case "u":
                    solutionStack.add("u'");

                rotateFace(cube[5], true);
                rotateedge()
                show(face);
                //Code Block
                break;
            
			case "d":
                    solutionStack.add("d'");

                    
				//Code Block
				break;
			
			case "l":
                    solutionStack.add("l'");
                //Code Block
                break;
           
			case "r":
                    solutionStack.add("r'");
				//Code Block
				break;
			
			case "b":
                    solutionStack.add("b'");
                //Code Block
                break;
          
			case "f":
                    solutionStack.add("f'");
				//Code Block
				break;
		
			case "u'":
                move(Cube,"u");
                move(Cube,"u");
                move(Cube,"u");
                //Code Block
                break;
           
			case "d'":

				//Code Block
				break;
		
			case "l'":

                //Code Block
                break;
   
			case "r'":

				//Code Block
				break;
		
			case "b'":

                //Code Block
                break;
         
			case "f'":

				//Code Block
				break;

            case "q":
                proceed = false;
                break;
			default:

        }
    }

    static void show(String[][] Face){
        for(String[] i: Face){
            for(String j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void rotateEdge(int[] edg1, int[] edg2, int[] edg3, int[] edg4){

    }

    static void rotateFace(String[][] Face, boolean clockwise){

        String[][] tempFace = new String[3][3];

        for(int i=0; i<3;i++)
            for(int j=0; j<3;j++)
                tempFace[i][j] = Face[i][j];

        if(clockwise){
            //order is Face[y][x] or Face[row][col]

           for (int i=0; i<face.length; i++) {
				for (int j=0; j<face.length; j++) {
					if (i == 0)
						Face[i][j] = tempFace[j][2];
					if (i == 1)
						Face[i][j] = tempFace[j][1];
					if (i == 2)
						Face[i][j] = tempFace[j][0];
				}

		   }

		   
		   // Face[0][0] = tempFace[0][2];
            //Face[0][1] = tempFace[1][2];
            //Face[0][2] = tempFace[2][2];
            //Face[1][0] = tempFace[0][1];
            //Face[1][1] = tempFace[1][1];
            //Face[1][2] = tempFace[2][1];
            //Face[2][0] = tempFace[0][0];
            //Face[2][1] = tempFace[1][0];
            //Face[2][2] = tempFace[2][0];
        }
        else{
                rotateFace(Face, false);
                rotateFace(Face, false);
                rotateFace(Face, false);

        }


    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            // while(proceed){
            //     move(cube, input.next());

            // }
            // solve();
        rotateFace(face, true);
        rotateedge
        show(face);
    }
}



