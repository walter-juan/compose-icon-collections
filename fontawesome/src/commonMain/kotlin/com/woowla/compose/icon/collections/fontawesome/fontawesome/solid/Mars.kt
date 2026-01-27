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

public val SolidGroup.Mars: ImageVector
    get() {
        if (_mars != null) {
            return _mars!!
        }
        _mars = Builder(name = "Mars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(480.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -50.7f)
                lineToRelative(-95.0f, 95.0f)
                curveToRelative(19.5f, 28.4f, 31.0f, 62.7f, 31.0f, 99.8f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                reflectiveCurveTo(32.0f, 401.2f, 32.0f, 304.0f)
                reflectiveCurveTo(110.8f, 128.0f, 208.0f, 128.0f)
                curveToRelative(37.0f, 0.0f, 71.4f, 11.4f, 99.8f, 31.0f)
                lineToRelative(95.0f, -95.0f)
                lineToRelative(-50.7f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(208.0f, 416.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, -224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, 224.0f)
                close()
            }
        }
        .build()
        return _mars!!
    }

private var _mars: ImageVector? = null
