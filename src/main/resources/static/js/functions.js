angular.module('controller', [])
.controller('leaderboard', function($scope, $http) {
    $http.get('http://localhost:8080/leaderBoard').
        then(function(response) {
            $scope.leaderboard = response.data;
        });
});