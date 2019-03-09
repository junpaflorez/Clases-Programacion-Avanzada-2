<template>
  <v-app >
    <v-toolbar  app extended>
      <v-toolbar-title class="headline text-uppercase">
        <span>Peliculas</span>
        <span class="font-weight-light" style="color:red;"> Mapacheflix FREE 2.0</span>
        
      </v-toolbar-title>
        <v-img
          src="https://media.tenor.com/images/6cd19812ee85b4226c79f281cb10f26a/tenor.gif"
          height="150"
          contain
          class="my-3"
        ></v-img>
    </v-toolbar>

    <v-content>
      <HelloWorld/>
      <v-dialog
      v-model="dialog"
      width="500"
    >
      <template v-slot:activator="{ on }">
        <v-btn
          color="red lighten-2"
          dark
          v-on="on"
        >
          calendario
        </v-btn>
      </template>

      <v-card>
        <v-card-title
          class="headline grey lighten-2"
          primary-title
        >
          Calendario
        </v-card-title>

        <v-card-text>
          <Calendar></Calendar>

          </v-card-text>

        <v-divider></v-divider>

        <v-card-actions>
          <v-spacer></v-spacer>
          <v-btn
            color="primary"
            flat
            @click="dialog = false"
          >
            salir
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-dialog>
    </v-content>
  </v-app>
</template>

<script>
import HelloWorld from './components/HelloWorld'
import Calendar from './components/Calendar'

export default {
  name: 'App',
  components: {
    HelloWorld,
    Calendar
  },
  data () {
    return {
      dialog: false
    }
  }
}
</script>
<style>
.application{
  color:red;
}
</style>
