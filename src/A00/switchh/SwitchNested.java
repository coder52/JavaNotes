package A00.switchh;

public class SwitchNested {

    public static void main(String[] args) {

        char branch = 'M';

        int collegeYear = 2;

        switch(collegeYear){  // Only convertible int values, strings or enum variables are permitted

            case 1:
                System.out.println("English, Math, Science.");
                break;
            case 2:
                switch (branch){
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processor, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch (branch){
                    case 'C':
                        System.out.println("Computed Organisation, Multimedia");
                        break;
                    case 'E':
                        System.out.println("Fundamental of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engine, Mechanical Vibrations");
                        break;
                }
                break;
            case 4:
                switch (branch){
                    case 'C':
                        System.out.println("Data Cominication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embeded Systems, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }

    }

}
