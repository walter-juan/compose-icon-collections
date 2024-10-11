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

public val SystemGroup.RefreshLine: ImageVector
    get() {
        if (_refreshLine != null) {
            return _refreshLine!!
        }
        _refreshLine = Builder(name = "RefreshLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.463f, 4.433f)
                curveTo(7.216f, 2.917f, 9.501f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 14.136f, 21.33f, 16.116f, 20.189f, 17.741f)
                lineTo(17.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                curveTo(9.85f, 4.0f, 7.898f, 4.848f, 6.46f, 6.228f)
                lineTo(5.463f, 4.433f)
                close()
                moveTo(18.537f, 19.567f)
                curveTo(16.784f, 21.083f, 14.499f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 9.864f, 2.67f, 7.884f, 3.811f, 6.259f)
                lineTo(7.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(14.15f, 20.0f, 16.102f, 19.152f, 17.54f, 17.772f)
                lineTo(18.537f, 19.567f)
                close()
            }
        }
        .build()
        return _refreshLine!!
    }

private var _refreshLine: ImageVector? = null
