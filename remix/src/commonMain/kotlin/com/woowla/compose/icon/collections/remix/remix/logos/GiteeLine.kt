package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.GiteeLine: ImageVector
    get() {
        if (_giteeLine != null) {
            return _giteeLine!!
        }
        _giteeLine = Builder(name = "GiteeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(17.0f, 6.5f)
                curveTo(17.276f, 6.5f, 17.5f, 6.724f, 17.5f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(17.5f, 8.276f, 17.276f, 8.5f, 17.0f, 8.5f)
                horizontalLineTo(10.0f)
                curveTo(9.172f, 8.5f, 8.5f, 9.172f, 8.5f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(8.5f, 15.276f, 8.724f, 15.5f, 9.0f, 15.5f)
                horizontalLineTo(14.0f)
                curveTo(14.828f, 15.5f, 15.5f, 14.828f, 15.5f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 13.0f, 11.0f, 12.776f, 11.0f, 12.5f)
                verticalLineTo(11.5f)
                curveTo(11.0f, 11.224f, 11.224f, 11.0f, 11.5f, 11.0f)
                horizontalLineTo(17.0f)
                curveTo(17.276f, 11.0f, 17.5f, 11.224f, 17.5f, 11.5f)
                verticalLineTo(14.0f)
                curveTo(17.5f, 15.933f, 15.933f, 17.5f, 14.0f, 17.5f)
                horizontalLineTo(7.0f)
                curveTo(6.724f, 17.5f, 6.5f, 17.276f, 6.5f, 17.0f)
                verticalLineTo(10.0f)
                curveTo(6.5f, 8.067f, 8.067f, 6.5f, 10.0f, 6.5f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _giteeLine!!
    }

private var _giteeLine: ImageVector? = null
