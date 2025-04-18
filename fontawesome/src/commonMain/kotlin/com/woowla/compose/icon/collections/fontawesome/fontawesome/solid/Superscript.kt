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

public val SolidGroup.Superscript: ImageVector
    get() {
        if (_superscript != null) {
            return _superscript!!
        }
        _superscript = Builder(name = "Superscript", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 32.0f)
                curveToRelative(0.0f, -11.1f, -5.7f, -21.4f, -15.2f, -27.2f)
                reflectiveCurveToRelative(-21.2f, -6.4f, -31.1f, -1.4f)
                lineToRelative(-32.0f, 16.0f)
                curveToRelative(-15.8f, 7.9f, -22.2f, 27.1f, -14.3f, 42.9f)
                curveTo(393.0f, 73.5f, 404.3f, 80.0f, 416.0f, 80.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(0.0f, -128.0f)
                close()
                moveTo(32.0f, 64.0f)
                curveTo(14.3f, 64.0f, 0.0f, 78.3f, 0.0f, 96.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(15.3f, 0.0f)
                lineToRelative(89.6f, 128.0f)
                lineTo(47.3f, 384.0f)
                lineTo(32.0f, 384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(10.4f, 0.0f, 20.2f, -5.1f, 26.2f, -13.6f)
                lineTo(176.0f, 311.8f)
                lineToRelative(85.8f, 122.6f)
                curveToRelative(6.0f, 8.6f, 15.8f, 13.6f, 26.2f, 13.6f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-15.3f, 0.0f)
                lineTo(215.1f, 256.0f)
                lineToRelative(89.6f, -128.0f)
                lineToRelative(15.3f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-10.4f, 0.0f, -20.2f, 5.1f, -26.2f, 13.6f)
                lineTo(176.0f, 200.2f)
                lineTo(90.2f, 77.6f)
                curveTo(84.2f, 69.1f, 74.4f, 64.0f, 64.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                close()
            }
        }
        .build()
        return _superscript!!
    }

private var _superscript: ImageVector? = null
