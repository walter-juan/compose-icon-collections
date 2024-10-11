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

public val UserAndFacesGroup.Skull2Fill: ImageVector
    get() {
        if (_skull2Fill != null) {
            return _skull2Fill!!
        }
        _skull2Fill = Builder(name = "Skull2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                verticalLineTo(15.764f)
                curveTo(22.0f, 16.521f, 21.572f, 17.214f, 20.894f, 17.553f)
                lineTo(18.0f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 21.598f, 16.751f, 22.904f, 15.176f, 22.995f)
                lineTo(14.95f, 23.0f)
                curveTo(14.972f, 22.893f, 14.987f, 22.782f, 14.994f, 22.67f)
                lineTo(15.0f, 22.5f)
                verticalLineTo(22.0f)
                curveTo(15.0f, 20.946f, 14.184f, 20.082f, 13.149f, 20.006f)
                lineTo(13.0f, 20.0f)
                horizontalLineTo(11.0f)
                curveTo(9.946f, 20.0f, 9.082f, 20.816f, 9.005f, 21.851f)
                lineTo(9.0f, 22.0f)
                verticalLineTo(22.5f)
                curveTo(9.0f, 22.671f, 9.017f, 22.839f, 9.05f, 23.0f)
                lineTo(9.0f, 23.0f)
                curveTo(7.343f, 23.0f, 6.0f, 21.657f, 6.0f, 20.0f)
                verticalLineTo(19.0f)
                lineTo(3.106f, 17.553f)
                curveTo(2.428f, 17.214f, 2.0f, 16.521f, 2.0f, 15.764f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(6.895f, 11.0f, 6.0f, 11.895f, 6.0f, 13.0f)
                curveTo(6.0f, 14.105f, 6.895f, 15.0f, 8.0f, 15.0f)
                curveTo(9.105f, 15.0f, 10.0f, 14.105f, 10.0f, 13.0f)
                curveTo(10.0f, 11.895f, 9.105f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(14.895f, 11.0f, 14.0f, 11.895f, 14.0f, 13.0f)
                curveTo(14.0f, 14.105f, 14.895f, 15.0f, 16.0f, 15.0f)
                curveTo(17.105f, 15.0f, 18.0f, 14.105f, 18.0f, 13.0f)
                curveTo(18.0f, 11.895f, 17.105f, 11.0f, 16.0f, 11.0f)
                close()
            }
        }
        .build()
        return _skull2Fill!!
    }

private var _skull2Fill: ImageVector? = null
