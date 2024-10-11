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

public val ArrowsGroup.ArrowLeftUpFill: ImageVector
    get() {
        if (_arrowLeftUpFill != null) {
            return _arrowLeftUpFill!!
        }
        _arrowLeftUpFill = Builder(name = "ArrowLeftUpFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.361f, 10.947f)
                lineTo(18.018f, 16.604f)
                lineTo(16.603f, 18.018f)
                lineTo(10.947f, 12.361f)
                lineTo(5.997f, 17.311f)
                verticalLineTo(5.997f)
                horizontalLineTo(17.31f)
                lineTo(12.361f, 10.947f)
                close()
            }
        }
        .build()
        return _arrowLeftUpFill!!
    }

private var _arrowLeftUpFill: ImageVector? = null
