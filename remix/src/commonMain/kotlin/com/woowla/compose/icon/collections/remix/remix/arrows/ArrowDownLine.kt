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

public val ArrowsGroup.ArrowDownLine: ImageVector
    get() {
        if (_arrowDownLine != null) {
            return _arrowDownLine!!
        }
        _arrowDownLine = Builder(name = "ArrowDownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.172f)
                lineTo(18.364f, 10.808f)
                lineTo(19.778f, 12.222f)
                lineTo(12.0f, 20.0f)
                lineTo(4.222f, 12.222f)
                lineTo(5.636f, 10.808f)
                lineTo(11.0f, 16.172f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.172f)
                close()
            }
        }
        .build()
        return _arrowDownLine!!
    }

private var _arrowDownLine: ImageVector? = null
