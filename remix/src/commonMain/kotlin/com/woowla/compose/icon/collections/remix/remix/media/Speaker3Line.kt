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

public val MediaGroup.Speaker3Line: ImageVector
    get() {
        if (_speaker3Line != null) {
            return _speaker3Line!!
        }
        _speaker3Line = Builder(name = "Speaker3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(7.0f, 8.0f)
                curveTo(6.448f, 8.0f, 6.0f, 7.552f, 6.0f, 7.0f)
                curveTo(6.0f, 6.448f, 6.448f, 6.0f, 7.0f, 6.0f)
                curveTo(7.552f, 6.0f, 8.0f, 6.448f, 8.0f, 7.0f)
                curveTo(8.0f, 7.552f, 7.552f, 8.0f, 7.0f, 8.0f)
                close()
                moveTo(17.0f, 8.0f)
                curveTo(16.448f, 8.0f, 16.0f, 7.552f, 16.0f, 7.0f)
                curveTo(16.0f, 6.448f, 16.448f, 6.0f, 17.0f, 6.0f)
                curveTo(17.552f, 6.0f, 18.0f, 6.448f, 18.0f, 7.0f)
                curveTo(18.0f, 7.552f, 17.552f, 8.0f, 17.0f, 8.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveTo(16.448f, 18.0f, 16.0f, 17.552f, 16.0f, 17.0f)
                curveTo(16.0f, 16.448f, 16.448f, 16.0f, 17.0f, 16.0f)
                curveTo(17.552f, 16.0f, 18.0f, 16.448f, 18.0f, 17.0f)
                curveTo(18.0f, 17.552f, 17.552f, 18.0f, 17.0f, 18.0f)
                close()
                moveTo(7.0f, 18.0f)
                curveTo(6.448f, 18.0f, 6.0f, 17.552f, 6.0f, 17.0f)
                curveTo(6.0f, 16.448f, 6.448f, 16.0f, 7.0f, 16.0f)
                curveTo(7.552f, 16.0f, 8.0f, 16.448f, 8.0f, 17.0f)
                curveTo(8.0f, 17.552f, 7.552f, 18.0f, 7.0f, 18.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.657f, 15.0f, 15.0f, 13.657f, 15.0f, 12.0f)
                curveTo(15.0f, 10.343f, 13.657f, 9.0f, 12.0f, 9.0f)
                curveTo(10.343f, 9.0f, 9.0f, 10.343f, 9.0f, 12.0f)
                curveTo(9.0f, 13.657f, 10.343f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(9.239f, 17.0f, 7.0f, 14.761f, 7.0f, 12.0f)
                curveTo(7.0f, 9.239f, 9.239f, 7.0f, 12.0f, 7.0f)
                curveTo(14.761f, 7.0f, 17.0f, 9.239f, 17.0f, 12.0f)
                curveTo(17.0f, 14.761f, 14.761f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(11.448f, 13.0f, 11.0f, 12.552f, 11.0f, 12.0f)
                curveTo(11.0f, 11.448f, 11.448f, 11.0f, 12.0f, 11.0f)
                curveTo(12.552f, 11.0f, 13.0f, 11.448f, 13.0f, 12.0f)
                curveTo(13.0f, 12.552f, 12.552f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _speaker3Line!!
    }

private var _speaker3Line: ImageVector? = null
