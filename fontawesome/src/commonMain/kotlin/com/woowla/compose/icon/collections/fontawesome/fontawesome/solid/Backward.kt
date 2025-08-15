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

public val SolidGroup.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.3f, 43.1f)
                curveTo(215.9f, 32.0f, 233.0f, 28.9f, 247.7f, 35.2f)
                reflectiveCurveTo(272.0f, 56.0f, 272.0f, 72.0f)
                lineToRelative(0.0f, 136.3f)
                lineToRelative(172.3f, -165.1f)
                curveTo(455.9f, 32.0f, 473.0f, 28.9f, 487.7f, 35.2f)
                reflectiveCurveTo(512.0f, 56.0f, 512.0f, 72.0f)
                lineToRelative(0.0f, 368.0f)
                curveToRelative(0.0f, 16.0f, -9.6f, 30.5f, -24.3f, 36.8f)
                reflectiveCurveToRelative(-31.8f, 3.2f, -43.4f, -7.9f)
                lineTo(272.0f, 303.7f)
                lineTo(272.0f, 440.0f)
                curveToRelative(0.0f, 16.0f, -9.6f, 30.5f, -24.3f, 36.8f)
                reflectiveCurveToRelative(-31.8f, 3.2f, -43.4f, -7.9f)
                lineToRelative(-192.0f, -184.0f)
                curveTo(4.5f, 277.3f, 0.0f, 266.9f, 0.0f, 256.0f)
                reflectiveCurveToRelative(4.5f, -21.3f, 12.3f, -28.9f)
                lineToRelative(192.0f, -184.0f)
                close()
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null
