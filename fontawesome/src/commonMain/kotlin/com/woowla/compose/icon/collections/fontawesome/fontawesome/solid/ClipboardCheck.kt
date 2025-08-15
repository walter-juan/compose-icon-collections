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
                moveTo(276.4f, 260.7f)
                curveToRelative(7.0f, -11.2f, 3.6f, -26.0f, -7.6f, -33.1f)
                reflectiveCurveToRelative(-26.0f, -3.6f, -33.1f, 7.6f)
                lineToRelative(-61.4f, 98.3f)
                lineToRelative(-27.0f, -36.0f)
                curveToRelative(-8.0f, -10.6f, -23.0f, -12.8f, -33.6f, -4.8f)
                reflectiveCurveToRelative(-12.8f, 23.0f, -4.8f, 33.6f)
                lineToRelative(48.0f, 64.0f)
                curveToRelative(4.7f, 6.3f, 12.3f, 9.9f, 20.2f, 9.6f)
                reflectiveCurveToRelative(15.1f, -4.5f, 19.3f, -11.3f)
                lineToRelative(80.0f, -128.0f)
                close()
            }
        }
        .build()
        return _clipboardCheck!!
    }

private var _clipboardCheck: ImageVector? = null
