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

public val LogosGroup.SwitchLine: ImageVector
    get() {
        if (_switchLine != null) {
            return _switchLine!!
        }
        _switchLine = Builder(name = "SwitchLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.601f)
                curveTo(5.06f, 21.0f, 3.001f, 18.941f, 3.001f, 16.4f)
                verticalLineTo(7.6f)
                curveTo(3.001f, 5.059f, 5.06f, 3.0f, 7.601f, 3.0f)
                horizontalLineTo(12.001f)
                close()
                moveTo(10.001f, 5.0f)
                horizontalLineTo(7.601f)
                curveTo(6.165f, 5.0f, 5.001f, 6.164f, 5.001f, 7.6f)
                verticalLineTo(16.4f)
                curveTo(5.001f, 17.836f, 6.165f, 19.0f, 7.601f, 19.0f)
                horizontalLineTo(10.001f)
                verticalLineTo(5.0f)
                close()
                moveTo(7.501f, 10.0f)
                curveTo(6.673f, 10.0f, 6.001f, 9.328f, 6.001f, 8.5f)
                curveTo(6.001f, 7.672f, 6.673f, 7.0f, 7.501f, 7.0f)
                curveTo(8.329f, 7.0f, 9.001f, 7.672f, 9.001f, 8.5f)
                curveTo(9.001f, 9.328f, 8.329f, 10.0f, 7.501f, 10.0f)
                close()
                moveTo(14.001f, 3.0f)
                horizontalLineTo(16.401f)
                curveTo(18.941f, 3.0f, 21.001f, 5.059f, 21.001f, 7.6f)
                verticalLineTo(16.4f)
                curveTo(21.001f, 18.941f, 18.941f, 21.0f, 16.401f, 21.0f)
                horizontalLineTo(14.001f)
                verticalLineTo(3.0f)
                close()
                moveTo(17.001f, 14.7f)
                curveTo(17.995f, 14.7f, 18.801f, 13.894f, 18.801f, 12.9f)
                curveTo(18.801f, 11.906f, 17.995f, 11.1f, 17.001f, 11.1f)
                curveTo(16.007f, 11.1f, 15.201f, 11.906f, 15.201f, 12.9f)
                curveTo(15.201f, 13.894f, 16.007f, 14.7f, 17.001f, 14.7f)
                close()
            }
        }
        .build()
        return _switchLine!!
    }

private var _switchLine: ImageVector? = null
