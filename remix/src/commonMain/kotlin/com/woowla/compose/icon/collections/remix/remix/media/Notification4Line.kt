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

public val MediaGroup.Notification4Line: ImageVector
    get() {
        if (_notification4Line != null) {
            return _notification4Line!!
        }
        _notification4Line = Builder(name = "Notification4Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                curveTo(18.0f, 6.686f, 15.314f, 4.0f, 12.0f, 4.0f)
                curveTo(8.686f, 4.0f, 6.0f, 6.686f, 6.0f, 10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(20.0f, 18.667f)
                lineTo(20.4f, 19.2f)
                curveTo(20.566f, 19.421f, 20.521f, 19.734f, 20.3f, 19.9f)
                curveTo(20.213f, 19.965f, 20.108f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.724f, 20.0f, 3.5f, 19.776f, 3.5f, 19.5f)
                curveTo(3.5f, 19.392f, 3.535f, 19.287f, 3.6f, 19.2f)
                lineTo(4.0f, 18.667f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 5.582f, 7.582f, 2.0f, 12.0f, 2.0f)
                curveTo(16.418f, 2.0f, 20.0f, 5.582f, 20.0f, 10.0f)
                verticalLineTo(18.667f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 22.381f, 13.381f, 23.5f, 12.0f, 23.5f)
                curveTo(10.619f, 23.5f, 9.5f, 22.381f, 9.5f, 21.0f)
                close()
            }
        }
        .build()
        return _notification4Line!!
    }

private var _notification4Line: ImageVector? = null
