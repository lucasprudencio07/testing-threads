
package threads.alura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		ThreadMultiplicador threadMultiplicador = new ThreadMultiplicador(primeiro, segundo, resultado);

		Thread threadCalculate = new Thread(threadMultiplicador, "Thread que calcula");
		threadCalculate.start();

	}

}