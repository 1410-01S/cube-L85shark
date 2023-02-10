public class Cube {

	 static String[][] face = {
        {"1","2","3"},
        {"4","5","6"},
        {"7","8","9"}
    };

    static void move(String[][][] Cube, String input){
        switch(input){
            case "u":
                //Code Block
                break;
            
			case "d":
				//Code Block
				break;
			
			case "l":
                //Code Block
                break;
           
			case "r":
				//Code Block
				break;
			
			case "b":
                //Code Block
                break;
          
			case "f":
				//Code Block
				break;
		
			case "u'":
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


    static void rotateFace(String[][] Face, boolean clockwise){

        String[][] tempFace = new String[3][3];

        for(int i=0; i<3;i++)
            for(int j=0; j<3;j++)
                tempFace[i][j] = Face[i][j];

        if(clockwise){
            //order is Face[y][x] or Face[row][col]

           for (int i=0; i<face.length; i++) {
				for (int j=0; j<face.length; j++) {
					if (Face[i][j] == Face[0][j])
						tempFace[i][2] = Face[i][j];
					if (Face[i][j] == Face[1][j])
						tempFace[i][1] = Face[i][j];
					if (Face[i][j] == Face[2][j])
						tempFace[i][0] = Face[i][j];
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
        }else{

        }


    }


    public static void main(String[] args){
        rotateFace(face, true);
        show(face);
    }
}



