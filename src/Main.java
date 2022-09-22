import com.frame.*;

public class Main {
    public static void main(String[] args) {

        SalesFrame sf = new SalesFrame();
        Menu m = new Menu();
        Table table = new Table();
        Buttons btn = new Buttons();
        TextArea ta = new TextArea();
//        Panels p = new Panels();

        m.createMenu(sf);
        table.createInvoiceTable(sf);
        ta.createTextArea(sf);
        table.createInvoiceItems(sf);
        btn.createButton(sf);
        btn.performCreateBtnsActions();
        sf.createTheFrame();
        
//        p.createPanels(sf);
    }
}