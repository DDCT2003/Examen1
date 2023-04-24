import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class SN extends JFrame{
    private JTabbedPane menú;
    private JPanel panel1;
    private JTextField ID;
    private JTextField Edad;
    private JTextField Namigos;
    private JTextField Nombre;
    private JTextField Prioridad;
    private JButton agregarButton;
    private JTextField buscarid;
    private JButton Buscar;
    private JButton Buscar1;
    private JComboBox comboBox1;
    private JTextArea Mostrarpar;
    private JButton Buscar2;
    private JTabbedPane tabbedPane1;
    private JButton eliminarPrimerParticipanteButton;
    private JButton eliminarTodoButton;
    private JButton restaurarÚltimoParticipanteEliminadoButton;
    private JButton restaurarTodosLosParticipantesButton;
    private JButton Quemar;
    private JTextArea mostraquemados;
    private JButton mostrarParticipantesActivosButton;
    private JTextArea Mostraractivos;
    private JButton agregarPrimeroButton;
    private JButton agregarTodosButton;
    int indice =1;
    public SN(){
        super ("holii");
        setContentPane(panel1);

        Queue<Persona> PersonasEspera = new LinkedList<>();
        Queue<Persona> Persona1 = new LinkedList<>();
        Queue<Persona> Persona2 = new LinkedList<>();
        PriorityQueue<Persona> Personas= new PriorityQueue<>();
        Stack<Persona> eliminados= new Stack<>();


        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Personas.add(new Persona(Integer.parseInt(ID.getText()),Integer.parseInt(Edad.getText()),Integer.parseInt(Namigos.getText()),
                        Integer.parseInt(Prioridad.getText()),indice,Nombre.getText()));

            }
        });
        Buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Elementoabuscar = Integer.parseInt(buscarid.getText());

                while (!Personas.isEmpty()) {
                    int element = Personas.peek().getId();

                    if (element == Elementoabuscar) {
                       Mostrarpar.setText("El elemento " + Elementoabuscar + " ha sido encontrado en la cola de prioridad.");
                        break;
                    }else{
                        Mostrarpar.setText("No hay nadie con ese Id");
                    }
                    Persona1.add(Personas.poll());
            }
                while(!Persona1.isEmpty()){
                    Personas.add(Persona1.poll());
                }
        }});

        Quemar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indice++;
                Personas.add(new Persona(12345,18,10, 75,indice,"Daniel"));
                mostraquemados.setText(Personas.peek().toString());
                indice++;
                Personas.add(new Persona(15252,19,11, 90,indice,"Dereck"));
                mostraquemados.setText(mostraquemados.getText()+ Personas.peek().toString());
                indice++;
                Personas.add(new Persona(16734,28,18, 35,indice,"Andrés "));
                mostraquemados.setText(mostraquemados.getText()+ Personas.peek().toString());
                indice++;
                Personas.add(new Persona(15673,25,50, 65,indice,"Dylan"));
                mostraquemados.setText(mostraquemados.getText()+ Personas.peek().toString());
                indice++;
                Personas.add(new Persona(19345,19,13, 70,indice,"Andrea"));
                mostraquemados.setText(mostraquemados.getText()+ Personas.peek().toString());
                indice++;
                Personas.add(new Persona(12954,31,27, 95,indice,"Sofia"));
                mostraquemados.setText(mostraquemados.getText()+ Personas.peek().toString());
                indice++;
            }
        });

        Buscar1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Elementoabuscar = 50;
                while (!Personas.isEmpty()) {
                    int element = Personas.peek().getPrioridad();

                    if (element >50) {
                        Mostrarpar.setText(Mostrarpar.getText()+Personas.peek().toString());

                    }
                    Persona1.add(Personas.poll());
                }
                while(!Persona1.isEmpty()){
                    Personas.add(Persona1.poll());
                }
            }
        });
        agregarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(!Personas.isEmpty()){
                    Persona1.add(Personas.poll());

                }
            }
        });
        mostrarParticipantesActivosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                while(!Persona1.isEmpty()){
                    Mostraractivos.setText(Mostraractivos.getText()+Persona1.peek());
                    Persona2.add(Persona1.poll());

                }
                while(!Persona2.isEmpty()){
                    Persona1.add(Persona2.poll());

                }
            }
        });
    }
}


