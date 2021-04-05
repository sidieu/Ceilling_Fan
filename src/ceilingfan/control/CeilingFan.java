/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceilingfan.control;

/**
 *
 * @author sidieu
 */
public abstract class CeilingFan {

private int speed;

public int getSpeed(){
    return speed;
}

protected int cord1(){
    speed++;
    if(speed>3){
        speed = 0;
    }
    return speed;
}

protected int cord2(){
    if(speed==0){
        speed = 4;
    }
    speed--;
    return speed;
}
    
abstract void controlCeiling(CeilingFan fan);
    
}

