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

public val ArrowsGroup.ArrowGoForwardLine: ImageVector
    get() {
        if (_arrowGoForwardLine != null) {
            return _arrowGoForwardLine!!
        }
        _arrowGoForwardLine = Builder(name = "ArrowGoForwardLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.172f, 7.0f)
                horizontalLineTo(11.0f)
                curveTo(7.686f, 7.0f, 5.0f, 9.686f, 5.0f, 13.0f)
                curveTo(5.0f, 16.313f, 7.686f, 19.0f, 11.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                curveTo(6.582f, 21.0f, 3.0f, 17.418f, 3.0f, 13.0f)
                curveTo(3.0f, 8.581f, 6.582f, 5.0f, 11.0f, 5.0f)
                horizontalLineTo(18.172f)
                lineTo(15.636f, 2.464f)
                lineTo(17.05f, 1.05f)
                lineTo(22.0f, 6.0f)
                lineTo(17.05f, 10.949f)
                lineTo(15.636f, 9.535f)
                lineTo(18.172f, 7.0f)
                close()
            }
        }
        .build()
        return _arrowGoForwardLine!!
    }

private var _arrowGoForwardLine: ImageVector? = null
