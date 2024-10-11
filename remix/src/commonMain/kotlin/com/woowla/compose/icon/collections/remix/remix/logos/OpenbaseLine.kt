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

public val LogosGroup.OpenbaseLine: ImageVector
    get() {
        if (_openbaseLine != null) {
            return _openbaseLine!!
        }
        _openbaseLine = Builder(name = "OpenbaseLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(2.0f, 5.996f)
                lineTo(3.0f, 15.46f)
                lineTo(12.0f, 22.5f)
                lineTo(21.0f, 15.46f)
                lineTo(22.0f, 5.996f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(19.837f, 7.436f)
                lineTo(12.0f, 19.961f)
                lineTo(4.163f, 7.436f)
                lineTo(12.0f, 5.088f)
                lineTo(19.837f, 7.436f)
                close()
            }
        }
        .build()
        return _openbaseLine!!
    }

private var _openbaseLine: ImageVector? = null
