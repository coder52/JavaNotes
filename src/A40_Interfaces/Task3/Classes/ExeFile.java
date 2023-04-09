package A40_Interfaces.Task3.Classes;

import A40_Interfaces.Task3.Interfaces.ReadFiles;

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
