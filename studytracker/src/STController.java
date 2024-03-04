package studytracker;

public class STController {
    private STModel model;
    private STView view;
    public STController(STModel model) { this.model = model; }
    public void setView(STView view) {this.view = view;}


    public void change(){
        model.change();
    }

    public void initialise(){ model.initialise(); }

}
