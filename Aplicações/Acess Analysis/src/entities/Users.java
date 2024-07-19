package entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Users {
    private String nome;
    private LocalDateTime access;

    public Users(String nome, LocalDateTime access) {
        this.nome = nome;
        this.access = access;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        return Objects.equals(nome, users.nome);
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getAccess() {
        return access;
    }

    public void setAccess(LocalDateTime access) {
        this.access = access;
    }
}
