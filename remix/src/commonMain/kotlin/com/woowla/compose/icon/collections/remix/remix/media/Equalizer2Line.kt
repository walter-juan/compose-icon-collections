package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.Equalizer2Line: ImageVector
    get() {
        if (_equalizer2Line != null) {
            return _equalizer2Line!!
        }
        _equalizer2Line = Builder(name = "Equalizer2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                curveTo(5.0f, 6.172f, 5.672f, 5.5f, 6.5f, 5.5f)
                curveTo(7.328f, 5.5f, 8.0f, 6.172f, 8.0f, 7.0f)
                curveTo(8.0f, 7.828f, 7.328f, 8.5f, 6.5f, 8.5f)
                curveTo(5.672f, 8.5f, 5.0f, 7.828f, 5.0f, 7.0f)
                close()
                moveTo(6.5f, 3.5f)
                curveTo(4.567f, 3.5f, 3.0f, 5.067f, 3.0f, 7.0f)
                curveTo(3.0f, 8.933f, 4.567f, 10.5f, 6.5f, 10.5f)
                curveTo(8.433f, 10.5f, 10.0f, 8.933f, 10.0f, 7.0f)
                curveTo(10.0f, 5.067f, 8.433f, 3.5f, 6.5f, 3.5f)
                close()
                moveTo(12.0f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(16.0f, 16.172f, 16.672f, 15.5f, 17.5f, 15.5f)
                curveTo(18.328f, 15.5f, 19.0f, 16.172f, 19.0f, 17.0f)
                curveTo(19.0f, 17.828f, 18.328f, 18.5f, 17.5f, 18.5f)
                curveTo(16.672f, 18.5f, 16.0f, 17.828f, 16.0f, 17.0f)
                close()
                moveTo(17.5f, 13.5f)
                curveTo(15.567f, 13.5f, 14.0f, 15.067f, 14.0f, 17.0f)
                curveTo(14.0f, 18.933f, 15.567f, 20.5f, 17.5f, 20.5f)
                curveTo(19.433f, 20.5f, 21.0f, 18.933f, 21.0f, 17.0f)
                curveTo(21.0f, 15.067f, 19.433f, 13.5f, 17.5f, 13.5f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _equalizer2Line!!
    }

private var _equalizer2Line: ImageVector? = null
