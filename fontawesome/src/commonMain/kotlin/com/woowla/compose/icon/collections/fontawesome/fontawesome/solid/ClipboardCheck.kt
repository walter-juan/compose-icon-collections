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

public val SolidGroup.ClipboardCheck: ImageVector
    get() {
        if (_clipboardCheck != null) {
            return _clipboardCheck!!
        }
        _clipboardCheck = Builder(name = "ClipboardCheck", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(23.7f, 0.0f, 44.4f, 12.9f, 55.4f, 32.0f)
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
                close()
                moveTo(282.9f, 212.6f)
                curveToRelative(-10.7f, -7.8f, -25.7f, -5.4f, -33.5f, 5.3f)
                lineToRelative(-85.6f, 117.7f)
                lineToRelative(-26.5f, -27.4f)
                curveToRelative(-9.2f, -9.5f, -24.4f, -9.8f, -33.9f, -0.6f)
                reflectiveCurveToRelative(-9.8f, 24.4f, -0.6f, 33.9f)
                lineToRelative(46.4f, 48.0f)
                curveToRelative(4.9f, 5.1f, 11.8f, 7.8f, 18.9f, 7.3f)
                reflectiveCurveToRelative(13.6f, -4.1f, 17.8f, -9.8f)
                lineTo(288.2f, 246.1f)
                curveToRelative(7.8f, -10.7f, 5.4f, -25.7f, -5.3f, -33.5f)
                close()
                moveTo(136.0f, 64.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(112.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(136.0f, 64.0f)
                close()
            }
        }
        .build()
        return _clipboardCheck!!
    }

private var _clipboardCheck: ImageVector? = null
