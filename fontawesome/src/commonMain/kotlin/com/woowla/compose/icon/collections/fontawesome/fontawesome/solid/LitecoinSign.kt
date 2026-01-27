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

public val SolidGroup.LitecoinSign: ImageVector
    get() {
        if (_litecoinSign != null) {
            return _litecoinSign!!
        }
        _litecoinSign = Builder(name = "LitecoinSign", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveTo(64.0f, 46.3f, 64.0f, 64.0f)
                lineToRelative(0.0f, 157.9f)
                lineToRelative(-38.6f, 11.0f)
                curveToRelative(-12.7f, 3.6f, -20.1f, 16.9f, -16.5f, 29.7f)
                reflectiveCurveToRelative(16.9f, 20.1f, 29.7f, 16.5f)
                lineTo(64.0f, 271.8f)
                lineTo(64.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-224.0f, 0.0f)
                lineToRelative(0.0f, -162.5f)
                lineToRelative(134.6f, -38.5f)
                curveToRelative(12.7f, -3.6f, 20.1f, -16.9f, 16.5f, -29.7f)
                reflectiveCurveToRelative(-16.9f, -20.1f, -29.7f, -16.5f)
                lineTo(128.0f, 203.6f)
                lineTo(128.0f, 64.0f)
                close()
            }
        }
        .build()
        return _litecoinSign!!
    }

private var _litecoinSign: ImageVector? = null
