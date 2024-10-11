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

public val SystemGroup.AppsFill: ImageVector
    get() {
        if (_appsFill != null) {
            return _appsFill!!
        }
        _appsFill = Builder(name = "AppsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 2.5f)
                curveTo(9.097f, 2.5f, 11.0f, 4.403f, 11.0f, 6.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.75f)
                curveTo(4.403f, 11.0f, 2.5f, 9.097f, 2.5f, 6.75f)
                curveTo(2.5f, 4.403f, 4.403f, 2.5f, 6.75f, 2.5f)
                close()
                moveTo(6.75f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.25f)
                curveTo(11.0f, 19.597f, 9.097f, 21.5f, 6.75f, 21.5f)
                curveTo(4.403f, 21.5f, 2.5f, 19.597f, 2.5f, 17.25f)
                curveTo(2.5f, 14.903f, 4.403f, 13.0f, 6.75f, 13.0f)
                close()
                moveTo(17.25f, 2.5f)
                curveTo(19.597f, 2.5f, 21.5f, 4.403f, 21.5f, 6.75f)
                curveTo(21.5f, 9.097f, 19.597f, 11.0f, 17.25f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.75f)
                curveTo(13.0f, 4.403f, 14.903f, 2.5f, 17.25f, 2.5f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineTo(17.25f)
                curveTo(19.597f, 13.0f, 21.5f, 14.903f, 21.5f, 17.25f)
                curveTo(21.5f, 19.597f, 19.597f, 21.5f, 17.25f, 21.5f)
                curveTo(14.903f, 21.5f, 13.0f, 19.597f, 13.0f, 17.25f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _appsFill!!
    }

private var _appsFill: ImageVector? = null
