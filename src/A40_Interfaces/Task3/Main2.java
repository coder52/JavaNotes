package A40_Interfaces.Task3;

import A40_Interfaces.Task3.Classes.PowerPointFile;
import A40_Interfaces.Task3.Classes.TxtFile;
import A40_Interfaces.Task3.Interfaces.ReadFiles;

public class Main2 {

    public static void main(String[] args) {

        ReadFiles ppt = new PowerPointFile();
        ReadFiles txt = new TxtFile();

        // if we have reference the parrent and reach to method in child class
        PowerPointFile ppt1 = (PowerPointFile) ppt;  // type downcast

        //or
        System.out.println("ppt :" + ((PowerPointFile) ppt).showSlides());
        System.out.println("ppt1:" + ppt1.showSlides());

    }
}
