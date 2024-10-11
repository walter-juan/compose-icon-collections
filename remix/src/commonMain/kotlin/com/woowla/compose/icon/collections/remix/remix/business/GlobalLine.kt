package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.GlobalLine: ImageVector
    get() {
        if (_globalLine != null) {
            return _globalLine!!
        }
        _globalLine = Builder(name = "GlobalLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.71f, 19.667f)
                curveTo(8.747f, 17.626f, 8.157f, 15.374f, 8.027f, 13.0f)
                horizontalLineTo(4.062f)
                curveTo(4.458f, 16.177f, 6.716f, 18.775f, 9.71f, 19.667f)
                close()
                moveTo(10.031f, 13.0f)
                curveTo(10.181f, 15.439f, 10.878f, 17.73f, 12.0f, 19.752f)
                curveTo(13.122f, 17.73f, 13.819f, 15.439f, 13.969f, 13.0f)
                horizontalLineTo(10.031f)
                close()
                moveTo(19.938f, 13.0f)
                horizontalLineTo(15.973f)
                curveTo(15.843f, 15.374f, 15.253f, 17.626f, 14.29f, 19.667f)
                curveTo(17.284f, 18.775f, 19.542f, 16.177f, 19.938f, 13.0f)
                close()
                moveTo(4.062f, 11.0f)
                horizontalLineTo(8.027f)
                curveTo(8.157f, 8.626f, 8.747f, 6.374f, 9.71f, 4.333f)
                curveTo(6.716f, 5.225f, 4.458f, 7.824f, 4.062f, 11.0f)
                close()
                moveTo(10.031f, 11.0f)
                horizontalLineTo(13.969f)
                curveTo(13.819f, 8.561f, 13.122f, 6.27f, 12.0f, 4.248f)
                curveTo(10.878f, 6.27f, 10.181f, 8.561f, 10.031f, 11.0f)
                close()
                moveTo(14.29f, 4.333f)
                curveTo(15.253f, 6.374f, 15.843f, 8.626f, 15.973f, 11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.542f, 7.824f, 17.284f, 5.225f, 14.29f, 4.333f)
                close()
            }
        }
        .build()
        return _globalLine!!
    }

private var _globalLine: ImageVector? = null
