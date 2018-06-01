-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 01-06-2018 a las 02:31:39
-- Versión del servidor: 10.1.33-MariaDB
-- Versión de PHP: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario-equipo-5`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `iddireccion` int(11) NOT NULL,
  `contacto` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `rfc` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `iddireccion`, `contacto`, `telefono`, `email`, `rfc`) VALUES
(1, 'José Luis', 1, 'Castro', '9535362391', 'jlcastrogro@gmail.com', 'KUCNW4NW4RN'),
(2, 'José Jaime', 2, 'Nicolás', '16846321684', 'josejaime@gmail.com', 'OUEN3KC98H3N'),
(3, 'Egremy', 3, 'Valdez', '685465164', 'egremy@gmail.com', 'UWNE29J38CN'),
(4, 'Irving', 4, 'Mondragón', '6841356', 'irving@gmail.com', 'KUQB23OUNC8');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `id` int(11) NOT NULL,
  `idproveedor` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`id`, `idproveedor`, `fecha`, `total`) VALUES
(1, 1, '2018-05-02', 12.121),
(2, 1, '2018-05-01', 812.12),
(3, 2, '2018-05-02', 18629.12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direccion`
--

CREATE TABLE `direccion` (
  `id` int(11) NOT NULL,
  `pais` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `estado` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `ciudad` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `colonia` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `calle` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `numero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `direccion`
--

INSERT INTO `direccion` (`id`, `pais`, `estado`, `ciudad`, `colonia`, `calle`, `numero`) VALUES
(1, 'México', 'Oaxaca', 'Oaxaca', 'Centro', 'Colón', 22),
(2, 'México', 'Oaxaca', 'Putla', 'Centro', 'Oaxaca', 45);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `listacompra`
--

CREATE TABLE `listacompra` (
  `id` int(11) NOT NULL,
  `idcompra` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `listacompra`
--

INSERT INTO `listacompra` (`id`, `idcompra`, `idproducto`, `cantidad`, `subtotal`) VALUES
(1, 1, 2, 21, 982398.1),
(2, 1, 1, 23, 2839.13),
(3, 2, 2, 2, 123.1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `listaventa`
--

CREATE TABLE `listaventa` (
  `id` int(11) NOT NULL,
  `idventa` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `listaventa`
--

INSERT INTO `listaventa` (`id`, `idventa`, `idproducto`, `cantidad`, `subtotal`) VALUES
(1, 1, 1, 1, 1.1),
(2, 1, 2, 150, 1553.5),
(3, 1, 3, 900, 10500),
(4, 1, 1, 200, 20532.4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `tipo` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `marca` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `costo` double NOT NULL,
  `existencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `tipo`, `marca`, `costo`, `existencia`) VALUES
(1, 'Balón', 'Nike', 150, 1),
(4, 'Balón', 'Puma', 250, 3),
(5, 'Balón', 'Puma', 250, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `iddireccion` int(11) NOT NULL,
  `contacto` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_spanish_ci NOT NULL,
  `rfc` varchar(255) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id`, `nombre`, `iddireccion`, `contacto`, `telefono`, `email`, `rfc`) VALUES
(1, 'José Jaime', 1, 'Nicolás', '351354343', 'josejaime@gmail.com', 'UHS2K28HJ3N3'),
(2, 'José Luis', 2, 'Castro', '168135184351', 'jlcastrogro@gmail.com', 'OUQN82ND3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `venta`
--

CREATE TABLE `venta` (
  `id` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `venta`
--

INSERT INTO `venta` (`id`, `idcliente`, `fecha`, `total`) VALUES
(1, 1, '2018-05-01', 100.1),
(2, 1, '2018-05-01', 100.1),
(3, 1, '2018-05-02', 100.1),
(4, 1, '2018-05-02', 100.1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `direccion`
--
ALTER TABLE `direccion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `listacompra`
--
ALTER TABLE `listacompra`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `listaventa`
--
ALTER TABLE `listaventa`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `venta`
--
ALTER TABLE `venta`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `direccion`
--
ALTER TABLE `direccion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `listacompra`
--
ALTER TABLE `listacompra`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `listaventa`
--
ALTER TABLE `listaventa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `venta`
--
ALTER TABLE `venta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
