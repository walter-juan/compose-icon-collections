package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsNavigation: ImageVector
    get() {
        if (_bxsNavigation != null) {
            return _bxsNavigation!!
        }
        _bxsNavigation = Builder(name = "BxsNavigation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.002f, 9.538f)
                curveToRelative(-0.023f, 0.411f, 0.207f, 0.794f, 0.581f, 0.966f)
                lineToRelative(7.504f, 3.442f)
                lineToRelative(3.442f, 7.503f)
                curveToRelative(0.164f, 0.356f, 0.52f, 0.583f, 0.909f, 0.583f)
                lineToRelative(0.057f, -0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.894f, -0.686f)
                lineToRelative(5.595f, -17.032f)
                curveToRelative(0.117f, -0.358f, 0.023f, -0.753f, -0.243f, -1.02f)
                reflectiveCurveToRelative(-0.66f, -0.358f, -1.02f, -0.243f)
                lineTo(2.688f, 8.645f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -0.686f, 0.893f)
                close()
            }
        }
        .build()
        return _bxsNavigation!!
    }

private var _bxsNavigation: ImageVector? = null
