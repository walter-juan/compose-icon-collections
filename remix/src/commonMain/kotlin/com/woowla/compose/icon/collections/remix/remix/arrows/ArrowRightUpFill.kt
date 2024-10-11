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

public val ArrowsGroup.ArrowRightUpFill: ImageVector
    get() {
        if (_arrowRightUpFill != null) {
            return _arrowRightUpFill!!
        }
        _arrowRightUpFill = Builder(name = "ArrowRightUpFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.051f, 12.361f)
                lineTo(7.394f, 18.018f)
                lineTo(5.98f, 16.604f)
                lineTo(11.637f, 10.947f)
                lineTo(6.687f, 5.997f)
                horizontalLineTo(18.001f)
                verticalLineTo(17.311f)
                lineTo(13.051f, 12.361f)
                close()
            }
        }
        .build()
        return _arrowRightUpFill!!
    }

private var _arrowRightUpFill: ImageVector? = null
