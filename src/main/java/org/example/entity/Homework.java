package org.example.entity;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import org.example.converter.DateTimeConverter;
import org.example.converter.SlaGradingConverter;

import java.time.LocalDateTime;

public class Homework {

    @CsvBindByName
    private String course;

    @CsvBindByName
    private String cohort;

    @CsvBindByName
    private String module_name;

    @CsvBindByName
    private String task_name;

    @CsvBindByName
    private String student_email;

    @CsvBindByName
    private String student_name;

    @CsvCustomBindByName(converter = DateTimeConverter.class)
    private LocalDateTime submitted_at;

    @CsvCustomBindByName(converter = SlaGradingConverter.class)
    private Integer sla_grading;

    @CsvBindByName
    private String expert_email;

    @CsvBindByName
    private String answer;

    @CsvBindByName
    private String lms_web_url;

    public Homework() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public String getModule_name() {
        return module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public LocalDateTime getSubmitted_at() {
        return submitted_at;
    }

    public void setSubmitted_at(LocalDateTime submitted_at) {
        this.submitted_at = submitted_at;
    }

    public Integer getSla_grading() {
        return sla_grading;
    }

    public void setSla_grading(Integer sla_grading) {
        this.sla_grading = sla_grading;
    }

    public String getExpert_email() {
        return expert_email;
    }

    public void setExpert_email(String expert_email) {
        this.expert_email = expert_email;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLms_web_url() {
        return lms_web_url;
    }

    public void setLms_web_url(String lms_web_url) {
        this.lms_web_url = lms_web_url;
    }
}
