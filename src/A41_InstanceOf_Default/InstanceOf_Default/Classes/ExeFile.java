package A41_InstanceOf_Default.InstanceOf_Default.Classes;

import A41_InstanceOf_Default.InstanceOf_Default.InterfacesAndDefaultmethod.ReadFiles;

public class ExeFile implements ReadFiles {
    @Override
    public String open() {
        return "Opening EXE";
    }

    @Override
    public String read() {
        return "Reading EXE";
    }

    @Override
    public String save() {
        return "Saving EXE";
    }

    @Override
    public String close() {
        return "Closing EXE";
    }

    public String run(){

        return "run this program";

    }

}
