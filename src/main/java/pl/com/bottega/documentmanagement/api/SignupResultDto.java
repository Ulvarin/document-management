package pl.com.bottega.documentmanagement.api;

/**
 * Created by Ulvarin on 18.06.16.
 */
public class SignupResultDto {

    private boolean success;
    private String failureReason;

    public SignupResultDto() {
        success = true;
    }

    public SignupResultDto(String failureReason) {
        this.failureReason = failureReason;
        success = false;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    @Override
    public String toString() {
        return "SignupResultDto{" +
                "success=" + success +
                ", failureReason='" + failureReason + '\'' +
                '}';
    }

}
