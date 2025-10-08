//TIP Per <b>eseguire</b> il codice, premere <shortcut actionId="Run"/> o
// clicca sullicona {0} nel margine.
public class Main {
    public static void main(String[] args) {
        //TIP Premi <shortcut actionId="ShowIntentionActions"/> con il caret al testo evidenziato
        // per vedere come IntelliJ IDEA suggerisce di sistemarlo.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Premi <shortcut actionId="Debug"/> per iniziare il debug del codice. Abbiamo impostato un <icon src="AllIcons.Debugger.Db_set_breakpoint"/> punto di interruzione
            // per te, ma puoi sempre aggiungerne altri premendo <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}