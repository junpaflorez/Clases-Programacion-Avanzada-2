import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

import VueRouter from 'vue-router'
 
Vue.use(VueRouter)

new Vue({
  render: h => h(App),
}).$mount('#app')
