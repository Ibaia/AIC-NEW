<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/style.css">
    
<title>Registro</title>
</head>
<body>
<header>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">AIC</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="index.html">Inicio <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="registro.html">Registro</a>
            </li>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>
      </nav>
    </header>
    
    <main>
      <br>
      <div class="container-fluid mr-1 ml-3">
        <div class="row">
          <div class="col-md-3 col-center">
              <form class="form-signin">
                  <img class="mb-4" src="FOTO.png" alt="" width="100" height="100">
                  <h1 class="h3 mb-3 font-weight-normal">Register</h1>
  
          <div class="row">
              <div class="col-md-6"><label for="inputName" class="sr-only">Nombre</label>
                  <input type="text" id="inputName" class="form-control" placeholder="Nombre" required autofocus>
              </div>
  
              <div class="col-md-6"><label for="inputSurname" class="sr-only">Apellido</label>
                  <input type="text" id="inputSurname" class="form-control" placeholder="Apellido" required>
              </div> 
          </div>
          <div class="row">
              <div class="col-md-12"><label for="inputUser" class="sr-only">Usuario</label>
                  <input type="text" id="inputUser" class="form-control" placeholder="Usuario" required>
              </div>
          </div>
          <div class="row">
              <div class="col-md-12">
                  <label for="inputEmail" class="sr-only">E-mail</label>
                  <input type="text" id="inputEmail" class="form-control" placeholder="E-mail" required>
              </div>
          </div>
          <div class="row">
              <div class="col-md-6">
                  <label for="inputPassword" class="sr-only">Contrasenia</label>
                  <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
              </div>
              <div class="col-md-6 offset-md2">
                  <label for="inputPassword2" class="sr-only">Confirmacion</label>
                  <input type="password" id="inputPassword2" class="form-control" placeholder="Confirmacion" required>
              </div>
          </div>
          <div class="row">
              <div class="col-md-12">
                  <label for="inputDNI" class="sr-only">DNI</label>
                  <input type="text" id="inputDNI" class="form-control" placeholder="DNI" required>
              </div>
          </div>
          <div class="row">
              <div class="col-md-12">
                  <label for="inputEdad" class="sr-only">Edad</label>
                  <input type="text" id="inputEdad" class="form-control" placeholder="Edad" required>
              </div>
          </div>
          <div class="row">
              <div class="col-md-12">
                  <label for="inputDireccion" class="sr-only">Direccion</label>
                  <input type="text" id="inputDireccion" class="form-control" placeholder="Direccion" required>
              </div>
          </div>
          <div class="row">
                <div class="col-md-6">
                        <select id="provincia" class="custom-select d-block w-100" required>
                            <option value="0" disabled selected>Elija una opcion</option> 
                            <option value="bizkaia">Bizkaia</option>
                            <option value="nafarroa">Nafarroa</option>
                            <option value="gipuzkoa">Gipuzkoa</option>
                        </select>
                </div>
                <div class="col-md-6">
                        <select class="custom-select d-block w-100" name="poblacion" id="poblacion" disabled="disabled" >
                            <option value="0" disabled selected>Elija una opcion</option>
                            <option class="gipuzkoa" value="donosti">Donosti</option>
                            <option class="nafarroa" value="irun">Irun</option>
                            <option class="bizkaia" value="bilbo" >Bilbo</option>
                            <option class="bizkaia" value="galdakao">Galdakao</option>
                            <option class="nafarroa" value="otxandio">Otxandio</option>
                            <option class="gipuzkoa" value="gazteis">Gazteis</option>
                        </select>
                </div>
            </div>
          <div class="row">
              <div class="col-md-10 offset-md-1">
                  <label for="inputCodigoPostal" class="sr-only">CodigoPostal</label>
                  <input type="text" id="inputCodigoPostal" class="form-control" placeholder="CP" required>
              </div>
          </div>
          <div class="col-md-12">
          <label>
            <input name="check"type="checkbox" value="1" onclick= "submit.disabled = !this.checked"> Acepto las condiciones
            </label>
            </div>
              <a href="index.html">
                  <button name="submit" type="button" class="btn btn-lg btn-block btn-primary" disabled>Registrarse</button></a>
           </form>
          </div>
      </div>  
   
    </main>
   
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script type="text/javascript" src="../js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="javascript/script.js"></script>
</body>
</html>