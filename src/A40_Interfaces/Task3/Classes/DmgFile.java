package A40_Interfaces.Task3.Classes;

import A40_Interfaces.Task3.Interfaces.ReadFiles;

public class DmgFile implements ReadFiles {

    @Override
    public String open() {
        return "Opening DMG";
    }

    @Override
    public String read() {
        return "Reading DMG";
    }

    @Override
    public String save() {
        return "Saving DMG";
    }

    @Override
    public String close() {
        return "Closing DMG";
    }
}
