package br.com.stefanini.maratonadev.dto;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginadoDTO<T> implements Serializable {

	private static final long serialVersionUID = -5092536974327831553L;
	
	private Long total;
	private List<T> lista;
	
}
