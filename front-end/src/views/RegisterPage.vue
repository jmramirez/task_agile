<script>

</script>

<template>
  <div class="container">
    <div class="row justify-content-center">
      <div class="register-form">
        <div class="logo-wrapper">
          <img class="logo" src="@/assets/logo.png" alt="logo" />
          <div class="tagline">Open source task management tool</div>
        </div>
        <form>
          <div class="form-group col-12 mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control" id="username">
          </div>
          <div class="form-group col-12 mb-3">
            <label for="emailAddress" class="form-label">Email Address</label>
            <input type="email" class="form-control" id="emailAddress">
          </div>
          <div class="form-group col-12 mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password">
          </div>
          <div class="d-grid gap-3 pt-4">
            <button type="submit" class="btn btn-primary">Create account</button>
            <p class="text-center text-muted">Already have an account? <a href="/login">Sign in</a></p>
          </div>
        </form>
      </div>
    </div>
    <footer class="footer">
      <span class="copyright">&copy; 2022 TaskAgile.com</span>
    </footer>
  </div>
</template>

<style lang="scss" scoped>
.container {
  max-width: 900px;
}

.register-form {
  margin-top: 50px;
  max-width: 320px;

  .form-group {
    .form-label {
      font-weight: bold;
      color: #555;
    }
  }
}

.logo-wrapper {
  text-align: center;
  margin-bottom: 40px;

  .tagline {
    line-height: 180%;
    color: #666;
  }

  .logo {
    max-width: 150px;
    margin: 0 auto;
  }
}

.footer {
  width: 100%;
  font-size: 13px;
  color: #666;
  line-height: 40px;
  border-top: 1px solid #ddd;
  margin-top: 50px;
}
</style>
