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

public val SolidGroup.Swatchbook: ImageVector
    get() {
        if (_swatchbook != null) {
            return _swatchbook!!
        }
        _swatchbook = Builder(name = "Swatchbook", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                lineTo(160.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 384.0f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(-96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(223.6f, 425.9f)
                curveToRelative(0.3f, -3.3f, 0.4f, -6.6f, 0.4f, -9.9f)
                lineToRelative(0.0f, -262.0f)
                lineToRelative(75.4f, -75.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(90.5f, 90.5f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineTo(223.6f, 425.9f)
                close()
                moveTo(182.8f, 512.0f)
                lineToRelative(192.0f, -192.0f)
                lineTo(480.0f, 320.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-297.2f, 0.0f)
                close()
                moveTo(128.0f, 64.0f)
                lineTo(64.0f, 64.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                close()
                moveTo(64.0f, 192.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(96.0f, 440.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _swatchbook!!
    }

private var _swatchbook: ImageVector? = null
