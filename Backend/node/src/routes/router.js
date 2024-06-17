const express = require('express');
const router = express.Router();

const endpoint = require('../controller/endpoint');

router.post('/calculaSalario', endpoint.calculaSalario);

module.exports = router;