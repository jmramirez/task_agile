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

.public.container {
  max-width: 900px;
}

.public {
  .form {
    margin-top: 50px;
    width: 320px;

    .form-group {
      label {
        font-weight: bold;
        color: #555;
      }

      .error {
        line-height: 1;
        display: none;
        margin-top: 5px;
      }
    }
  }
}


.field-error {
  .error {
    display: block;
    color: #ff0000;
  }
}


</style>
