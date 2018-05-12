-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 12-05-2018 a las 18:52:44
-- Versión del servidor: 10.1.32-MariaDB
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
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) CHARACTER SET latin1 NOT NULL,
  `direccion` varchar(255) CHARACTER SET latin1 NOT NULL,
  `contacto` varchar(255) CHARACTER SET latin1 NOT NULL,
  `telefono` varchar(255) CHARACTER SET latin1 NOT NULL,
  `email` varchar(255) CHARACTER SET latin1 NOT NULL,
  `rfc` varchar(255) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `nombre`, `direccion`, `contacto`, `telefono`, `email`, `rfc`) VALUES
(1, 'José Luis', 'Acatlima', 'Castro', '9535362391', 'jlcastrogro@gmail.com', 'KUCNW4NW4RN'),
(2, 'José Jaime', 'Huajuapan', 'Nicolás', '16846321684', 'josejaime@gmail.com', 'OUEN3KC98H3N'),
(3, 'Egremy', 'Acatlima', 'Valdez', '685465164', 'egremy@gmail.com', 'UWNE29J38CN'),
(4, 'Irving', 'Acatlima', 'Mondragón', '6841356', 'irving@gmail.com', 'KUQB23OUNC8');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `id` int(11) NOT NULL,
  `idproveedor` int(11) NOT NULL,
  `idlistacompra` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `preciototal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`id`, `idproveedor`, `idlistacompra`, `fecha`, `preciototal`) VALUES
(1, 1, 1, '2018-05-01', 1781.1),
(2, 1, 1, '2018-05-02', 12.121),
(3, 1, 2, '2018-05-01', 812.12),
(4, 2, 1, '2018-05-02', 18629.12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `listacompras`
--

CREATE TABLE `listacompras` (
  `id` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` double NOT NULL,
  `idcompra` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `listacompras`
--

INSERT INTO `listacompras` (`id`, `idproducto`, `cantidad`, `subtotal`, `idcompra`) VALUES
(1, 1, 12, 8727.12, 1),
(2, 2, 21, 982398.1, 2),
(3, 1, 23, 2839.13, 1),
(4, 2, 12, 123.1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `listaventas`
--

CREATE TABLE `listaventas` (
  `id` int(11) NOT NULL,
  `idproducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `subtotal` double NOT NULL,
  `idventa` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `listaventas`
--

INSERT INTO `listaventas` (`id`, `idproducto`, `cantidad`, `subtotal`, `idventa`) VALUES
(1, 1, 1, 1.1, 1),
(2, 2, 150, 1553.5, 1),
(3, 3, 900, 10500, 1),
(4, 1, 200, 20532.4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `tipo` varchar(255) CHARACTER SET latin1 NOT NULL,
  `marca` varchar(255) CHARACTER SET latin1 NOT NULL,
  `costo` varchar(255) CHARACTER SET latin1 NOT NULL,
  `existencia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `tipo`, `marca`, `costo`, `existencia`) VALUES
(1, 'Balón', 'Nike', '$180', 1),
(2, 'Guantes', 'Nike', '165.12', 12),
(3, 'Balón', 'Puma', '$120', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) CHARACTER SET latin1 NOT NULL,
  `direccion` varchar(255) CHARACTER SET latin1 NOT NULL,
  `contacto` varchar(255) CHARACTER SET latin1 NOT NULL,
  `telefono` varchar(255) CHARACTER SET latin1 NOT NULL,
  `email` varchar(255) CHARACTER SET latin1 NOT NULL,
  `rfc` varchar(255) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id`, `nombre`, `direccion`, `contacto`, `telefono`, `email`, `rfc`) VALUES
(1, 'José Jaime', 'Huajuapan', 'Nicolás', '351354343', 'josejaime@gmail.com', 'UHS2K28HJ3N3'),
(2, 'José Luis', 'Acatlima', 'Castro', '168135184351', 'jlcastrogro@gmail.com', 'OUQN82ND3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `idcliente` int(11) NOT NULL,
  `idlistaventa` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `preciototal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`id`, `idcliente`, `idlistaventa`, `fecha`, `preciototal`) VALUES
(1, 1, 1, '2018-05-01', 100.1),
(2, 1, 1, '2018-05-01', 100.1),
(3, 1, 1, '2018-05-02', 100.1),
(4, 1, 1, '2018-05-02', 100.1),
(5, 1, 1, '2018-05-02', 100.1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `listacompras`
--
ALTER TABLE `listacompras`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `listaventas`
--
ALTER TABLE `listaventas`
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
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
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
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `listacompras`
--
ALTER TABLE `listacompras`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `listaventas`
--
ALTER TABLE `listaventas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
