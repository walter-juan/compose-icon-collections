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

public val SolidGroup.Strikethrough: ImageVector
    get() {
        if (_strikethrough != null) {
            return _strikethrough!!
        }
        _strikethrough = Builder(name = "Strikethrough", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 157.5f)
                curveTo(96.0f, 88.2f, 152.2f, 32.0f, 221.5f, 32.0f)
                lineTo(368.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(221.5f, 96.0f)
                curveToRelative(-34.0f, 0.0f, -61.5f, 27.5f, -61.5f, 61.5f)
                curveToRelative(0.0f, 31.0f, 23.1f, 57.2f, 53.9f, 61.0f)
                lineToRelative(44.1f, 5.5f)
                lineToRelative(222.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(83.1f, 0.0f)
                curveTo(103.0f, 204.6f, 96.0f, 181.8f, 96.0f, 157.5f)
                close()
                moveTo(349.2f, 336.0f)
                lineToRelative(65.5f, 0.0f)
                curveToRelative(0.9f, 6.1f, 1.4f, 12.2f, 1.4f, 18.5f)
                curveToRelative(0.0f, 69.3f, -56.2f, 125.5f, -125.5f, 125.5f)
                lineTo(144.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(146.5f, 0.0f)
                curveToRelative(34.0f, 0.0f, 61.5f, -27.5f, 61.5f, -61.5f)
                curveToRelative(0.0f, -6.4f, -1.0f, -12.7f, -2.8f, -18.5f)
                close()
            }
        }
        .build()
        return _strikethrough!!
    }

private var _strikethrough: ImageVector? = null
