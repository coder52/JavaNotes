package A41_InstanceOf_Default.InstanceOf_Default.InterfacesAndDefaultmethod;

public interface ReadFiles {

    String open();

    String read();

    String save();

    String close();

    // default method sayesinde childlarin hepsine tektek gidip implement yapmaktan kurtulabiliriz
    // tabi butun childlarda ayni sekilde kullanilacaksa bu method
    default void copy(){
        System.out.println("Automatically copied. ");
    }





}
