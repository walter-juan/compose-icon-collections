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

public val SolidGroup.Underline: ImageVector
    get() {
        if (_underline != null) {
            return _underline!!
        }
        _underline = Builder(name = "Underline", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                lineTo(96.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveTo(113.7f, 64.0f, 96.0f, 64.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveTo(270.3f, 0.0f, 288.0f, 0.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                reflectiveCurveTo(32.0f, 312.4f, 32.0f, 224.0f)
                lineTo(32.0f, 64.0f)
                curveTo(14.3f, 64.0f, 0.0f, 49.7f, 0.0f, 32.0f)
                close()
                moveTo(0.0f, 480.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _underline!!
    }

private var _underline: ImageVector? = null
