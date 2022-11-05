/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lab5B.model;

/**
 *
 * @author tonypittella
 */
public interface Issue {

    public static enum IssueStatus {
        NEW, OPENED, FIXED, CLOSED
    }

    public String getId();
    public String getProjectName();
    public IssueStatus getStatus();
    public String getSynopsis();
    public String getDescription();
}
