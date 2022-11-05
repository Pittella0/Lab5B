/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lab5B.model;

/**
 *
 * @author tonypittella
 */
import Lab5B.model.Issue.IssueStatus;
import javafx.collections.ObservableList;

public interface TrackingService {

    public ObservableList<String> getIssueIds(String projectName);
    public ObservableList<String> getProjectNames();
    public ObservableIssue getIssue(String tickectId);
    public ObservableIssue createIssueFor(String projectName);
    public void deleteIssue(String issueId);
    public void saveIssue(String issueId, IssueStatus status,
            String synopsis, String description);
}