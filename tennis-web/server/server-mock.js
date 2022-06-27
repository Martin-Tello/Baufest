const Express = require('express');
const router = new Express.Router();

const delay = (ms) => new Promise((res) => setTimeout(res,ms));
router.get('/health', (req, res) => {
    res.status(200);
    res.json({ status: 'up' });
});


router.get('/jugadores', async (req, res) => {
    await delay(2000);
    res.status(200);
    //res.status(409).send(new Error());
    res.json(require('../mock/jugadores-list.json'));
});
router.post('/jugadores', async (req, res) => {
    await delay(1000);
    //res.status(409).send(new Error());
    res.status(200);
    res.json({ message: 'usuario cargado' });
});
router.put('/jugadores/:id', async (req, res) => {
    await delay(3000);
    //res.status(409).send(new Error());
    res.status(200);
    res.json( { message: 'usuario modificado' } );
});
router.delete('/jugadores/:id', async (req, res) => {
    await delay(3000);
    //res.status(409).send(new Error());
    res.status(200);
    res.json({ message: 'usuario borrado' });
});
module.exports = router;

