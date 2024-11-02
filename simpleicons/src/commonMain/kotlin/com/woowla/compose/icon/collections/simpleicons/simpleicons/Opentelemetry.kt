package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Opentelemetry: ImageVector
    get() {
        if (_opentelemetry != null) {
            return _opentelemetry!!
        }
        _opentelemetry = Builder(name = "Opentelemetry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.697f, 13.117f)
                curveToRelative(-1.022f, 1.022f, -1.022f, 2.68f, 0.0f, 3.702f)
                curveToRelative(1.022f, 1.022f, 2.68f, 1.022f, 3.702f, 0.0f)
                curveToRelative(1.022f, -1.022f, 1.022f, -2.68f, 0.0f, -3.702f)
                curveToRelative(-1.022f, -1.022f, -2.68f, -1.022f, -3.702f, 0.0f)
                close()
                moveTo(15.465f, 15.887f)
                curveToRelative(-0.506f, 0.506f, -1.327f, 0.506f, -1.833f, 0.0f)
                reflectiveCurveToRelative(-0.506f, -1.327f, 0.0f, -1.833f)
                curveToRelative(0.506f, -0.506f, 1.327f, -0.506f, 1.833f, 0.0f)
                curveToRelative(0.506f, 0.504f, 0.506f, 1.327f, 0.0f, 1.833f)
                close()
                moveTo(16.356f, 0.235f)
                lineToRelative(-1.604f, 1.604f)
                curveToRelative(-0.314f, 0.314f, -0.314f, 0.83f, 0.0f, 1.144f)
                lineTo(21.015f, 9.247f)
                curveToRelative(0.314f, 0.314f, 0.83f, 0.314f, 1.144f, 0.0f)
                lineToRelative(1.604f, -1.604f)
                curveToRelative(0.314f, -0.314f, 0.314f, -0.83f, 0.0f, -1.144f)
                lineTo(17.498f, 0.235f)
                curveToRelative(-0.314f, -0.314f, -0.828f, -0.314f, -1.142f, 0.0f)
                close()
                moveTo(5.117f, 20.734f)
                curveToRelative(0.285f, -0.285f, 0.285f, -0.75f, 0.0f, -1.035f)
                lineToRelative(-0.816f, -0.816f)
                curveToRelative(-0.285f, -0.285f, -0.75f, -0.285f, -1.035f, 0.0f)
                lineToRelative(-1.684f, 1.684f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.463f, -0.463f)
                curveToRelative(-0.256f, -0.256f, -0.672f, -0.256f, -0.925f, 0.0f)
                curveToRelative(-0.256f, 0.256f, -0.256f, 0.672f, 0.0f, 0.925f)
                lineToRelative(2.775f, 2.775f)
                curveToRelative(0.256f, 0.256f, 0.672f, 0.256f, 0.925f, 0.0f)
                curveToRelative(0.253f, -0.256f, 0.256f, -0.672f, 0.0f, -0.925f)
                lineToRelative(-0.463f, -0.463f)
                lineToRelative(0.002f, -0.002f)
                close()
                moveTo(13.603f, 4.841f)
                lineTo(10.039f, 8.405f)
                curveToRelative(-0.316f, 0.316f, -0.316f, 0.837f, 0.0f, 1.154f)
                lineToRelative(2.201f, 2.201f)
                curveToRelative(1.555f, -1.12f, 3.737f, -0.981f, 5.136f, 0.419f)
                lineToRelative(1.782f, -1.782f)
                curveToRelative(0.316f, -0.317f, 0.316f, -0.837f, 0.0f, -1.154f)
                lineToRelative(-4.401f, -4.401f)
                curveToRelative(-0.317f, -0.319f, -0.837f, -0.319f, -1.154f, 0.0f)
                close()
                moveTo(11.315f, 12.686f)
                lineTo(10.015f, 11.387f)
                curveToRelative(-0.304f, -0.304f, -0.803f, -0.304f, -1.108f, 0.0f)
                lineToRelative(-4.584f, 4.586f)
                curveToRelative(-0.304f, 0.304f, -0.304f, 0.803f, 0.0f, 1.108f)
                lineToRelative(2.597f, 2.597f)
                curveToRelative(0.304f, 0.304f, 0.803f, 0.304f, 1.108f, 0.0f)
                lineToRelative(2.948f, -2.953f)
                curveToRelative(-0.623f, -1.288f, -0.511f, -2.843f, 0.338f, -4.038f)
                close()
            }
        }
        .build()
        return _opentelemetry!!
    }

private var _opentelemetry: ImageVector? = null
