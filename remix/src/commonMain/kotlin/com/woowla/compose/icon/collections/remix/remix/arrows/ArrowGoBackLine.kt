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

public val ArrowsGroup.ArrowGoBackLine: ImageVector
    get() {
        if (_arrowGoBackLine != null) {
            return _arrowGoBackLine!!
        }
        _arrowGoBackLine = Builder(name = "ArrowGoBackLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.828f, 7.0f)
                lineTo(8.364f, 9.535f)
                lineTo(6.95f, 10.949f)
                lineTo(2.0f, 6.0f)
                lineTo(6.95f, 1.05f)
                lineTo(8.364f, 2.464f)
                lineTo(5.828f, 5.0f)
                horizontalLineTo(13.0f)
                curveTo(17.418f, 5.0f, 21.0f, 8.581f, 21.0f, 13.0f)
                curveTo(21.0f, 17.418f, 17.418f, 21.0f, 13.0f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                curveTo(16.314f, 19.0f, 19.0f, 16.313f, 19.0f, 13.0f)
                curveTo(19.0f, 9.686f, 16.314f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(5.828f)
                close()
            }
        }
        .build()
        return _arrowGoBackLine!!
    }

private var _arrowGoBackLine: ImageVector? = null
