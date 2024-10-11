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

public val MediaGroup.TapeFill: ImageVector
    get() {
        if (_tapeFill != null) {
            return _tapeFill!!
        }
        _tapeFill = Builder(name = "TapeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.829f, 13.0f)
                curveTo(10.94f, 12.687f, 11.0f, 12.351f, 11.0f, 12.0f)
                curveTo(11.0f, 10.343f, 9.657f, 9.0f, 8.0f, 9.0f)
                curveTo(6.343f, 9.0f, 5.0f, 10.343f, 5.0f, 12.0f)
                curveTo(5.0f, 13.657f, 6.343f, 15.0f, 8.0f, 15.0f)
                horizontalLineTo(16.0f)
                curveTo(17.657f, 15.0f, 19.0f, 13.657f, 19.0f, 12.0f)
                curveTo(19.0f, 10.343f, 17.657f, 9.0f, 16.0f, 9.0f)
                curveTo(14.343f, 9.0f, 13.0f, 10.343f, 13.0f, 12.0f)
                curveTo(13.0f, 12.351f, 13.06f, 12.687f, 13.171f, 13.0f)
                horizontalLineTo(10.829f)
                close()
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.552f, 3.0f, 22.0f, 3.448f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(15.448f, 13.0f, 15.0f, 12.552f, 15.0f, 12.0f)
                curveTo(15.0f, 11.448f, 15.448f, 11.0f, 16.0f, 11.0f)
                curveTo(16.552f, 11.0f, 17.0f, 11.448f, 17.0f, 12.0f)
                curveTo(17.0f, 12.552f, 16.552f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveTo(7.448f, 13.0f, 7.0f, 12.552f, 7.0f, 12.0f)
                curveTo(7.0f, 11.448f, 7.448f, 11.0f, 8.0f, 11.0f)
                curveTo(8.552f, 11.0f, 9.0f, 11.448f, 9.0f, 12.0f)
                curveTo(9.0f, 12.552f, 8.552f, 13.0f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tapeFill!!
    }

private var _tapeFill: ImageVector? = null
