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

public val ArrowsGroup.ArrowRightDownLine: ImageVector
    get() {
        if (_arrowRightDownLine != null) {
            return _arrowRightDownLine!!
        }
        _arrowRightDownLine = Builder(name = "ArrowRightDownLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.59f, 16.003f)
                lineTo(5.983f, 7.397f)
                lineTo(7.397f, 5.982f)
                lineTo(16.004f, 14.589f)
                verticalLineTo(7.003f)
                horizontalLineTo(18.004f)
                verticalLineTo(18.003f)
                horizontalLineTo(7.004f)
                verticalLineTo(16.003f)
                horizontalLineTo(14.59f)
                close()
            }
        }
        .build()
        return _arrowRightDownLine!!
    }

private var _arrowRightDownLine: ImageVector? = null
