
package personname;
//import class needed for dialog boxes for JOptionPane class
import javax.swing.JOptionPane;
/**
 *
 * @author Zach Murphy
 */
public class PersonName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input information
        String fullName = JOptionPane.showInputDialog("What is your name?");
        String inputAge = JOptionPane.showInputDialog("How old are you?");
        
        //converting from string to double for age
        int age = Integer.parseInt(inputAge);
        
        JOptionPane.showMessageDialog(null, "Hello " + fullName + " you are " + age + " years old." );
        
    }
    
}
