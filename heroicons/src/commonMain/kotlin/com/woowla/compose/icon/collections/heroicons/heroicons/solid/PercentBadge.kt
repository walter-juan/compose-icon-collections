package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.PercentBadge: ImageVector
    get() {
        if (_percentBadge != null) {
            return _percentBadge!!
        }
        _percentBadge = Builder(name = "PercentBadge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.99f, 2.243f)
                curveTo(10.633f, 2.243f, 9.417f, 2.844f, 8.592f, 3.792f)
                curveTo(7.339f, 3.705f, 6.055f, 4.14f, 5.095f, 5.099f)
                curveTo(4.136f, 6.059f, 3.701f, 7.344f, 3.788f, 8.597f)
                curveTo(2.841f, 9.421f, 2.24f, 10.637f, 2.24f, 11.994f)
                curveTo(2.24f, 13.351f, 2.841f, 14.567f, 3.788f, 15.391f)
                curveTo(3.701f, 16.644f, 4.136f, 17.93f, 5.095f, 18.889f)
                curveTo(6.054f, 19.849f, 7.34f, 20.284f, 8.593f, 20.196f)
                curveTo(9.417f, 21.144f, 10.633f, 21.745f, 11.99f, 21.745f)
                curveTo(13.346f, 21.745f, 14.563f, 21.144f, 15.387f, 20.196f)
                curveTo(16.639f, 20.283f, 17.924f, 19.848f, 18.884f, 18.889f)
                curveTo(19.843f, 17.93f, 20.278f, 16.645f, 20.191f, 15.392f)
                curveTo(21.138f, 14.567f, 21.739f, 13.351f, 21.739f, 11.994f)
                curveTo(21.739f, 10.637f, 21.139f, 9.421f, 20.191f, 8.597f)
                curveTo(20.279f, 7.344f, 19.844f, 6.059f, 18.884f, 5.099f)
                curveTo(17.925f, 4.14f, 16.64f, 3.704f, 15.387f, 3.792f)
                curveTo(14.562f, 2.844f, 13.346f, 2.243f, 11.99f, 2.243f)
                close()
                moveTo(15.52f, 9.523f)
                curveTo(15.813f, 9.23f, 15.813f, 8.755f, 15.52f, 8.462f)
                curveTo(15.227f, 8.169f, 14.752f, 8.169f, 14.459f, 8.462f)
                lineTo(8.459f, 14.463f)
                curveTo(8.166f, 14.756f, 8.167f, 15.231f, 8.459f, 15.524f)
                curveTo(8.752f, 15.816f, 9.227f, 15.816f, 9.52f, 15.524f)
                lineTo(15.52f, 9.523f)
                close()
                moveTo(9.74f, 8.618f)
                curveTo(9.118f, 8.618f, 8.615f, 9.121f, 8.615f, 9.743f)
                curveTo(8.615f, 10.364f, 9.118f, 10.868f, 9.74f, 10.868f)
                curveTo(10.361f, 10.868f, 10.865f, 10.364f, 10.865f, 9.743f)
                curveTo(10.865f, 9.121f, 10.361f, 8.618f, 9.74f, 8.618f)
                close()
                moveTo(14.24f, 13.118f)
                curveTo(13.618f, 13.118f, 13.115f, 13.622f, 13.115f, 14.243f)
                curveTo(13.115f, 14.864f, 13.618f, 15.368f, 14.24f, 15.368f)
                curveTo(14.861f, 15.368f, 15.365f, 14.864f, 15.365f, 14.243f)
                curveTo(15.365f, 13.622f, 14.861f, 13.118f, 14.24f, 13.118f)
                close()
            }
        }
        .build()
        return _percentBadge!!
    }

private var _percentBadge: ImageVector? = null
