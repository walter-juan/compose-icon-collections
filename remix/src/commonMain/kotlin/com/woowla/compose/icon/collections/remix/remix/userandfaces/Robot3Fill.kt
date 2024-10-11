package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.Robot3Fill: ImageVector
    get() {
        if (_robot3Fill != null) {
            return _robot3Fill!!
        }
        _robot3Fill = Builder(name = "Robot3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                curveTo(5.343f, 2.0f, 4.0f, 3.343f, 4.0f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 10.761f, 6.239f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(15.0f)
                curveTo(17.761f, 13.0f, 20.0f, 10.761f, 20.0f, 8.0f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 3.343f, 18.657f, 2.0f, 17.0f, 2.0f)
                close()
                moveTo(11.0f, 7.5f)
                curveTo(11.0f, 8.328f, 10.328f, 9.0f, 9.5f, 9.0f)
                curveTo(8.672f, 9.0f, 8.0f, 8.328f, 8.0f, 7.5f)
                curveTo(8.0f, 6.672f, 8.672f, 6.0f, 9.5f, 6.0f)
                curveTo(10.328f, 6.0f, 11.0f, 6.672f, 11.0f, 7.5f)
                close()
                moveTo(16.0f, 7.5f)
                curveTo(16.0f, 8.328f, 15.328f, 9.0f, 14.5f, 9.0f)
                curveTo(13.672f, 9.0f, 13.0f, 8.328f, 13.0f, 7.5f)
                curveTo(13.0f, 6.672f, 13.672f, 6.0f, 14.5f, 6.0f)
                curveTo(15.328f, 6.0f, 16.0f, 6.672f, 16.0f, 7.5f)
                close()
                moveTo(4.0f, 22.0f)
                curveTo(4.0f, 17.582f, 7.582f, 14.0f, 12.0f, 14.0f)
                curveTo(16.418f, 14.0f, 20.0f, 17.582f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _robot3Fill!!
    }

private var _robot3Fill: ImageVector? = null
