/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medicalapp.data;

import java.sql.Timestamp;

/**
 *
 * @author Richard
 */
public class Note {
    private int noteID;
    private int appointmentID;
    private String note;
    private Timestamp timestamp; //look into using Joda-Time.jar instead
    
}
