package main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.util.concurrent.TimeUnit;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;

public class GUI {

	protected Shell shlGeradorDeDiscussao;
	private Text textArea;
	private Text input;
	private Text size;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			GUI window = new GUI();
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
		shlGeradorDeDiscussao.open();
		shlGeradorDeDiscussao.layout();
		while (!shlGeradorDeDiscussao.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlGeradorDeDiscussao = new Shell();
		shlGeradorDeDiscussao.setSize(499, 612);
		shlGeradorDeDiscussao.setText("Gerador de Discussao");
		
		Label lblTamanho = new Label(shlGeradorDeDiscussao, SWT.NONE);
		lblTamanho.setBounds(10, 37, 55, 15);
		lblTamanho.setText("Tamanho:");
		
		size = new Text(shlGeradorDeDiscussao, SWT.BORDER);
		size.setBounds(137, 34, 55, 21);
		
		
		Button btnGerarDiscussao = new Button(shlGeradorDeDiscussao, SWT.NONE);
		btnGerarDiscussao.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				try {	
						int tamanho = Integer.parseInt(size.getText());
						for (int i=0;i<tamanho;i++) {
						String assunto = input.getText();
						if (assunto.length()<=0) {
							textArea.append("Infelizmente voce precisa colocar uma String Debbuger");
							break;
						}
						else {
						String user = Main.returnUser(assunto,i);
						String message = Main.returnMessage(assunto,i);						
						textArea.append(user);
						textArea.append(" diz: " + "\n");						
						textArea.append(message + "\n \n");
						}
					}
				}
				catch(Exception exc) {
					MessageDialog.openError(shlGeradorDeDiscussao,"Error", "Bad Input");
					return;
				}
				
				
			}
		});
		btnGerarDiscussao.setBounds(20, 487, 235, 76);
		btnGerarDiscussao.setText("Gerar Discussao");
		
		textArea = new Text(shlGeradorDeDiscussao, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		textArea.setBounds(10, 69, 463, 412);
		
		
		Label lblAssuntoDaDiscussao = new Label(shlGeradorDeDiscussao, SWT.NONE);
		lblAssuntoDaDiscussao.setBounds(10, 10, 121, 21);
		lblAssuntoDaDiscussao.setText("Assunto da Discussao:");
		
		input = new Text(shlGeradorDeDiscussao, SWT.BORDER);
		input.setBounds(137, 7, 230, 21);
		

		
		Button btnLimpar = new Button(shlGeradorDeDiscussao, SWT.NONE);
		btnLimpar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				textArea.setText(" ");
				
			}
		});
		btnLimpar.setBounds(261, 487, 212, 76);
		btnLimpar.setText("Limpar");
		
	
		


	}
}
