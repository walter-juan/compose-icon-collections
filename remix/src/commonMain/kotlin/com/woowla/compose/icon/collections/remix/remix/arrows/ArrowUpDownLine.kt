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

public val ArrowsGroup.ArrowUpDownLine: ImageVector
    get() {
        if (_arrowUpDownLine != null) {
            return _arrowUpDownLine!!
        }
        _arrowUpDownLine = Builder(name = "ArrowUpDownLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.95f, 7.95f)
                lineTo(10.536f, 9.364f)
                lineTo(8.001f, 6.828f)
                lineTo(8.0f, 20.0f)
                horizontalLineTo(6.0f)
                lineTo(6.001f, 6.828f)
                lineTo(3.465f, 9.364f)
                lineTo(2.05f, 7.95f)
                lineTo(7.0f, 3.0f)
                lineTo(11.95f, 7.95f)
                close()
                moveTo(21.95f, 16.05f)
                lineTo(17.0f, 21.0f)
                lineTo(12.05f, 16.05f)
                lineTo(13.465f, 14.636f)
                lineTo(16.001f, 17.172f)
                lineTo(16.0f, 4.0f)
                horizontalLineTo(18.0f)
                lineTo(18.001f, 17.172f)
                lineTo(20.536f, 14.636f)
                lineTo(21.95f, 16.05f)
                close()
            }
        }
        .build()
        return _arrowUpDownLine!!
    }

private var _arrowUpDownLine: ImageVector? = null
