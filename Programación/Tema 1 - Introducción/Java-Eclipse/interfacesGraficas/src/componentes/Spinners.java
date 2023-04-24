package componentes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class Spinners {
	public static void main(String[] args) {
		new VentanaSpinner();
	}
}

class VentanaSpinner extends JFrame {
	public VentanaSpinner() {
		setTitle("Spinner");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1350, 250, 500, 200);

//		JSpinner spnValores = new JSpinner();
//		JSpinner spnValores = new JSpinner(new SpinnerDateModel()); // FECHAS
//		JSpinner spnValores = new JSpinner();

//		LISTA PERSONALIZADA
		String[] disSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };
		JSpinner spnValores = new JSpinner(new SpinnerListModel(disSemana));

		JPanel pnlSpinners = new JPanel();
		pnlSpinners.setLayout(new BoxLayout(pnlSpinners, BoxLayout.Y_AXIS));
		pnlSpinners.add(spnValores);

		JPanel pnlCentral = new JPanel();
		pnlCentral.add(pnlSpinners);

		spnValores.setPreferredSize(new Dimension(100, 30));

		add(pnlCentral, BorderLayout.CENTER);

		JSpinner spnNumeros = new JSpinner(new SpinnerNumberModel(5, 0, 100, 5));
		pnlSpinners.add(spnNumeros);

		spnValores.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println(spnValores.getValue());
			}
		});

		spnNumeros.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println(spnNumeros.getValue());
			}
		});
		
		JSpinner spnNumerosInvertidos = new JSpinner(new SpinnerNumberModelInvertido());
		pnlSpinners.add(spnNumerosInvertidos);
		setVisible(true);
	}

	private class SpinnerNumberModelInvertido extends SpinnerNumberModel {
		public SpinnerNumberModelInvertido() {
			super(5,0,100,5);
		}
		
		@Override
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		@Override
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
}

































