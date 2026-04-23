package reforco_poo.lista02.bloco06;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ticket {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private String code;
    private Requester requester;
    private Priority priority;
    private TicketStatus status;
    private LocalDateTime openedAt;
    private LocalDateTime closedAt;

    public Ticket(String code, Requester requester, Priority priority, TicketStatus status, LocalDateTime openedAt, LocalDateTime closedAt) {
        this.code = code;
        this.requester = requester;
        this.priority = priority;
        this.status = status;
        this.openedAt = openedAt;
        this.closedAt = closedAt;
    }

    public String getCode() {
        return code;
    }

    public Requester getRequester() {
        return requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public LocalDateTime getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(LocalDateTime openedAt) {
        this.openedAt = openedAt;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public boolean isWithinSLA() {
        LocalDateTime end = (closedAt != null) ? closedAt : LocalDateTime.now();
        Duration duration = Duration.between(openedAt, end);
        return duration.toMinutes() <= priority.getSlaHours() * 60L;
    }

    public long elapsedHours() {
        LocalDateTime end = (closedAt != null) ? closedAt : LocalDateTime.now();
        return Duration.between(openedAt, end).toHours();
    }

    public void close(LocalDateTime closedAt) {
        this.closedAt = closedAt;
        this.status = TicketStatus.CLOSED;
    }

    public String elapsedText() {
        LocalDateTime end = (closedAt != null) ? closedAt : LocalDateTime.now();
        Duration duration = Duration.between(openedAt, end);

        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();

        if (closedAt != null) {
            return String.format("Elapsed: %dh %dmin", hours, minutes);
        } else {
            return String.format("Elapsed so far: %dh %dmin", hours, minutes);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("#").append(code)
                .append(" | ").append(requester.getNome())
                .append(" | ").append(priority)
                .append(" | ").append(status).append("\n");

        sb.append("  Opened: ").append(openedAt.format(dtf)).append("\n");

        if (closedAt != null) {
            sb.append("  Closed: ").append(closedAt.format(dtf)).append("\n");
        }

        sb.append("  ").append(elapsedText())
                .append("  SLA: ").append(priority.getSlaHours()).append("h  → ")
                .append(isWithinSLA() ? "✓ WITHIN SLA" : "✗ SLA VIOLATED");

        return sb.toString();
    }
}
