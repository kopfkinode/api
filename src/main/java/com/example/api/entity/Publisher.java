package com.example.api.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "publisher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {
    @Id
    private Long id;
    @Column(name = "publisher_name")
    private String publisherName;
    @Column(name = "publication_id")  //assetId
    private Long publicationId;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "founded_date")
    private Long foundedDate;
    @Column(name = "publish_date")
    private Long publishDate;

}
