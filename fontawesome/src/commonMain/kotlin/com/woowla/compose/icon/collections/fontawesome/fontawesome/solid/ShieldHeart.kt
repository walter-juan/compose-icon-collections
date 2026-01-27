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

public val SolidGroup.ShieldHeart: ImageVector
    get() {
        if (_shieldHeart != null) {
            return _shieldHeart!!
        }
        _shieldHeart = Builder(name = "ShieldHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(269.4f, 2.9f)
                curveTo(265.2f, 1.0f, 260.7f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(-9.2f, 1.0f, -13.4f, 2.9f)
                lineTo(54.3f, 82.8f)
                curveToRelative(-22.0f, 9.3f, -38.4f, 31.0f, -38.3f, 57.2f)
                curveToRelative(0.5f, 99.2f, 41.3f, 280.7f, 213.6f, 363.2f)
                curveToRelative(16.7f, 8.0f, 36.1f, 8.0f, 52.8f, 0.0f)
                curveToRelative(172.4f, -82.5f, 213.2f, -264.0f, 213.6f, -363.2f)
                curveToRelative(0.1f, -26.2f, -16.3f, -47.9f, -38.3f, -57.2f)
                lineTo(269.4f, 2.9f)
                close()
                moveTo(249.6f, 183.5f)
                lineToRelative(6.4f, 8.5f)
                lineToRelative(6.4f, -8.5f)
                curveToRelative(11.1f, -14.8f, 28.5f, -23.5f, 46.9f, -23.5f)
                curveToRelative(32.4f, 0.0f, 58.7f, 26.3f, 58.7f, 58.7f)
                lineToRelative(0.0f, 5.3f)
                curveToRelative(0.0f, 49.1f, -65.8f, 98.1f, -96.5f, 118.3f)
                curveToRelative(-9.5f, 6.2f, -21.5f, 6.2f, -30.9f, 0.0f)
                curveToRelative(-30.7f, -20.2f, -96.5f, -69.3f, -96.5f, -118.3f)
                lineToRelative(0.0f, -5.3f)
                curveToRelative(0.0f, -32.4f, 26.3f, -58.7f, 58.7f, -58.7f)
                curveToRelative(18.5f, 0.0f, 35.9f, 8.7f, 46.9f, 23.5f)
                close()
            }
        }
        .build()
        return _shieldHeart!!
    }

private var _shieldHeart: ImageVector? = null
