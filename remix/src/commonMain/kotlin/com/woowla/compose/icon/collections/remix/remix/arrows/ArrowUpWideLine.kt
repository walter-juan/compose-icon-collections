package com.woowla.compose.icon.collections.remix.remix.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.ArrowsGroup

public val ArrowsGroup.ArrowUpWideLine: ImageVector
    get() {
        if (_arrowUpWideLine != null) {
            return _arrowUpWideLine!!
        }
        _arrowUpWideLine = Builder(name = "ArrowUpWideLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.369f)
                lineTo(20.968f, 13.116f)
                lineTo(20.032f, 14.884f)
                lineTo(12.0f, 10.632f)
                lineTo(3.968f, 14.884f)
                lineTo(3.032f, 13.116f)
                lineTo(12.0f, 8.369f)
                close()
            }
        }
        .build()
        return _arrowUpWideLine!!
    }

private var _arrowUpWideLine: ImageVector? = null
