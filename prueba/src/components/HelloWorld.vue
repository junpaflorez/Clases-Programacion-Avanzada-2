<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <input v-model="peso" type="number" name="peso">
    <input v-model="altura" type="number" name="altura">
    <button @click="cambiarMensaje()">Cambiar Mensaje</button>
  </div>
</template>

<script>
import Axios from 'axios';
export default {
  data () {
      return {
        msg:"hola a todos",
        peso:75,
        altura:187
      }
  },
  methods:
      {
        cambiarMensaje(){
          Axios
          .get("http://localhost:8080/saludo/imc?peso="+this.peso+"&altura="+this.altura)
          .then(Response => (this.msg = Response.data));
        }
      }
}
</script>
