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

public val ArrowsGroup.ArrowDropUpLine: ImageVector
    get() {
        if (_arrowDropUpLine != null) {
            return _arrowDropUpLine!!
        }
        _arrowDropUpLine = Builder(name = "ArrowDropUpLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.828f)
                lineTo(9.172f, 14.657f)
                lineTo(7.757f, 13.243f)
                lineTo(12.0f, 9.0f)
                lineTo(16.243f, 13.243f)
                lineTo(14.828f, 14.657f)
                lineTo(12.0f, 11.828f)
                close()
            }
        }
        .build()
        return _arrowDropUpLine!!
    }

private var _arrowDropUpLine: ImageVector? = null