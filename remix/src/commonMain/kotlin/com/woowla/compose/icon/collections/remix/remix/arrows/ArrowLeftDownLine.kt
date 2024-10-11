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

public val ArrowsGroup.ArrowLeftDownLine: ImageVector
    get() {
        if (_arrowLeftDownLine != null) {
            return _arrowLeftDownLine!!
        }
        _arrowLeftDownLine = Builder(name = "ArrowLeftDownLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 13.589f)
                lineTo(17.607f, 4.982f)
                lineTo(19.021f, 6.397f)
                lineTo(10.414f, 15.003f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.003f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.003f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.589f)
                close()
            }
        }
        .build()
        return _arrowLeftDownLine!!
    }

private var _arrowLeftDownLine: ImageVector? = null
