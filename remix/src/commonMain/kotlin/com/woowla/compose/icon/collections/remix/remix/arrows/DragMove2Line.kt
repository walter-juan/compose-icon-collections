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

public val ArrowsGroup.DragMove2Line: ImageVector
    get() {
        if (_dragMove2Line != null) {
            return _dragMove2Line!!
        }
        _dragMove2Line = Builder(name = "DragMove2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                verticalLineTo(5.828f)
                lineTo(9.172f, 7.657f)
                lineTo(7.757f, 6.243f)
                lineTo(12.0f, 2.0f)
                lineTo(16.243f, 6.243f)
                lineTo(14.828f, 7.657f)
                lineTo(13.0f, 5.828f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.172f)
                lineTo(16.343f, 9.172f)
                lineTo(17.757f, 7.757f)
                lineTo(22.0f, 12.0f)
                lineTo(17.757f, 16.243f)
                lineTo(16.343f, 14.828f)
                lineTo(18.172f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.172f)
                lineTo(14.828f, 16.343f)
                lineTo(16.243f, 17.757f)
                lineTo(12.0f, 22.0f)
                lineTo(7.757f, 17.757f)
                lineTo(9.172f, 16.343f)
                lineTo(11.0f, 18.172f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.828f)
                lineTo(7.657f, 14.828f)
                lineTo(6.243f, 16.243f)
                lineTo(2.0f, 12.0f)
                lineTo(6.243f, 7.757f)
                lineTo(7.657f, 9.172f)
                lineTo(5.828f, 11.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _dragMove2Line!!
    }

private var _dragMove2Line: ImageVector? = null
