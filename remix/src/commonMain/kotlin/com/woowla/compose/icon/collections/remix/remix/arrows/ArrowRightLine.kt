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

public val ArrowsGroup.ArrowRightLine: ImageVector
    get() {
        if (_arrowRightLine != null) {
            return _arrowRightLine!!
        }
        _arrowRightLine = Builder(name = "ArrowRightLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.172f, 11.0f)
                lineTo(10.808f, 5.636f)
                lineTo(12.222f, 4.222f)
                lineTo(20.0f, 12.0f)
                lineTo(12.222f, 19.778f)
                lineTo(10.808f, 18.364f)
                lineTo(16.172f, 13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.172f)
                close()
            }
        }
        .build()
        return _arrowRightLine!!
    }

private var _arrowRightLine: ImageVector? = null
