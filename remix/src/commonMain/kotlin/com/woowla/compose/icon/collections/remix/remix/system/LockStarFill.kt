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

public val SystemGroup.LockStarFill: ImageVector
    get() {
        if (_lockStarFill != null) {
            return _lockStarFill!!
        }
        _lockStarFill = Builder(name = "LockStarFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(8.686f, 1.0f, 6.0f, 3.686f, 6.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 8.0f, 3.0f, 8.448f, 3.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.552f, 3.448f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(13.044f)
                curveTo(12.695f, 21.239f, 12.5f, 20.392f, 12.5f, 19.5f)
                curveTo(12.5f, 16.186f, 15.186f, 13.5f, 18.5f, 13.5f)
                curveTo(19.392f, 13.5f, 20.239f, 13.695f, 21.0f, 14.044f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 8.448f, 20.552f, 8.0f, 20.0f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 3.686f, 15.314f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                curveTo(8.0f, 4.791f, 9.791f, 3.0f, 12.0f, 3.0f)
                curveTo(14.209f, 3.0f, 16.0f, 4.791f, 16.0f, 7.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(21.145f, 23.141f)
                lineTo(20.64f, 20.195f)
                lineTo(22.78f, 18.109f)
                lineTo(19.823f, 17.68f)
                lineTo(18.5f, 15.0f)
                lineTo(17.177f, 17.68f)
                lineTo(14.22f, 18.109f)
                lineTo(16.36f, 20.195f)
                lineTo(15.855f, 23.141f)
                lineTo(18.5f, 21.75f)
                lineTo(21.145f, 23.141f)
                close()
            }
        }
        .build()
        return _lockStarFill!!
    }

private var _lockStarFill: ImageVector? = null
