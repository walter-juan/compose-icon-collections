package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.LockStarLine: ImageVector
    get() {
        if (_lockStarLine != null) {
            return _lockStarLine!!
        }
        _lockStarLine = Builder(name = "LockStarLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveTo(6.0f, 3.686f, 8.686f, 1.0f, 12.0f, 1.0f)
                curveTo(15.314f, 1.0f, 18.0f, 3.686f, 18.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.5f)
                curveTo(20.328f, 8.0f, 21.0f, 8.672f, 21.0f, 9.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.5f)
                curveTo(3.672f, 22.0f, 3.0f, 21.328f, 3.0f, 20.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 8.672f, 3.672f, 8.0f, 4.5f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.0f, 4.791f, 14.209f, 3.0f, 12.0f, 3.0f)
                curveTo(9.791f, 3.0f, 8.0f, 4.791f, 8.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(20.64f, 20.195f)
                lineTo(21.145f, 23.141f)
                lineTo(18.5f, 21.75f)
                lineTo(15.855f, 23.141f)
                lineTo(16.36f, 20.195f)
                lineTo(14.22f, 18.109f)
                lineTo(17.177f, 17.68f)
                lineTo(18.5f, 15.0f)
                lineTo(19.823f, 17.68f)
                lineTo(22.78f, 18.109f)
                lineTo(20.64f, 20.195f)
                close()
            }
        }
        .build()
        return _lockStarLine!!
    }

private var _lockStarLine: ImageVector? = null
