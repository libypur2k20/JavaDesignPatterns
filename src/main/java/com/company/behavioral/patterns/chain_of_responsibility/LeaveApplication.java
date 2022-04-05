package com.company.behavioral.patterns.chain_of_responsibility;

import java.time.LocalDate;
import java.time.Period;

// Represents a request in our chain of responsibility
public class LeaveApplication {

    public enum Type {Sick, PTO, LOP};

    public enum Status {Pending, Approved, Rejected};

    private Type type;

    private Status status;

    private LocalDate from;

    private LocalDate to;

    private String processedBy;


    public LeaveApplication(Type type, LocalDate from, LocalDate to){
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.Pending;
    }

    public Type getType(){
        return this.type;
    }

    public LocalDate getFrom(){
        return this.from;
    }

    public LocalDate getTo(){
        return this.to;
    }

    public int getNoOfDays(){
        return Period.between(this.from, this.to).getDays();
    }

    public String getProcessedBy(){
        return this.processedBy;
    }

    public Status getStatus(){
        return this.status;
    }

    public void approve(String approverName){
        this.status = Status.Approved;
        this.processedBy = approverName;
    }

    public void reject(String approverName){
        this.status = Status.Rejected;
        this.processedBy = approverName;
    }


    @Override
    public String toString() {
        return type + " leave for "+getNoOfDays()+" day(s) "+status
                + " by "+processedBy;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{

        private LeaveApplication application;
        private Type type;
        private LocalDate from;
        private LocalDate to;

        private Builder(){}

        public Builder withType(Type type){
            this.type = type;
            return this;
        }

        public Builder withFrom(LocalDate from){
            this.from = from;
            return this;
        }

        public Builder withTo(LocalDate to){
            this.to = to;
            return this;
        }

        public LeaveApplication build(){
            this.application = new LeaveApplication(this.type,this.from,this.to);
            return this.application;
        }

        public LeaveApplication getApplication(){
            return this.application;
        }


    }
}
