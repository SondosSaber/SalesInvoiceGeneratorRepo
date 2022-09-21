import com.frame.*;

public class Main {
    public static void main(String[] args) {

        SalesFrame sf = new SalesFrame();
        Menu m = new Menu();
        Table table = new Table();
        Buttons btn = new Buttons();
        TextArea ta = new TextArea();
//        Panels p = new Panels();

        sf.createTheFrame();
        m.createMenu();
//        p.createPanels();
        table.createInvoiceTable();
        ta.createTextArea();
        table.createInvoiceItems();
        btn.createButton();
        btn.performCreateBtnsActions();
    }
}