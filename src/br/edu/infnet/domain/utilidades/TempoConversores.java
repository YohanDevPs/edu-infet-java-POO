package br.edu.infnet.domain.utilidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TempoConversores {
	
    public static String formatLocalDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return dateTime.format(formatter);
    }
}
