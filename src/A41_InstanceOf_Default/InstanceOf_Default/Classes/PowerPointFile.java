package A41_InstanceOf_Default.InstanceOf_Default.Classes;

import A41_InstanceOf_Default.InstanceOf_Default.InterfacesAndDefaultmethod.ReadFiles;

public class PowerPointFile implements ReadFiles {

    public String showSlides(){
        return "Showing slides.";
    }

    @Override
    public String open() {
        return "Opening PPT";
    }

    @Override
    public String read() {
        return "Reading PPT";
    }

    @Override
    public String save() {
        return "Saving PPT";
    }

    @Override
    public String close() {
        return "Closing PPT";
    }

}
