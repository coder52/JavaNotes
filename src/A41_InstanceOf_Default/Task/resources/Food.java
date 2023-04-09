package A41_InstanceOf_Default.Task.resources;

public interface Food {

    String taste();

    // default method child class larda implement yapmadan metod yayinlamaya yarar.

    default void printed(){
        System.out.println(getClass().getSimpleName() + " has the perfect taste.");
    }

}
