<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Health Track - Alimentação</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/ht_styles.css">
        <link rel="stylesheet" href="open-iconic/font/css/open-iconic-bootstrap.css">
        <link rel="stylesheet" href="css/Chart.min.css">    
    </head>
    <body>
		<%@include file="menu.jsp" %>    

        <section class="container-fluid">
            <h4 class="text-center mt-2 mb-4">Alimentação</h4>    
            <div class="row" style="margin-bottom: 150px;">
                <div class="col-lg-4 col-md-6 col-sm-12 col-xs-12">
                  <section class="mb-3">
                    <button class="btn btn-purple-ht btn-block" type="button" data-toggle="collapse" data-target="#collapseCafe" aria-expanded="true" aria-controls="collapseCafe">
                      Café da manhã
                    </button>
                    <div class="collapse show" id="collapseCafe">
                      <div class="card card-body">
                        <ol class="list-group">
                          <li class="list-group-item d-flex justify-content-between">Pão Francês <span class="">200kCal</span></li>
                          <li class="list-group-item d-flex justify-content-between">Ovo <span class="">80kCal</span></li>
                          <li class="list-group-item d-flex justify-content-between">Leite Desnatado <span class="">50kCal</span></li>
                        </ol>
                        <div class="text-center">
                          <button class="btn btn-sm mt-2 border-purple w-05x">
                            <span class="oi oi-plus"></span>
                          </button>
                        </div>
                      </div>
                    </div>
                  </section>
                  <section class="mb-3">
                    <button class="btn btn-purple-ht btn-block" type="button" data-toggle="collapse" data-target="#collapseAlmoco" aria-expanded="true" aria-controls="collapseAlmoco">
                      Almoço
                    </button>
                    <div class="collapse show" id="collapseAlmoco">
                      <div class="card card-body">
                        <ol class="list-group">
                          <li class="list-group-item d-flex justify-content-between">Arroz Branco <span class="">150kCal</span></li>
                          <li class="list-group-item d-flex justify-content-between">Filé de Frango <span class="">90kCal</span></li>
                        </ol>
                        <div class="text-center">
                          <button class="btn btn-sm mt-2 border-purple w-05x">
                            <span class="oi oi-plus"></span>
                          </button>
                        </div>
                      </div>
                    </div>
                  </section>
                </div>

                <div class="col-lg-4 col-md-6 col-sm-12 col-xs-12">
                  <section class="mb-3">
                    <button class="btn btn-purple-ht btn-block" type="button" data-toggle="collapse" data-target="#collapseJantar" aria-expanded="true" aria-controls="collapseJantar">
                      Jantar
                    </button>
                    <div class="collapse show" id="collapseJantar">
                      <div class="card card-body">
                        <div class="text-center">
                          <button class="btn btn-sm mt-2 border-purple w-05x">
                            <span class="oi oi-plus"></span>
                          </button>
                        </div>
                      </div>
                    </div>
                  </section>
                  <section class="mb-3">
                    <button class="btn btn-purple-ht btn-block" type="button" data-toggle="collapse" data-target="#collapseSnacks" aria-expanded="true" aria-controls="collapseSnacks">
                      Snacks
                    </button>
                    <div class="collapse show" id="collapseSnacks">
                      <div class="card card-body">
                        <ol class="list-group">
                          <li class="list-group-item d-flex justify-content-between">Iogurte natural <span class="">50kCal</span></li>
                          <li class="list-group-item d-flex justify-content-between">Granola de banana <span class="">80kCal</span></li>
                        </ol>
                        <div class="text-center">
                          <button class="btn btn-sm mt-2 border-purple w-05x">
                            <span class="oi oi-plus"></span>
                          </button>
                        </div>
                      </div>
                    </div>
                  </section>
                </div>

                <div class="col-lg-4 col-md-6 col-sm-12 col-xs-12">
                  <div class="card pr-5 pb-3 pt-1 mb-2" >
                    <div class="chart-container">
                      <canvas id="graficoAlimentacao" height="130px">
                      </canvas>
                      <canvas id="graficoAlimentacao2" height="90px">
                      </canvas>
                      <canvas id="graficoAlimentacao3" height="90px">
                      </canvas>
                      <canvas id="graficoAlimentacao4" height="90px">
                      </canvas>
                    </div>
                  </div>
                </div>
            </div>
        </section>

		<%@include file="footer.jsp" %>
		
        <script type="text/javascript" src="js/jquery.slim.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/moment.js"></script>
        <script type="text/javascript" src="js/Chart.min.js"></script>
        <script type="text/javascript" src="js/htCharts.js"></script>
    </body>
</html>