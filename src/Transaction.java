import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private String name;
    private double amount;
    private TransactionType type;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate date;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Transaction{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", amount=").append(amount);
        sb.append(", type=").append(type);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    public Transaction(int id, String name, double amount, TransactionType type, LocalDate date) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.type = type;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDate getDateOfTransaction() {
        return date;
    }

    public void setDateOfTransaction(LocalDate dateOfTransaction) {
        this.date = dateOfTransaction;
    }


}




