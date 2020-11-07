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
            <h4 class="text-center mt-2 mb-4">Atividades físicas</h4>    
            <div class="row" style="margin-bottom: 150px;">
                <div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
                    <section class="mb-3">
                        <button class="btn btn-purple-ht btn-block" type="button" data-toggle="collapse" data-target="#collapseCafe" aria-expanded="true" aria-controls="collapseCafe">
                            Exercícios aeróbicos
                        </button>
                        <div class="collapse show" id="collapseCafe">
                            <div class="card card-body">
                                <ol class="list-group">
                                    <li class="list-group-item d-flex justify-content-between">
                                        Ciclismo
                                        <span class="">40min</span>
                                        <span class="">200kCal</span>
                                    </li>
                                    <li class="list-group-item d-flex justify-content-between">
                                        Caminhada
                                        <span class="">20min</span>
                                        <span class="">100kCal</span>
                                    </li>
                                </ol>
                                <div class="text-center">
                                    <button class="btn btn-sm mt-2 border-purple w-05x" data-toggle="modal"
                                    data-target="#modalFormExercicios">
                                        <span class="oi oi-plus"></span>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </section>
                    <section class="mb-3">
                        <button class="btn btn-purple-ht btn-block" type="button" data-toggle="collapse" data-target="#collapseAlmoco" aria-expanded="true" aria-controls="collapseAlmoco">
                            Exercícios anaeróbicos
                        </button>
                        <div class="collapse show" id="collapseAlmoco">
                            <div class="card card-body">
                                <ol class="list-group">
                                    <li class="list-group-item d-flex justify-content-between">Musculação 
                                        <span>1h</span>
                                        <span>150kCal</span>
                                    </li>
                                </ol>
                                <div class="text-center">
                                    <button class="btn btn-sm mt-2 border-purple w-05x" data-toggle="modal"
                                        data-target="#modalFormExercicios">
                                        <span class="oi oi-plus"></span>
                                    </button>
                                </div>
                            </div>
                            </div>
                    </section>
                </div>

                <div class="col-lg-8 col-md-12 col-sm-12 col-xs-12">
                    <div class="card mb-2 p-3" >
                        <div class="font-size-large">Exercícios</div>
                        <div class="chart-container">
                            <canvas id="graficoExercicios" height="170px">
    
                            </canvas>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <div id="modalFormExercicios" class="modal" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
              <div class="modal-content">
                <div class="modal-header">
                  <h5 class="modal-title">Adicionar Atividade Física</h5>
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                  </button>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="form-group">
                            <label for="selectAtividadeFisica">Atividade realizada:</label>
                            <select class="form-control" name="selectAtividadeFisica">
                                <option>Corrida</option>
                                <option>Caminhada</option>
                                <option>Ciclismo</option>
                                <option>Funcional</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="minutos">Tempo (em minutos):</label>
                            <input class="form-control" type="number" name="minutos" id="minutosExercicio">
                        </div>
                        <div class="d-flex justify-content-center">
                            <button type="submit" class="btn btn-purple-ht btn-lg btn-lg-ht text-white">Salvar</button>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Sair</button>
                </div>
              </div>
            </div>
          </div>


		<%@include file="footer.jsp" %>
        
        <script type="text/javascript" src="js/jquery.slim.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/moment.js"></script>
        <script type="text/javascript" src="js/Chart.min.js"></script>
        <script type="text/javascript" src="js/htChartsExercicios.js"></script>
        <script type="text/javascript">
            $('#modalFormExercicios').on('shown.bs.modal', function () {
                $('#myInput').trigger('focus')
            })


        </script>
    </body>
</html>