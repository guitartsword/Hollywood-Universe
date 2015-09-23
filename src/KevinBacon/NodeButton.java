/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinBacon;

/**
 *
 * @author Isaias
 */
public class NodeButton extends javax.swing.JButton{
    private Actor actor;

    public NodeButton(Actor actor) {
        this.actor = actor;
    }
    public Actor getActor(){
        return actor;
    }
}
