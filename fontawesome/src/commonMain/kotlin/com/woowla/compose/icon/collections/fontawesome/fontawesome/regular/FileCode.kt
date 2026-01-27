package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.FileCode: ImageVector
    get() {
        if (_fileCode != null) {
            return _fileCode!!
        }
        _fileCode = Builder(name = "FileCode", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 48.0f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(0.0f, 88.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                lineToRelative(88.0f, 0.0f)
                lineToRelative(0.0f, 240.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(48.0f, 64.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(224.0f, 67.9f)
                lineToRelative(92.1f, 92.1f)
                lineToRelative(-68.1f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -68.1f)
                close()
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineToRelative(0.0f, -261.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(242.7f, 18.7f)
                curveTo(230.7f, 6.7f, 214.5f, 0.0f, 197.5f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(170.2f, 295.6f)
                curveToRelative(8.6f, -10.1f, 7.5f, -25.2f, -2.6f, -33.8f)
                reflectiveCurveToRelative(-25.2f, -7.5f, -33.8f, 2.6f)
                lineToRelative(-48.0f, 56.0f)
                curveToRelative(-7.7f, 9.0f, -7.7f, 22.2f, 0.0f, 31.2f)
                lineToRelative(48.0f, 56.0f)
                curveToRelative(8.6f, 10.1f, 23.8f, 11.2f, 33.8f, 2.6f)
                reflectiveCurveToRelative(11.2f, -23.8f, 2.6f, -33.8f)
                lineToRelative(-34.6f, -40.4f)
                lineToRelative(34.6f, -40.4f)
                close()
                moveTo(250.2f, 264.4f)
                curveToRelative(-8.6f, -10.1f, -23.8f, -11.2f, -33.8f, -2.6f)
                reflectiveCurveToRelative(-11.2f, 23.8f, -2.6f, 33.8f)
                lineToRelative(34.6f, 40.4f)
                lineToRelative(-34.6f, 40.4f)
                curveToRelative(-8.6f, 10.1f, -7.5f, 25.2f, 2.6f, 33.8f)
                reflectiveCurveToRelative(25.2f, 7.5f, 33.8f, -2.6f)
                lineToRelative(48.0f, -56.0f)
                curveToRelative(7.7f, -9.0f, 7.7f, -22.2f, 0.0f, -31.2f)
                lineToRelative(-48.0f, -56.0f)
                close()
            }
        }
        .build()
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
