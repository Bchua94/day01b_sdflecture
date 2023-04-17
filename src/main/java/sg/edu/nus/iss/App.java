package sg.edu.nus.iss;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Console con = System.console();

        List<String> todos = new Arraylist<String>();

        String input = "";

        while(!input.equals(an0bject:"quit")) {
            input = con.readLine("Enter a string:");

            if (!input.equals(an0bject"quit")) {
                todos.add(input);
            }

        for (String todo: todos) {
            System.out.println("Todo, task");
        }
        }
    
    }
}
