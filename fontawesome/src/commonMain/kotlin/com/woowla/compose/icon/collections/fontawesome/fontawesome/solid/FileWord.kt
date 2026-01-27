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

public val SolidGroup.FileWord: ImageVector
    get() {
        if (_fileWord != null) {
            return _fileWord!!
        }
        _fileWord = Builder(name = "FileWord", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(213.5f, 0.0f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineTo(365.3f, 125.3f)
                curveToRelative(12.0f, 12.0f, 18.7f, 28.3f, 18.7f, 45.3f)
                lineTo(384.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(208.0f, 58.5f)
                lineToRelative(0.0f, 93.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(325.5f, 176.0f)
                lineTo(208.0f, 58.5f)
                close()
                moveTo(135.4f, 274.8f)
                curveToRelative(-2.9f, -12.9f, -15.7f, -21.1f, -28.6f, -18.2f)
                reflectiveCurveToRelative(-21.1f, 15.7f, -18.2f, 28.6f)
                lineToRelative(32.0f, 144.0f)
                curveToRelative(2.3f, 10.5f, 11.4f, 18.2f, 22.2f, 18.8f)
                reflectiveCurveToRelative(20.6f, -6.1f, 24.0f, -16.4f)
                lineToRelative(25.2f, -75.7f)
                lineToRelative(25.2f, 75.7f)
                curveToRelative(3.4f, 10.2f, 13.2f, 16.9f, 24.0f, 16.4f)
                reflectiveCurveToRelative(19.9f, -8.2f, 22.2f, -18.8f)
                lineToRelative(32.0f, -144.0f)
                curveToRelative(2.9f, -12.9f, -5.3f, -25.8f, -18.2f, -28.6f)
                reflectiveCurveToRelative(-25.8f, 5.3f, -28.6f, 18.2f)
                lineToRelative(-13.2f, 59.4f)
                lineToRelative(-20.6f, -61.8f)
                curveToRelative(-3.3f, -9.8f, -12.4f, -16.4f, -22.8f, -16.4f)
                reflectiveCurveToRelative(-19.5f, 6.6f, -22.8f, 16.4f)
                lineToRelative(-20.6f, 61.8f)
                lineToRelative(-13.2f, -59.4f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
