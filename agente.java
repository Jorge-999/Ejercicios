/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

/**
 *
 * @author usuario
 */
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
public class agente extends Agent
{
     protected void setup()
    {
        comportamiento  com= new comportamiento();
        addBehaviour(com);
    }
}
