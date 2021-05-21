package Vista;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

public class interfaz {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			interfaz window = new interfaz();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(40, 34, 367, 72);
		lblNewLabel.setText("oerhverovqpernbokqpernbqperobneokmbvper`nkgmqvoègng`weormbèwprojbmeqvr`pqmvq`peogm");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(176, 191, 90, 30);
		btnNewButton.setText("New Button");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(40, 144, 367, 26);

	}
}
