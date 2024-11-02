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
        _font = Builder(name = "Font", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.0f, 52.8f)
                curveTo(249.3f, 40.3f, 237.3f, 32.0f, 224.0f, 32.0f)
                reflectiveCurveToRelative(-25.3f, 8.3f, -30.0f, 20.8f)
                lineTo(57.8f, 416.0f)
                lineTo(32.0f, 416.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-1.8f, 0.0f)
                lineToRelative(18.0f, -48.0f)
                lineToRelative(159.6f, 0.0f)
                lineToRelative(18.0f, 48.0f)
                lineToRelative(-1.8f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-25.8f, 0.0f)
                lineTo(254.0f, 52.8f)
                close()
                moveTo(279.8f, 304.0f)
                lineToRelative(-111.6f, 0.0f)
                lineTo(224.0f, 155.1f)
                lineTo(279.8f, 304.0f)
                close()
            }
        }
        .build()
        return _font!!
    }

private var _font: ImageVector? = null
