var configProgresso = {
    type: 'doughnut',
    data: {
        
        datasets: [{
            data: [
                40,
                60
            ],
            backgroundColor: [
                'rgb(180, 143, 214)',
                'rgb(104, 54, 150)'
            ],
            label: ''
        }],
        labels: [
            '40%','60%'
        ]
    },
    options: {
        responsive: true,
        legend: {
            position: 'bottom',
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

window.onload = function() {
    var ctx = document.getElementById('graficoProgresso').getContext('2d');
    window.myDoughnut = new Chart(ctx, configProgresso);
}