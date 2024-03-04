package studytracker;

import java.util.Observable;

public class STModel extends Observable{

    public void  change(){
        setChanged();
    }

    public void initialise(){
        setChanged();
    }
    public  STModel() { initialise(); }

}
