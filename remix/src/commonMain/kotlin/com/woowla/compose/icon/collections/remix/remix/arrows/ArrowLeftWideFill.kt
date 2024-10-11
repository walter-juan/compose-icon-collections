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

public val ArrowsGroup.ArrowLeftWideFill: ImageVector
    get() {
        if (_arrowLeftWideFill != null) {
            return _arrowLeftWideFill!!
        }
        _arrowLeftWideFill = Builder(name = "ArrowLeftWideFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.369f, 12.0f)
                lineTo(13.116f, 3.032f)
                lineTo(14.884f, 3.968f)
                lineTo(10.632f, 12.0f)
                lineTo(14.884f, 20.032f)
                lineTo(13.116f, 20.968f)
                lineTo(8.369f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowLeftWideFill!!
    }

private var _arrowLeftWideFill: ImageVector? = null
