package ufold;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.jpl7.*;
import javafx.util.Pair;

public class UFOLD {

    public static void main(String[] args) {
        // TODO code application logic here
        //FOLD f = new FOLD("diabetes.pl","diabetes.txt");
        //FOLD f = new FOLD("cancer_train_2.pl","cancer.txt");
        //FOLD f = new FOLD("flies.pl","flies.txt");
        
        FOLD f = new FOLD("breastw_train_2.pl","breastw.txt");
        
        f.foil_run();
        f.post_processing();
        f.Display_Hypothesis();
    }
    
}
