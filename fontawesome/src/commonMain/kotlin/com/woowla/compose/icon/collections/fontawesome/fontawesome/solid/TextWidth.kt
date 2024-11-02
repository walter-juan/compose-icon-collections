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

public val SolidGroup.TextWidth: ImageVector
    get() {
        if (_textWidth != null) {
            return _textWidth!!
        }
        _textWidth = Builder(name = "TextWidth", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 128.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(128.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(224.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
                moveTo(9.4f, 361.4f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.2f, 9.2f, 22.9f, 11.9f, 34.9f, 6.9f)
                reflectiveCurveToRelative(19.8f, -16.6f, 19.8f, -29.6f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 12.9f, 7.8f, 24.6f, 19.8f, 29.6f)
                reflectiveCurveToRelative(25.7f, 2.2f, 34.9f, -6.9f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-9.2f, -9.2f, -22.9f, -11.9f, -34.9f, -6.9f)
                reflectiveCurveToRelative(-19.8f, 16.6f, -19.8f, 29.6f)
                lineToRelative(0.0f, 32.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -12.9f, -7.8f, -24.6f, -19.8f, -29.6f)
                reflectiveCurveToRelative(-25.7f, -2.2f, -34.9f, 6.9f)
                lineToRelative(-64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _textWidth!!
    }

private var _textWidth: ImageVector? = null
