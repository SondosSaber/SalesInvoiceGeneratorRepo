import com.frame.*;

public class Main {
    public static void main(String[] args) {

        SalesFrame sf = new SalesFrame();
        Menu m = new Menu();
        Table table = new Table();
        Buttons btn = new Buttons();
        TextArea ta = new TextArea();
        Panels p = new Panels();

        m.createMenu(sf);
        m.performMenuActions();

        table.createInvoiceTable(p);
        btn.createButtonLP(p);
        p.createLPanel(sf);

        ta.createTextArea(p);
        table.createInvoiceItems(p);
        btn.createButtonRP(p);
        p.createRPanel(sf);

        btn.performCreateBtnsActions();

        sf.createTheFrame();
    }
}