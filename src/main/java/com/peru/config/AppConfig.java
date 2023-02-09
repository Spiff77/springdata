package com.peru.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Configuration
@Import(JpaConfig.class)
public class AppConfig {
	

}

/*
ArtistDao -----> JpaRepository
artist.banName qui contient [chaine]
artist.year > [année]
artist.year entre [année1] et [année2]


AlbumDao -----> JpaRepository
album.name qui contient [chaine]
album.artist.name qui contient [chaine]: @Query
*/
