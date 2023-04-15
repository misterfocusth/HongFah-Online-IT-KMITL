package document;

import interfaces.UniqueAble;

import java.util.ArrayList;

public class LeaveRequestDocument extends Document {
    private String causeOfLeave;
    private String leaveTitle;
    private String leaveFromDay, leaveFromMonth, leaveFromYear;
    private String leaveUntilDay, leaveUntilMonth, leaveUntilYear;
    private String remark;
    private String contactAddress;
    private ArrayList<String> responses;

    public LeaveRequestDocument(
            String documentId,
            String writtenAt,
            String requestedAtDay,
            String requestedAtMonth,
            String requestedAtYear,
            String requestTitle,
            String requestTo,
            String requestBy,
            String requestStatus,
            String respondedAt,
            String respondedBy,

            String causeOfLeave,
            String leaveTitle,
            String leaveFromDay,
            String leaveFromMonth,
            String leaveFromYear,
            String leaveUntilDay,
            String leaveUntilMonth,
            String leaveUntilYear,
            String remark,
            String contactAddress,
            ArrayList<String> responses
    ) {
        super(
                2,
                documentId,
                writtenAt,
                requestedAtDay,
                requestedAtMonth,
                requestedAtYear,
                requestTitle,
                requestTo,
                requestBy,
                requestStatus,
                respondedAt,
                respondedBy
        );
        this.causeOfLeave = causeOfLeave;
        this.leaveTitle = leaveTitle;
        this.leaveFromDay = leaveFromDay;
        this.leaveFromMonth = leaveFromMonth;
        this.leaveFromYear = leaveFromYear;
        this.leaveUntilDay = leaveUntilDay;
        this.leaveUntilMonth = leaveUntilMonth;
        this.leaveUntilYear = leaveUntilYear;
        this.remark = remark;
        this.contactAddress = contactAddress;
        this.responses = responses;
    }

    public String getCauseOfLeave() {
        return causeOfLeave;
    }

    public void setCauseOfLeave(String causeOfLeave) {
        this.causeOfLeave = causeOfLeave;
    }

    public String getLeaveTitle() {
        return leaveTitle;
    }

    public void setLeaveTitle(String leaveTitle) {
        this.leaveTitle = leaveTitle;
    }

    public String getLeaveFromDay() {
        return leaveFromDay;
    }

    public void setLeaveFromDay(String leaveFromDay) {
        this.leaveFromDay = leaveFromDay;
    }

    public String getLeaveFromMonth() {
        return leaveFromMonth;
    }

    public void setLeaveFromMonth(String leaveFromMonth) {
        this.leaveFromMonth = leaveFromMonth;
    }

    public String getLeaveFromYear() {
        return leaveFromYear;
    }

    public void setLeaveFromYear(String leaveFromYear) {
        this.leaveFromYear = leaveFromYear;
    }

    public String getLeaveUntilDay() {
        return leaveUntilDay;
    }

    public void setLeaveUntilDay(String leaveUntilDay) {
        this.leaveUntilDay = leaveUntilDay;
    }

    public String getLeaveUntilMonth() {
        return leaveUntilMonth;
    }

    public void setLeaveUntilMonth(String leaveUntilMonth) {
        this.leaveUntilMonth = leaveUntilMonth;
    }

    public String getLeaveUntilYear() {
        return leaveUntilYear;
    }

    public void setLeaveUntilYear(String leaveUntilYear) {
        this.leaveUntilYear = leaveUntilYear;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public ArrayList<String> getResponses() {
        return responses;
    }

    public void setResponses(ArrayList<String> responses) {
        this.responses = responses;
    }
}
