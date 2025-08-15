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

public val SolidGroup.Radiation: ImageVector
    get() {
        if (_radiation != null) {
            return _radiation!!
        }
        _radiation = Builder(name = "Radiation", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(446.2f, 34.5f)
                curveToRelative(-14.2f, -10.1f, -33.5f, -4.6f, -42.2f, 10.5f)
                lineTo(331.6f, 170.3f)
                curveToRelative(31.3f, 15.8f, 52.8f, 48.3f, 52.8f, 85.7f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.2f, -14.4f, 30.1f, -31.9f)
                curveToRelative(-9.1f, -78.1f, -51.4f, -146.1f, -112.3f, -189.6f)
                close()
                moveTo(172.7f, 44.9f)
                curveTo(164.0f, 29.8f, 144.7f, 24.3f, 130.5f, 34.5f)
                curveTo(69.6f, 77.9f, 27.3f, 145.9f, 18.2f, 224.1f)
                curveTo(16.1f, 241.6f, 30.7f, 256.0f, 48.3f, 256.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(0.0f, -37.5f, 21.5f, -69.9f, 52.8f, -85.7f)
                lineTo(172.7f, 44.9f)
                close()
                moveTo(163.3f, 461.7f)
                curveToRelative(-8.7f, 15.1f, -3.8f, 34.5f, 12.0f, 41.8f)
                curveToRelative(34.4f, 15.7f, 72.7f, 24.5f, 113.0f, 24.5f)
                reflectiveCurveToRelative(78.6f, -8.8f, 113.0f, -24.5f)
                curveToRelative(15.8f, -7.2f, 20.7f, -26.7f, 12.0f, -41.8f)
                lineTo(341.0f, 336.3f)
                curveToRelative(-15.1f, 9.9f, -33.2f, 15.7f, -52.6f, 15.7f)
                reflectiveCurveToRelative(-37.5f, -5.8f, -52.6f, -15.7f)
                lineTo(163.3f, 461.7f)
                close()
                moveTo(288.3f, 304.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -0.7f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.7f, 96.0f)
                close()
            }
        }
        .build()
        return _radiation!!
    }

private var _radiation: ImageVector? = null
