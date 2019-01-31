$.fn.serializeObject = function () {
    "use strict";
    var result = {};
    $.each(this.serializeArray(), function (i, element) {

        var node = result[element.name];
        if ("undefined" !== typeof node && node !== null) {

            if ($.isArray(node)) {
                node.push(element.value)
            } else {
                result[element.name] = [node, element.value]
            }
        } else {
            result[element.name] = element.value
        }
    });
    return result
};

function logout() {
    //

    $.ajax({
        url: '/user/api/v1/logout',
        type: 'POST',
        async: false,
        dataType: 'json',
        error: function (error) {
            alert("실패");
        },
        success: function (data) {
            location.href = "/login";
        }
    });
}