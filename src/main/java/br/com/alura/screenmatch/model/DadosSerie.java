package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Essa anotação faz o Java ignorar propriedados json que não foram encontradas
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
                        //O JsonAlias serve apenas para ler o JSon. Ele aceita vários termos
                         @JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao)
                        //O JsonProperty serve tanto para a serialização quanto para a
                        //desserialização
                        //,@JsonProperty("imdbVotes") String votos)
                        {

}
