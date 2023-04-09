package A40_Interfaces.Task3;

import A40_Interfaces.Task3.Classes.DmgFile;
import A40_Interfaces.Task3.Classes.ExeFile;
import A40_Interfaces.Task3.Classes.PowerPointFile;
import A40_Interfaces.Task3.Classes.TxtFile;
import A40_Interfaces.Task3.Interfaces.ReadFiles;

public class Main {
    public static void main(String[] args) {

        ExeFile exe = new ExeFile();
        DmgFile dmg = new DmgFile();
        PowerPointFile ppt = new PowerPointFile();
        TxtFile txt = new TxtFile();

        workWithFile(txt);
        workWithFile(dmg);

    }

    public static void workWithFile(ReadFiles file){
        System.out.println();

        System.out.println(file.open());

        System.out.println(file.read());

        System.out.println(file.save());

        System.out.println(file.close());

    }
}
