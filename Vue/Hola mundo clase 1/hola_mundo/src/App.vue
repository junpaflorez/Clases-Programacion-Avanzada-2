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
    </v-content>
  </v-app>
</template>

<script>
import HelloWorld from './components/HelloWorld'

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data () {
    return {
      //
    }
  }
}
</script>
<style>
.application{
  color:red;
}
</style>
