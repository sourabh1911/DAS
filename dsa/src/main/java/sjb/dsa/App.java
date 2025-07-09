package sjb.dsa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {Stack st=new Stack(5);
	st.push(10);
	st.push(30);
	st.push(40);
	st.push(50);
	System.out.println(st.peek());
	st.pop();
	st.display();
    }
}
