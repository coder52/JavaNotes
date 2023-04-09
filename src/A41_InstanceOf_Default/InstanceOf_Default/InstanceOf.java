package A41_InstanceOf_Default.InstanceOf_Default;

import A41_InstanceOf_Default.InstanceOf_Default.Classes.DmgFile;
import A41_InstanceOf_Default.InstanceOf_Default.Classes.ExeFile;
import A41_InstanceOf_Default.InstanceOf_Default.Classes.PowerPointFile;
import A41_InstanceOf_Default.InstanceOf_Default.Classes.TxtFile;
import A41_InstanceOf_Default.InstanceOf_Default.InterfacesAndDefaultmethod.ReadFiles;

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

            }else if (file instanceof ExeFile){     // ExeFile tipini suzuyoruz
                ExeFile exeFile = (ExeFile)file;
                System.out.println(((ExeFile) file).run());
            }
        }


        ReadFiles f = new PowerPointFile();
        f.copy();
    }
}
