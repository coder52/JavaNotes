package A41_InstanceOf_Default.InstanceOf_Default.Classes;

import A41_InstanceOf_Default.InstanceOf_Default.InterfacesAndDefaultmethod.ReadFiles;

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
