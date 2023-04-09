package A41_InstanceOf_Default.InstanceOf_Default.Classes;

import A41_InstanceOf_Default.InstanceOf_Default.InterfacesAndDefaultmethod.ReadFiles;

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
