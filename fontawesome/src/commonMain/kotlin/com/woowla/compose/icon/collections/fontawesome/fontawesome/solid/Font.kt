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

public val SolidGroup.Font: ImageVector
    get() {
        if (_font != null) {
            return _font!!
        }
        _font = Builder(name = "Font", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(285.1f, 50.7f)
                curveTo(279.9f, 39.3f, 268.5f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveToRelative(-23.9f, 7.3f, -29.1f, 18.7f)
                lineTo(59.5f, 416.0f)
                lineTo(48.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(88.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-6.1f, 0.0f)
                lineToRelative(22.0f, -48.0f)
                lineToRelative(208.3f, 0.0f)
                lineToRelative(22.0f, 48.0f)
                lineToRelative(-6.1f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(88.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-11.5f, 0.0f)
                lineToRelative(-167.4f, -365.3f)
                close()
                moveTo(330.8f, 304.0f)
                lineTo(181.2f, 304.0f)
                lineTo(256.0f, 140.8f)
                lineTo(330.8f, 304.0f)
                close()
            }
        }
        .build()
        return _font!!
    }

private var _font: ImageVector? = null
