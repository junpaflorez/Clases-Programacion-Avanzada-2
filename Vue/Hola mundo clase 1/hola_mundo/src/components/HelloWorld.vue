<template>
  <v-container>
    <v-layout
      text-xs-center
      wrap
    >
      <v-flex xs12>
        <v-img
          src="https://media.tenor.com/images/6cd19812ee85b4226c79f281cb10f26a/tenor.gif"
          class="my-3"
          contain
          height="200"
        ></v-img>
      </v-flex>

      <v-flex mb-4>
        <h1 class="display-2 font-weight-bold mb-3">
          Bienvenido a Programacion Avanzada II
        </h1>
        
      </v-flex>

    </v-layout>
    <v-container >
        <v-layout row>
        <v-flex xs12 sm6 >
          <v-card dark>
            <v-container grid-list-sm fluid>
              <v-layout row wrap>
                <v-flex
                  v-for="n in 9"
                  :key="n"
                  xs4
                  d-flex
                >
                  <v-card flat tile class="d-flex">
                    <v-img
                      :src="`https://picsum.photos/500/300?image=${n * 5 + 10}`"
                      :lazy-src="`https://picsum.photos/10/6?image=${n * 5 + 10}`"
                      aspect-ratio="1"
                      class="grey lighten-2"
                    >
                      <template v-slot:placeholder>
                        <v-layout
                          fill-height
                          align-center
                          justify-center
                          ma-0
                        >
                          <v-progress-circular indeterminate color="grey lighten-5"></v-progress-circular>
                        </v-layout>
                      </template>
                    </v-img>
                  </v-card>
                </v-flex>
              </v-layout>
            </v-container>
          </v-card>
          <v-card dark>
                  <p>
        Java es un lenguaje de programación creado por Sun Microsystems, (empresa que
        posteriormente fue comprada por Oracle) para poder funcionar en distintos tipos de
        procesadores. Su sintaxis es muy parecida a la de C o C++, e incorpora como propias
        algunas características que en otros lenguajes son extensiones: gestión de hilos, ejecución
        remota, etc.
        El código Java, una vez compilado, puede llevarse sin modificación alguna sobre
        cualquier máquina, y ejecutarlo. Esto se debe a que el código se ejecuta sobre una
        máquina hipotética o virtual, la Java Virtual Machine, que se encarga de interpretar el
        código (ficheros compilados .class) y convertirlo a código particular de la CPU que se
        esté utilizando (siempre que se soporte dicha máquina virtual).
      </p>
          </v-card>

        </v-flex>

      </v-layout>

    </v-container>
    <v-carousel>
    <v-carousel-item 
      v-for="(item,i) in items"
      :key="i"
      :src="item.src"
    ></v-carousel-item>
  </v-carousel>
  </v-container>
</template>

<script>
  export default {
    data () {
      return {
        items: [
          {
            src: 'https://cdn.vuetifyjs.com/images/carousel/squirrel.jpg'
          },
          {
            src: 'https://cdn.vuetifyjs.com/images/carousel/sky.jpg'
          },
          {
            src: 'https://cdn.vuetifyjs.com/images/carousel/bird.jpg'
          },
          {
            src: 'https://cdn.vuetifyjs.com/images/carousel/planet.jpg'
          }
        ]
      }
    }
  }
</script>

<style>

</style>
