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

public val LogosGroup.LinkedinBoxLine: ImageVector
    get() {
        if (_linkedinBoxLine != null) {
            return _linkedinBoxLine!!
        }
        _linkedinBoxLine = Builder(name = "LinkedinBoxLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.001f, 3.0f)
                horizontalLineTo(20.001f)
                curveTo(20.553f, 3.0f, 21.001f, 3.448f, 21.001f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.001f, 20.552f, 20.553f, 21.0f, 20.001f, 21.0f)
                horizontalLineTo(4.001f)
                curveTo(3.449f, 21.0f, 3.001f, 20.552f, 3.001f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.001f, 3.448f, 3.449f, 3.0f, 4.001f, 3.0f)
                close()
                moveTo(5.001f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.001f)
                close()
                moveTo(7.501f, 9.0f)
                curveTo(6.673f, 9.0f, 6.001f, 8.328f, 6.001f, 7.5f)
                curveTo(6.001f, 6.672f, 6.673f, 6.0f, 7.501f, 6.0f)
                curveTo(8.329f, 6.0f, 9.001f, 6.672f, 9.001f, 7.5f)
                curveTo(9.001f, 8.328f, 8.329f, 9.0f, 7.501f, 9.0f)
                close()
                moveTo(6.501f, 10.0f)
                horizontalLineTo(8.501f)
                verticalLineTo(17.5f)
                horizontalLineTo(6.501f)
                verticalLineTo(10.0f)
                close()
                moveTo(12.001f, 10.429f)
                curveTo(12.585f, 9.865f, 13.267f, 9.5f, 14.001f, 9.5f)
                curveTo(16.072f, 9.5f, 17.501f, 11.179f, 17.501f, 13.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(15.501f)
                verticalLineTo(13.25f)
                curveTo(15.501f, 12.283f, 14.717f, 11.5f, 13.751f, 11.5f)
                curveTo(12.785f, 11.5f, 12.001f, 12.283f, 12.001f, 13.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(10.001f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.001f)
                verticalLineTo(10.429f)
                close()
            }
        }
        .build()
        return _linkedinBoxLine!!
    }

private var _linkedinBoxLine: ImageVector? = null
