package A40_Interfaces.Task3.Classes;

import A40_Interfaces.Task3.Interfaces.ReadFiles;

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
