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

public val SolidGroup.PersonBooth: ImageVector
    get() {
        if (_personBooth != null) {
            return _personBooth!!
        }
        _personBooth = Builder(name = "PersonBooth", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 24.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 152.0f, 24.0f)
                arcTo(56.0f, 56.0f, 0.0f, true, true, 40.0f, 24.0f)
                close()
                moveTo(91.1f, 112.0f)
                curveToRelative(23.5f, 0.0f, 45.5f, 11.3f, 59.1f, 30.4f)
                lineToRelative(48.7f, 68.2f)
                curveToRelative(6.0f, 8.4f, 15.7f, 13.4f, 26.0f, 13.4f)
                lineToRelative(31.1f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-31.1f, 0.0f)
                curveToRelative(-31.0f, 0.0f, -60.1f, -15.0f, -78.1f, -40.2f)
                lineToRelative(-2.8f, -3.9f)
                lineToRelative(0.0f, 80.1f)
                lineToRelative(41.6f, 31.2f)
                curveTo(209.8f, 373.3f, 224.0f, 401.8f, 224.0f, 432.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -10.1f, -4.7f, -19.6f, -12.8f, -25.6f)
                lineTo(70.4f, 348.8f)
                curveTo(46.2f, 330.7f, 32.0f, 302.2f, 32.0f, 272.0f)
                lineToRelative(0.0f, -100.9f)
                curveTo(32.0f, 138.5f, 58.5f, 112.0f, 91.1f, 112.0f)
                close()
                moveTo(32.0f, 512.0f)
                lineToRelative(0.0f, -132.7f)
                curveToRelative(3.1f, 2.7f, 6.3f, 5.4f, 9.6f, 7.9f)
                lineTo(96.0f, 428.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(576.0f, 424.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -72.0f)
                lineToRelative(-168.0f, 0.0f)
                curveToRelative(-7.1f, 0.0f, -13.8f, -3.1f, -18.4f, -8.6f)
                reflectiveCurveToRelative(-6.5f, -12.6f, -5.3f, -19.6f)
                lineToRelative(30.7f, -176.7f)
                lineToRelative(-63.1f, -137.6f)
                lineToRelative(0.0f, 72.0f)
                curveToRelative(-5.2f, -1.0f, -10.5f, -1.6f, -16.0f, -1.6f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -120.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                lineTo(520.0f, 0.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                lineToRelative(0.0f, 368.0f)
                close()
                moveTo(288.0f, 336.0f)
                curveToRelative(5.5f, 0.0f, 10.8f, -0.6f, 16.0f, -1.6f)
                lineTo(304.0f, 520.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineToRelative(0.0f, -184.0f)
                lineToRelative(32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _personBooth!!
    }

private var _personBooth: ImageVector? = null
