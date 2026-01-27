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

public val SolidGroup.ClipboardQuestion: ImageVector
    get() {
        if (_clipboardQuestion != null) {
            return _clipboardQuestion!!
        }
        _clipboardQuestion = Builder(name = "ClipboardQuestion", defaultWidth = 384.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(311.4f, 32.0f)
                lineToRelative(8.6f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 352.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(8.6f, 0.0f)
                curveTo(83.6f, 12.9f, 104.3f, 0.0f, 128.0f, 0.0f)
                lineTo(256.0f, 0.0f)
                curveToRelative(23.7f, 0.0f, 44.4f, 12.9f, 55.4f, 32.0f)
                close()
                moveTo(248.0f, 112.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(136.0f, 64.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(112.0f, 0.0f)
                close()
                moveTo(192.0f, 248.0f)
                curveToRelative(16.1f, 0.0f, 29.2f, 13.1f, 29.2f, 29.2f)
                curveToRelative(0.0f, 8.7f, -3.1f, 13.9f, -6.9f, 17.7f)
                curveToRelative(-4.5f, 4.4f, -10.7f, 7.5f, -16.8f, 9.5f)
                curveToRelative(-14.9f, 5.0f, -29.5f, 19.3f, -29.5f, 39.5f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                curveToRelative(11.5f, 0.0f, 21.2f, -8.1f, 23.5f, -19.0f)
                curveToRelative(19.2f, -7.1f, 53.7f, -26.3f, 53.7f, -71.8f)
                curveToRelative(0.0f, -42.6f, -34.6f, -77.2f, -77.2f, -77.2f)
                reflectiveCurveToRelative(-77.2f, 34.6f, -77.2f, 77.2f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -16.1f, 13.1f, -29.2f, 29.2f, -29.2f)
                close()
                moveTo(220.0f, 416.0f)
                curveToRelative(0.0f, -15.5f, -12.5f, -28.0f, -28.0f, -28.0f)
                reflectiveCurveToRelative(-28.0f, 12.5f, -28.0f, 28.0f)
                reflectiveCurveToRelative(12.5f, 28.0f, 28.0f, 28.0f)
                reflectiveCurveToRelative(28.0f, -12.5f, 28.0f, -28.0f)
                close()
            }
        }
        .build()
        return _clipboardQuestion!!
    }

private var _clipboardQuestion: ImageVector? = null
