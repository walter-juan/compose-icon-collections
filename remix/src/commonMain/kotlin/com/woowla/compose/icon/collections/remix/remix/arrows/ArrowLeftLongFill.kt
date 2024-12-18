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

public val ArrowsGroup.ArrowLeftLongFill: ImageVector
    get() {
        if (_arrowLeftLongFill != null) {
            return _arrowLeftLongFill!!
        }
        _arrowLeftLongFill = Builder(name = "ArrowLeftLongFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                lineTo(22.0f, 11.0f)
                lineTo(8.414f, 11.0f)
                verticalLineTo(5.586f)
                lineTo(2.0f, 12.0f)
                lineTo(8.414f, 18.414f)
                lineTo(8.414f, 13.0f)
                lineTo(22.0f, 13.0f)
                close()
            }
        }
        .build()
        return _arrowLeftLongFill!!
    }

private var _arrowLeftLongFill: ImageVector? = null
