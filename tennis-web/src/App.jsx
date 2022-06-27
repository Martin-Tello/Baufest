import React from 'react'
import Typography from './components/Typography/Typography';
import { BrowserRouter, Route, Switch} from 'react-router-dom';
import Wrapper from './components/Wrapper/Wrapper';
import About from './containers/About/About';
import Home from './containers/Home/Home';
import Jugador from './containers/Jugador/Jugador';
import NotFound from './containers/NotFound/NotFound';
import Partido from './containers/Partido/Partido';
import Detalle from './containers/Jugador/Detalle';



const App = () => {
  return (
    <>
      <BrowserRouter>
          <Wrapper>
            <Switch>
              <Route exact path="/" component={Home} />
              <Route exact path="/jugador" component={Jugador} />
              <Route exact path="/jugador/detalle/:id" component={Detalle} />
              <Route exact path="/partido" component={Partido} />
              <Route exact path="/about" component={About} />
              <Route component={NotFound} />
            </Switch>
          </Wrapper>
      </BrowserRouter>
        {/* <h1 className="title-css">Boquita el mas grande!</h1>
        <h1 className="title-jsx"> Para vos!</h1>
        <Typography />
        <style jsx>{`.title-jsx{color:blue}`}</style> */}

    </>
  )
}

export default App