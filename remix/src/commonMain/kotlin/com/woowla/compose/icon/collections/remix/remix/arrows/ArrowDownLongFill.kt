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

public val ArrowsGroup.ArrowDownLongFill: ImageVector
    get() {
        if (_arrowDownLongFill != null) {
            return _arrowDownLongFill!!
        }
        _arrowDownLongFill = Builder(name = "ArrowDownLongFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                lineTo(11.0f, 2.0f)
                lineTo(11.0f, 15.586f)
                horizontalLineTo(5.586f)
                lineTo(12.0f, 22.0f)
                lineTo(18.414f, 15.586f)
                lineTo(13.0f, 15.586f)
                lineTo(13.0f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowDownLongFill!!
    }

private var _arrowDownLongFill: ImageVector? = null
