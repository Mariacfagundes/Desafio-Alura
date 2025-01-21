package br.com.alura.ProjetoAlura.course;

import br.com.alura.ProjetoAlura.util.EncryptUtil;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private String instructorEmail;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime inactivatedAt;

    public Course() {}

    public Course(
            String name,
            String code,
            String instructorEmail,
            String description,
            Status status) {
        this.name = name;
        this.code = code;
        this.instructorEmail = instructorEmail;
        this.description = description;
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getInactivatedAt() {
        return inactivatedAt;
    }

    public String getName() {
        return name;
    }

    public String getCode() { return code; }

    public String getInstructorEmail() { return instructorEmail; }

    public String getDescription() { return description; }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) { this.status = status; }

    public void setInactivatedAt(LocalDateTime inactivatedAt) { this.inactivatedAt = inactivatedAt; }
}
