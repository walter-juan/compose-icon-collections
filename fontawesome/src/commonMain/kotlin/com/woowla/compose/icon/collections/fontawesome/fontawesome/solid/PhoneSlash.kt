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

public val SolidGroup.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) {
            return _phoneSlash!!
        }
        _phoneSlash = Builder(name = "PhoneSlash", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(535.0f, -24.9f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineTo(41.0f, 537.1f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(141.5f, 368.6f)
                curveTo(89.2f, 310.5f, 51.6f, 238.8f, 34.8f, 159.4f)
                curveTo(18.7f, 83.1f, 73.9f, 20.6f, 138.5f, 2.9f)
                lineToRelative(5.5f, -1.5f)
                curveToRelative(19.7f, -5.4f, 40.3f, 4.7f, 48.1f, 23.5f)
                lineToRelative(40.5f, 97.3f)
                curveToRelative(6.9f, 16.5f, 2.1f, 35.6f, -11.8f, 47.0f)
                lineToRelative(-44.1f, 36.1f)
                curveToRelative(12.9f, 28.5f, 29.6f, 54.8f, 49.5f, 78.5f)
                lineTo(535.0f, -24.9f)
                close()
                moveTo(384.6f, 509.1f)
                curveToRelative(-63.0f, -13.4f, -121.3f, -39.8f, -171.7f, -76.3f)
                lineTo(297.8f, 348.0f)
                curveToRelative(12.2f, 8.2f, 25.0f, 15.6f, 38.3f, 22.2f)
                lineTo(374.7f, 323.0f)
                curveToRelative(11.3f, -13.9f, 30.4f, -18.6f, 47.0f, -11.8f)
                lineTo(519.0f, 351.8f)
                curveToRelative(18.8f, 7.8f, 28.9f, 28.4f, 23.5f, 48.1f)
                lineToRelative(-1.5f, 5.5f)
                curveToRelative(-17.6f, 64.6f, -80.2f, 119.8f, -156.4f, 103.7f)
                close()
            }
        }
        .build()
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
