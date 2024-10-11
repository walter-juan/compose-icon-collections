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

public val MediaGroup.Notification2Fill: ImageVector
    get() {
        if (_notification2Fill != null) {
            return _notification2Fill!!
        }
        _notification2Fill = Builder(name = "Notification2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.031f)
                curveTo(3.0f, 6.043f, 7.029f, 2.0f, 12.0f, 2.0f)
                curveTo(16.971f, 2.0f, 21.0f, 6.043f, 21.0f, 11.031f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 22.381f, 13.381f, 23.5f, 12.0f, 23.5f)
                curveTo(10.619f, 23.5f, 9.5f, 22.381f, 9.5f, 21.0f)
                close()
            }
        }
        .build()
        return _notification2Fill!!
    }

private var _notification2Fill: ImageVector? = null
