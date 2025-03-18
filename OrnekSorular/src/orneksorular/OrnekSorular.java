
package orneksorular;


public class OrnekSorular {

    
    public static void main(String[] args) {
        System.out.println("Örnek Sorular içindir.");
    }
    
}

//    public static void exchange (String pivot, String change, String value, String fileName){
//       int index;
//       File nFile = new File(fileName);
//       String[] carInfo = new String[5];
//       try {
//           BufferedReader reader = new BufferedReader(new FileReader(fileName));
//       String line;
//       
//       
//       switch (change) {
//           case "marka":index = 0; break;
//           case "model":index = 1; break;
//           case "color":index = 2; break;
//           case "yearOfProduction":index = 3; break;
//           case "price":index =4; break;
//           default:
//               throw new AssertionError();
//       }
//       while ((line = reader.readLine()) != null) {
//           carInfo = line.split(" ");
//           if (carInfo[0].equals(pivot)) {
//               carInfo[index] = value;
//               
//               for (int i = 0; i < 5; i++) 
//               {
//                   line = null;
//                   line += carInfo[i]+" ";
//               }
//               
//               nFile.writeFile(fileName, line);
//           }               
//           
//       }
//       
//           
//       } catch (Exception e) {
//       }
//
//    }