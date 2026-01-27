package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.GrokAiFill: ImageVector
    get() {
        if (_grokAiFill != null) {
            return _grokAiFill!!
        }
        _grokAiFill = Builder(name = "GrokAiFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.939f, 4.961f)
                curveTo(7.866f, 2.033f, 12.176f, 1.295f, 15.775f, 2.778f)
                curveTo(16.572f, 3.074f, 17.266f, 3.496f, 17.808f, 3.888f)
                lineTo(14.802f, 5.277f)
                curveTo(12.003f, 4.102f, 8.797f, 4.901f, 6.84f, 6.86f)
                curveTo(4.276f, 9.425f, 3.694f, 13.814f, 6.48f, 16.782f)
                lineTo(6.758f, 17.066f)
                lineTo(0.124f, 23.0f)
                curveTo(1.999f, 21.027f, 3.895f, 18.573f, 2.76f, 15.81f)
                curveTo(1.24f, 12.112f, 2.125f, 7.779f, 4.939f, 4.961f)
                close()
                moveTo(23.9f, 0.1f)
                curveTo(21.636f, 3.274f, 20.715f, 5.489f, 21.703f, 9.74f)
                lineTo(21.696f, 9.733f)
                curveTo(22.449f, 12.934f, 21.644f, 16.484f, 19.043f, 19.088f)
                curveTo(15.764f, 22.373f, 10.517f, 23.104f, 6.196f, 20.147f)
                lineTo(9.209f, 18.751f)
                curveTo(11.967f, 19.835f, 14.984f, 19.358f, 17.152f, 17.188f)
                curveTo(19.321f, 15.017f, 19.807f, 11.855f, 18.718f, 9.224f)
                curveTo(18.511f, 8.725f, 17.89f, 8.599f, 17.455f, 8.92f)
                lineTo(8.59f, 15.472f)
                lineTo(21.289f, 2.701f)
                verticalLineTo(2.712f)
                lineTo(23.9f, 0.1f)
                close()
            }
        }
        .build()
        return _grokAiFill!!
    }

private var _grokAiFill: ImageVector? = null
