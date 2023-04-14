package document;

public abstract class Document {

    private int documentType = 0;
    private String writtenAt = "คณะเทคโนโลยีสารสนเทศ สถาบันเทคโนโลยีพระจอมเกล้าเจ้าคุณทหารลาดกระบัง";
    private String documentId;
    private String requestedAtDay, requestedAtMonth, requestedAtYear;
    private String requestTitle;
    private String requestTo;
    private String requestBy;
    private String requestStatus;
    private String respondedAt;
    private String respondedBy;

    public Document(int documentType,
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
                    String respondedBy) {
        this.documentType = documentType;
        this.documentId = documentId;
        this.writtenAt = writtenAt;
        this.requestedAtDay = requestedAtDay;
        this.requestedAtMonth = requestedAtMonth;
        this.requestedAtYear = requestedAtYear;
        this.requestTitle = requestTitle;
        this.requestTo = requestTo;
        this.requestBy = requestBy;
        this.requestStatus = requestStatus;
        this.respondedAt = respondedAt;
        this.respondedBy = respondedBy;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public void setWrittenAt(String writtenAt) {
        this.writtenAt = writtenAt;
    }

    public String getRespondedAt() {
        return respondedAt;
    }

    public void setRespondedAt(String respondedAt) {
        this.respondedAt = respondedAt;
    }

    public String getRespondedBy() {
        return respondedBy;
    }

    public void setRespondedBy(String respondedBy) {
        this.respondedBy = respondedBy;
    }

    public String getWrittenAt() {
        return writtenAt;
    }

    public String getRequestedAtDay() {
        return requestedAtDay;
    }

    public void setRequestedAtDay(String requestedAtDay) {
        this.requestedAtDay = requestedAtDay;
    }

    public String getRequestedAtMonth() {
        return requestedAtMonth;
    }

    public void setRequestedAtMonth(String requestedAtMonth) {
        this.requestedAtMonth = requestedAtMonth;
    }

    public String getRequestedAtYear() {
        return requestedAtYear;
    }

    public void setRequestedAtYear(String requestedAtYear) {
        this.requestedAtYear = requestedAtYear;
    }

    public String getRequestTitle() {
        return requestTitle;
    }

    public void setRequestTitle(String requestTitle) {
        this.requestTitle = requestTitle;
    }

    public String getRequestTo() {
        return requestTo;
    }

    public void setRequestTo(String requestTo) {
        this.requestTo = requestTo;
    }

    public String getRequestBy() {
        return requestBy;
    }

    public void setRequestBy(String requestBy) {
        this.requestBy = requestBy;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }
}
