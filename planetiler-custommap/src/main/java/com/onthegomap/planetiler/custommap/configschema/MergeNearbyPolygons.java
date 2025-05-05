package com.onthegomap.planetiler.custommap.configschema;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MergeNearbyPolygons(
  @JsonProperty("min_area") double minArea,
  @JsonProperty("min_hole_area") double minHoleArea,
  @JsonProperty("min_distance") double minDistance,
  @JsonProperty("buffer") double buffer
) {}
