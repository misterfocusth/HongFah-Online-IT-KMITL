package document;

public class GeneralRequestDocument extends Document {
    private String contactAddress;
    private String requestBody;
    private String[] requestResponses;

    public GeneralRequestDocument(
            String requestedAtDay,
            String requestedAtMonth,
            String requestedAtYear,
            String requestTitle,
            String requestTo,
            String requestBy,
            String requestStatus,
            String respondedAt,
            String respondedBy,
            String contactAddress,
            String requestBody,
            String[] requestResponses
    ) {
        super(
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
        this.requestResponses = requestResponses;
        this.contactAddress = contactAddress;
        this.requestBody = requestBody;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String[] getRequestResponses() {
        return requestResponses;
    }

    public void setRequestResponses(String[] requestResponses) {
        this.requestResponses = requestResponses;
    }
}
