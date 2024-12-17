package universidade.universidade_gerenciador.dto;

import lombok.Data;
import java.util.Date;
import java.util.List;


@Data
public class AtividadeDTO {
    private String nome;
    private String categoriaPrincipal;
    private String objetivo;
    private String publicoAlvo;
    private Boolean statusPublicacao;
    private Date dataCriacao;
    private Long cursoId;   
    private List<EvidenciaDTO> evidencias;
}
