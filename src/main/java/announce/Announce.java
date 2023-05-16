package announce;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @author misterfocusth
 */
public class Announce {

    private String announceTitle, announceBody;

    public Announce(String announceTitle, String announceBody) {
        this.announceTitle = announceTitle;
        this.announceBody = announceBody;
    }

    public String getAnnounceTitle() {
        return announceTitle;
    }

    public void setAnnounceTitle(String announceTitle) {
        this.announceTitle = announceTitle;
    }

    public String getAnnounceBody() {
        return announceBody;
    }

    public void setAnnounceBody(String announceBody) {
        this.announceBody = announceBody;
    }
}
