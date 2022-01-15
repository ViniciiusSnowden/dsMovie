package com.paulovinicius.dsmovie.entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Embeddable
public class ScorePK implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name ="movie_id")
    private Movie move;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

}
