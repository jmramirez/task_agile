<template>
  <div class="container public">
    <div class="row justify-content-center">
      <div class="form">
        <Logo />
        <form>
          <div class="form-group col-12 mb-3">
            <label for="username">Username or email address</label>
            <input id="username" type="text" class="form-control">
          </div>
          <div class="form-group col-12 mb-3">
            <label for="password">Password</label>
            <input id="password" type="password" class="form-control">
          </div>
          <div class="d-grid gap-3 pt-4">
            <button type="submit" class="btn btn-primary">Create account</button>
            <div class="text-center links">
              <p class="text-muted">Don't have an account yet? <a href="/register">Sign up here</a></p>
              <p><a href="#">Forgot your password?</a> </p>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script>

import Logo from "@/components/Logo.vue";

export default {
  name: 'LoginPage',
  components: {Logo}
}
</script>

<style lang="scss" scoped>
.links {
  margin: 30px 0 50px 0;
}
</style>
