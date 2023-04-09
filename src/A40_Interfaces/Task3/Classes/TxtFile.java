package A40_Interfaces.Task3.Classes;

import A40_Interfaces.Task3.Interfaces.ReadFiles;

public class TxtFile implements ReadFiles {

    @Override
    public String open() {
        return "Opening txt";
    }

    @Override
    public String read() {
        return "Reading txt";
    }

    @Override
    public String save() {
        return "Saving txt";
    }

    @Override
    public String close() {
        return "Closing txt";
    }

}
