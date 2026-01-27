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

public val SolidGroup.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                curveTo(32.0f, 28.7f, 60.7f, 0.0f, 96.0f, 0.0f)
                lineTo(256.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 192.0f)
                lineToRelative(8.0f, 0.0f)
                curveToRelative(48.6f, 0.0f, 88.0f, 39.4f, 88.0f, 88.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineToRelative(0.0f, -154.0f)
                curveToRelative(-27.6f, -7.1f, -48.0f, -32.2f, -48.0f, -62.0f)
                lineToRelative(0.0f, -59.5f)
                lineToRelative(-25.8f, -28.3f)
                curveToRelative(-8.9f, -9.8f, -8.2f, -25.0f, 1.6f, -33.9f)
                reflectiveCurveToRelative(25.0f, -8.2f, 33.9f, 1.6f)
                lineToRelative(71.7f, 78.8f)
                curveToRelative(9.4f, 10.3f, 14.6f, 23.7f, 14.6f, 37.7f)
                lineTo(512.0f, 376.0f)
                curveToRelative(0.0f, 39.8f, -32.2f, 72.0f, -72.0f, 72.0f)
                reflectiveCurveToRelative(-72.0f, -32.2f, -72.0f, -72.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 161.4f)
                curveToRelative(9.3f, 3.3f, 16.0f, 12.2f, 16.0f, 22.6f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(40.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                curveToRelative(0.0f, -10.5f, 6.7f, -19.3f, 16.0f, -22.6f)
                lineTo(32.0f, 64.0f)
                close()
                moveTo(96.0f, 80.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -96.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(112.0f, 64.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
