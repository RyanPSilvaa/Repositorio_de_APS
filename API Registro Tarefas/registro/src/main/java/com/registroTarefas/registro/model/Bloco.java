package com.registroTarefas.registro.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Bloco {
    @Id
    private Long codigo;
    private Date inicioDate;
    private Date fimDate;

    public Bloco() {

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((inicioDate == null) ? 0 : inicioDate.hashCode());
        result = prime * result + ((fimDate == null) ? 0 : fimDate.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bloco other = (Bloco) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (inicioDate == null) {
            if (other.inicioDate != null)
                return false;
        } else if (!inicioDate.equals(other.inicioDate))
            return false;
        if (fimDate == null) {
            if (other.fimDate != null)
                return false;
        } else if (!fimDate.equals(other.fimDate))
            return false;
        return true;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getInicioDate() {
        return inicioDate;
    }

    public void setInicioDate(Date inicioDate) {
        this.inicioDate = inicioDate;
    }

    public Date getFimDate() {
        return fimDate;
    }

    public void setFimDate(Date fimDate) {
        this.fimDate = fimDate;
    }
  
}