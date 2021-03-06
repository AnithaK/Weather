package com.weather.utilities;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)


    public class Output
    {
        private String id;

        private String dt;

        private Clouds clouds;

        private Coord coord;

        private Wind wind;

        private String cod;

        private Sys sys;

        private String name;

        private Snow snow;

        private String base;

        private Weather[] weather;

        private Main main;

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getDt ()
        {
            return dt;
        }

        public void setDt (String dt)
        {
            this.dt = dt;
        }

        public Clouds getClouds ()
        {
            return clouds;
        }

        public void setClouds (Clouds clouds)
        {
            this.clouds = clouds;
        }

        public Coord getCoord ()
        {
            return coord;
        }

        public void setCoord (Coord coord)
        {
            this.coord = coord;
        }

        public Wind getWind ()
        {
            return wind;
        }

        public void setWind (Wind wind)
        {
            this.wind = wind;
        }

        public String getCod ()
        {
            return cod;
        }

        public void setCod (String cod)
        {
            this.cod = cod;
        }

        public Sys getSys ()
        {
            return sys;
        }

        public void setSys (Sys sys)
        {
            this.sys = sys;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public Snow getSnow ()
        {
            return snow;
        }

        public void setSnow (Snow snow)
        {
            this.snow = snow;
        }

        public String getBase ()
        {
            return base;
        }

        public void setBase (String base)
        {
            this.base = base;
        }

        public Weather[] getWeather ()
        {
            return weather;
        }

        public void setWeather (Weather[] weather)
        {
            this.weather = weather;
        }

        public Main getMain ()
        {
            return main;
        }

        public void setMain (Main main)
        {
            this.main = main;
        }
    }
