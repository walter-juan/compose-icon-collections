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

public val SolidGroup.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                curveToRelative(-56.8f, 0.0f, -107.9f, 24.7f, -143.1f, 64.0f)
                lineToRelative(47.1f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 32.0f)
                curveTo(0.0f, 14.3f, 14.3f, 0.0f, 32.0f, 0.0f)
                reflectiveCurveTo(64.0f, 14.3f, 64.0f, 32.0f)
                lineToRelative(0.0f, 54.7f)
                curveTo(110.9f, 33.6f, 179.5f, 0.0f, 256.0f, 0.0f)
                curveTo(397.4f, 0.0f, 512.0f, 114.6f, 512.0f, 256.0f)
                reflectiveCurveTo(397.4f, 512.0f, 256.0f, 512.0f)
                curveToRelative(-87.0f, 0.0f, -163.9f, -43.4f, -210.1f, -109.7f)
                curveToRelative(-10.1f, -14.5f, -6.6f, -34.4f, 7.9f, -44.6f)
                reflectiveCurveToRelative(34.4f, -6.6f, 44.6f, 7.9f)
                curveToRelative(34.8f, 49.8f, 92.4f, 82.3f, 157.6f, 82.3f)
                curveToRelative(106.0f, 0.0f, 192.0f, -86.0f, 192.0f, -192.0f)
                reflectiveCurveTo(362.0f, 64.0f, 256.0f, 64.0f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
