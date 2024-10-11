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

public val LogosGroup.OpenbaseFill: ImageVector
    get() {
        if (_openbaseFill != null) {
            return _openbaseFill!!
        }
        _openbaseFill = Builder(name = "OpenbaseFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.76f)
                lineTo(21.999f, 5.996f)
                lineTo(21.1f, 15.464f)
                lineTo(12.0f, 22.323f)
                lineTo(2.9f, 15.46f)
                lineTo(2.011f, 6.0f)
                lineTo(12.0f, 2.76f)
                close()
                moveTo(12.0f, 3.585f)
                lineTo(3.189f, 6.435f)
                lineTo(12.0f, 20.793f)
                lineTo(20.806f, 6.435f)
                lineTo(12.0f, 3.585f)
                close()
            }
        }
        .build()
        return _openbaseFill!!
    }

private var _openbaseFill: ImageVector? = null
