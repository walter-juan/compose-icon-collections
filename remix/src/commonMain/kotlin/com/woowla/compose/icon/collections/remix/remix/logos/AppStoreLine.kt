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

public val LogosGroup.AppStoreLine: ImageVector
    get() {
        if (_appStoreLine != null) {
            return _appStoreLine!!
        }
        _appStoreLine = Builder(name = "AppStoreLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 7.582f, 16.418f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(8.823f, 15.343f)
                lineTo(8.032f, 16.714f)
                curveTo(7.806f, 17.109f, 7.302f, 17.242f, 6.907f, 17.016f)
                curveTo(6.512f, 16.79f, 6.379f, 16.286f, 6.605f, 15.891f)
                lineTo(7.194f, 14.875f)
                curveTo(7.855f, 14.669f, 8.395f, 14.827f, 8.823f, 15.343f)
                close()
                moveTo(13.21f, 8.661f)
                lineTo(15.633f, 12.855f)
                horizontalLineTo(17.774f)
                curveTo(18.23f, 12.855f, 18.597f, 13.222f, 18.597f, 13.677f)
                curveTo(18.597f, 14.133f, 18.23f, 14.5f, 17.774f, 14.5f)
                horizontalLineTo(16.585f)
                lineTo(17.387f, 15.891f)
                curveTo(17.613f, 16.286f, 17.48f, 16.786f, 17.085f, 17.016f)
                curveTo(16.69f, 17.242f, 16.19f, 17.109f, 15.96f, 16.714f)
                lineTo(12.919f, 11.448f)
                curveTo(12.23f, 10.258f, 12.722f, 9.065f, 13.21f, 8.661f)
                close()
                moveTo(13.488f, 5.617f)
                curveTo(13.883f, 5.843f, 14.016f, 6.347f, 13.79f, 6.742f)
                lineTo(10.262f, 12.851f)
                horizontalLineTo(12.814f)
                curveTo(13.641f, 12.851f, 14.105f, 13.823f, 13.746f, 14.496f)
                horizontalLineTo(6.266f)
                curveTo(5.81f, 14.496f, 5.444f, 14.129f, 5.444f, 13.673f)
                curveTo(5.444f, 13.218f, 5.81f, 12.851f, 6.266f, 12.851f)
                horizontalLineTo(8.363f)
                lineTo(11.048f, 8.198f)
                lineTo(10.21f, 6.742f)
                curveTo(9.984f, 6.347f, 10.117f, 5.847f, 10.512f, 5.617f)
                curveTo(10.907f, 5.391f, 11.407f, 5.524f, 11.637f, 5.919f)
                lineTo(11.996f, 6.552f)
                lineTo(12.363f, 5.919f)
                curveTo(12.589f, 5.524f, 13.093f, 5.391f, 13.488f, 5.617f)
                close()
            }
        }
        .build()
        return _appStoreLine!!
    }

private var _appStoreLine: ImageVector? = null
