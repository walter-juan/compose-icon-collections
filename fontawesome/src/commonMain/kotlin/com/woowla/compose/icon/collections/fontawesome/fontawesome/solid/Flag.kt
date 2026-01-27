package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(64.0f, 14.3f, 49.7f, 0.0f, 32.0f, 0.0f)
                reflectiveCurveTo(0.0f, 14.3f, 0.0f, 32.0f)
                lineTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -121.6f)
                lineToRelative(62.7f, -18.8f)
                curveToRelative(41.9f, -12.6f, 87.1f, -8.7f, 126.2f, 10.9f)
                curveToRelative(42.7f, 21.4f, 92.5f, 24.0f, 137.2f, 7.2f)
                lineToRelative(37.1f, -13.9f)
                curveToRelative(12.5f, -4.7f, 20.8f, -16.6f, 20.8f, -30.0f)
                lineToRelative(0.0f, -247.7f)
                curveToRelative(0.0f, -23.0f, -24.2f, -38.0f, -44.8f, -27.7f)
                lineToRelative(-11.8f, 5.9f)
                curveToRelative(-44.9f, 22.5f, -97.8f, 22.5f, -142.8f, 0.0f)
                curveToRelative(-36.4f, -18.2f, -78.3f, -21.8f, -117.2f, -10.1f)
                lineTo(64.0f, 54.4f)
                lineTo(64.0f, 32.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
