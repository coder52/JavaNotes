package A40_Interfaces.Task3;

import A40_Interfaces.Task3.Classes.DmgFile;
import A40_Interfaces.Task3.Classes.ExeFile;
import A40_Interfaces.Task3.Classes.PowerPointFile;
import A40_Interfaces.Task3.Classes.TxtFile;
import A40_Interfaces.Task3.Interfaces.ReadFiles;

import java.util.ArrayList;
import java.util.List;

public class InstanceOf {
    public static void main(String[] args) {

        List<ReadFiles> files = new ArrayList<>();
        files.add(new PowerPointFile());
        files.add(new TxtFile());
        files.add(new DmgFile());
        files.add(new ExeFile());

        for(ReadFiles file : files){
            if(file instanceof PowerPointFile){

                PowerPointFile ppt1 = (PowerPointFile) file;  // type downcast
                System.out.println("ppt1:" + ppt1.showSlides());    // diger tipleri suzdugumuzden hata vermeden gosterir .ppt tipini

            }else if (file instanceof ExeFile){     // ExeFile tipni suzuyoruz
                ExeFile exeFile = (ExeFile)file;    // sanirim compiler zaten buraya dusenin ExeFile olacagini bilmediginden cast yapiliyor
                System.out.println((exeFile.run()));
            }
        }

    }
}
