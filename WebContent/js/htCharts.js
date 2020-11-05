var randomScalingFactor = function() {
    return Math.round(Math.random() * 100);
};

var configkCal = {
    type: 'doughnut',
    data: {
        
        datasets: [{
            data: [
                2000,
                300
            ],
            backgroundColor: [
                'rgb(104, 54, 150)',
                'rgb(180, 143, 214)'
            ],
            label: 'kCal'
        }],
        labels: [
            '2000kCal consumidas', '300kCal restantes'
        ]
    },
    options: {
        responsive: true,
        legend: {
            position: 'right',
            align: 'center'
        },
        title: {
            display: true,
            text: ''
        },
        animation: {
            animateScale: true,
            animateRotate: true
        },
        cutoutPercentage: 65,
        layout: {
            padding: {
                left: 0,
                right: 0,
                top: 0,
                bottom: 0
            }
        }
    }
};

var configProt = {
    type: 'doughnut',
    data: {
        
        datasets: [{
            data: [
                50,
                40
            ],
            backgroundColor: [
                'rgb(104, 54, 150)',
                'rgb(180, 143, 214)'
            ],
            label: 'kCal'
        }],
        labels: [
            '50g proteínas', '40g restantes'
        ]
    },
    options: {
        responsive: true,
        legend: {
            position: 'right',
            align: 'start'
        },
        title: {
            display: true,
            text: ''
        },
        animation: {
            animateScale: true,
            animateRotate: true
        },
        cutoutPercentage: 65,
        layout: {
            padding: {
                left: 0,
                right: 65,
                top: 0,
                bottom: 0
            }
        }
    }
};

var configCarb = {
    type: 'doughnut',
    data: {
        
        datasets: [{
            data: [
                90,
                40
            ],
            backgroundColor: [
                'rgb(104, 54, 150)',
                'rgb(180, 143, 214)'
            ],
            label: 'kCal'
        }],
        labels: [
            '90g carb.', '40g restantes'
        ]
    },
    options: {
        responsive: true,
        legend: {
            position: 'right',
            align: 'start'
        },
        title: {
            display: true,
            text: ''
        },
        animation: {
            animateScale: true,
            animateRotate: true
        },
        cutoutPercentage: 65,
        layout: {
            padding: {
                left: 0,
                right: 65,
                top: 0,
                bottom: 0
            }
        }
    }
};

var configGord = {
    type: 'doughnut',
    data: {
        
        datasets: [{
            data: [
                50,
                40
            ],
            backgroundColor: [
                'rgb(104, 54, 150)',
                'rgb(180, 143, 214)'
            ],
            label: 'kCal'
        }],
        labels: [
            '30g gord.', '20g restantes'
        ]
    },
    options: {
        responsive: true,
        legend: {
            position: 'right',
            align: 'start'
        },
        title: {
            display: true,
            text: ''
        },
        animation: {
            animateScale: true,
            animateRotate: true
        },
        cutoutPercentage: 65,
        layout: {
            padding: {
                left: 0,
                right: 65,
                top: 0,
                bottom: 0
            }
        }
    }
};

var configGraficoExercicios = {
    type: 'line',
    data: {
        labels: ['05/05/20', '06/05/20', '07/05/20', '08/05/20', '09/05/20', '10/05/20', '11/05/20'],
        datasets: [{
            label: 'Exercício Anaeróbico',
            backgroundColor: 'rgb(104, 54, 150)',
            borderColor: 'rgb(104, 54, 150)',
            data: [
                10,
                12,
                10,
                13,
                10,
                10,
                16
            ],
            fill: false,
        }, {
            label: 'Exercício Aeróbico',
            fill: false,
            backgroundColor: 'rgb(180, 143, 214)',
            borderColor: 'rgb(180, 143, 214)',
            data: [
                15,
                25,
                19,
                8,
                5,
                6,
                10
            ],
        }]
    },
    options: {
        responsive: true,
        title: {
            display: true,
            text: 'Chart.js Line Chart'
        },
        tooltips: {
            mode: 'index',
            intersect: false,
        },
        hover: {
            mode: 'nearest',
            intersect: true
        },
        scales: {
            xAxes: [{
                display: true,
                scaleLabel: {
                    display: true,
                    labelString: 'Data'
                }
            }],
            yAxes: [{
                display: true,
                scaleLabel: {
                    display: true,
                    labelString: 'Minutos'
                }
            }]
        }
    }
};

var configGraficoPesagem = {
    type: 'line',
    data: {
        labels: ['05/05/20', '06/05/20', '07/05/20', '08/05/20', '09/05/20', '10/05/20', '11/05/20'],
        datasets: [{
            label: 'Peso',
            backgroundColor: 'rgb(104, 54, 150)',
            borderColor: 'rgb(104, 54, 150)',
            data: [86, 85, 85, 85, 85, 85, 84],
            fill: false,
        }]
    },
    options: {
        responsive: true,
        title: {
            display: true,
            text: 'Peso x tempo'
        },
        tooltips: {
            mode: 'index',
            intersect: false,
        },
        hover: {
            mode: 'nearest',
            intersect: true
        },
        scales: {
            xAxes: [{
                display: true,
                scaleLabel: {
                    display: true,
                    labelString: 'Data'
                }
            }],
            yAxes: [{
                display: true,
                scaleLabel: {
                    display: true,
                    labelString: 'Peso'
                }
            }]
        }
    }
};

window.onload = function() {
    var ctx = document.getElementById('graficoAlimentacao').getContext('2d');
    window.myDoughnut = new Chart(ctx, configkCal);

    ctx = document.getElementById('graficoAlimentacao2').getContext('2d');
    window.myDoughnut2 = new Chart(ctx, configProt);

    ctx = document.getElementById('graficoAlimentacao3').getContext('2d');
    window.myDoughnut3 = new Chart(ctx, configCarb);
    
    ctx = document.getElementById('graficoAlimentacao4').getContext('2d');
    window.myDoughnut4 = new Chart(ctx, configGord);
    
    ctx = document.getElementById('graficoExercicios').getContext('2d');
    window.graficoExercicios = new Chart(ctx, configGraficoExercicios);
    
    ctx = document.getElementById('graficoPesagem').getContext('2d');
    window.graficoPesagem = new Chart(ctx, configGraficoPesagem);
    
};