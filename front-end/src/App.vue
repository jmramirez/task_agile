<script setup>
import { RouterView} from 'vue-router'
</script>

<template>
  <div>
    <RouterView />
  </div>
</template>

<style lang="scss">

html {
  font-size: 14px;
}

.form-group {
  .error {
    line-height: 1;
    display: none;
    margin-top: 5px;
  }
}

.field-error {
  .error {
    display: block;
    color: #ff0000;
  }
}


</style>
