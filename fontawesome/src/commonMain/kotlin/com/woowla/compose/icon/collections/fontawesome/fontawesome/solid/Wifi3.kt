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

public val SolidGroup.Wifi3: ImageVector
    get() {
        if (_wifi3 != null) {
            return _wifi3!!
        }
        _wifi3 = Builder(name = "Wifi3", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 96.0f)
                curveToRelative(-90.9f, 0.0f, -173.2f, 36.0f, -233.7f, 94.6f)
                curveToRelative(-12.7f, 12.3f, -33.0f, 12.0f, -45.2f, -0.7f)
                reflectiveCurveToRelative(-12.0f, -33.0f, 0.7f, -45.2f)
                curveTo(81.7f, 74.9f, 179.9f, 32.0f, 288.0f, 32.0f)
                reflectiveCurveTo(494.3f, 74.9f, 566.3f, 144.7f)
                curveToRelative(12.7f, 12.3f, 13.0f, 32.6f, 0.7f, 45.2f)
                reflectiveCurveToRelative(-32.6f, 13.0f, -45.2f, 0.7f)
                curveTo(461.2f, 132.0f, 378.9f, 96.0f, 288.0f, 96.0f)
                close()
                moveTo(240.0f, 432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(168.0f, 326.2f)
                curveToRelative(-11.7f, 13.3f, -31.9f, 14.5f, -45.2f, 2.8f)
                reflectiveCurveToRelative(-14.5f, -31.9f, -2.8f, -45.2f)
                curveTo(161.0f, 237.4f, 221.1f, 208.0f, 288.0f, 208.0f)
                reflectiveCurveToRelative(127.0f, 29.4f, 168.0f, 75.8f)
                curveToRelative(11.7f, 13.3f, 10.4f, 33.5f, -2.8f, 45.2f)
                reflectiveCurveToRelative(-33.5f, 10.4f, -45.2f, -2.8f)
                curveTo(378.6f, 292.9f, 335.8f, 272.0f, 288.0f, 272.0f)
                reflectiveCurveToRelative(-90.6f, 20.9f, -120.0f, 54.2f)
                close()
            }
        }
        .build()
        return _wifi3!!
    }

private var _wifi3: ImageVector? = null
