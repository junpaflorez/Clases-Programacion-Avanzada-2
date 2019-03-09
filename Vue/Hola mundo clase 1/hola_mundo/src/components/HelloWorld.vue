<template>
  <v-card>
      <v-container
        fluid
        grid-list-lg
        
      >
        <v-layout  row wrap v-for="pelicula in peliculas" :key="pelicula.titulo" >
          <v-flex  xs12   >
            <v-card color="cyan darken-2" class="white--text">
              <v-layout>
                <v-flex xs5>
                  <v-img
                    :src="pelicula.src"
                    height="125px"
                    contain
                  ></v-img>
                </v-flex>
                <v-flex xs7>
                  <v-card-title primary-title>
                    <div>
                      <div class="headline">{{pelicula.titulo}}</div>
                      <div>{{pelicula.sinopsis}}</div>
                      <div>{{pelicula.fecha}}</div>
                    </div>
                  </v-card-title>
                </v-flex>
              </v-layout>
              <v-divider light></v-divider>
              <v-card-actions class="pa-3">
                Califica esta pelicula
                <v-spacer></v-spacer>
                <v-icon>videocam</v-icon>
                <v-icon>star_border</v-icon>
                <v-icon>star_border</v-icon>
                <v-icon>star_border</v-icon>
                <v-icon>star_border</v-icon>
              </v-card-actions>
            </v-card>
          </v-flex>
        </v-layout>
      </v-container>
    </v-card>
</template>

<script>
  export default {
    data () {
      return {
        peliculas:[
          {
            titulo:'aquaman',
            src:'https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/main_element/public/media/image/2018/11/posters-aquaman.jpg?itok=VvqepQmZ',
            sinopsis:'historia de un sireno y su amigo chico percebe',
            fecha:'2019'
          },
          {
            titulo:'Battle Angel Alita',
            src:'https://akamai-platform.foxfilm.com/s3/production/201901/154c0160cc03d637a75f30cb0f0765ff3b88ef0f.jpg',
            sinopsis:'una ojona que pelea contra maquinas',
            fecha:'2019'
          },
          {
            titulo:'el ultimo salto del cojo',
            src:'https://www.tiendadebastones.com/WebRoot/StoreES3/Shops/ec9169/5930/485C/7749/E83A/4853/52DF/D07D/91A2/G2147gN_ml.jpg',
            sinopsis:'un cojo salto, sera que se cayo?',
            fecha:'2020'
          }
        ]
      }
    }
  }
</script>

<style>

</style>
