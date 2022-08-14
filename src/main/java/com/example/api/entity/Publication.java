package com.example.api.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "publication")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "publication_name")
    private String publicationName;
    @Column(name = "publish_type")
    private String publishType;
    @Column(name = "publisher") //tenant
    private String publisher;
    @Column(name = "publish_date")
    private Long publishDate;
    @Column(name = "writer")
    private String writer;
    @Column(name = "first_volume_date")
    private Long firstVolumeDate;
    @Column(name = "last_volume_date")
    private Long lastVolumeDate;
    @Column(name = "publish_place")
    private String publishPlace;

}
