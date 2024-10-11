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

public val LogosGroup.AppStoreFill: ImageVector
    get() {
        if (_appStoreFill != null) {
            return _appStoreFill!!
        }
        _appStoreFill = Builder(name = "AppStoreFill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.823f, 15.343f)
                curveTo(8.428f, 14.866f, 7.937f, 14.696f, 7.344f, 14.834f)
                lineTo(7.194f, 14.875f)
                lineTo(6.605f, 15.891f)
                curveTo(6.379f, 16.286f, 6.512f, 16.79f, 6.907f, 17.016f)
                curveTo(7.269f, 17.223f, 7.723f, 17.129f, 7.97f, 16.807f)
                lineTo(8.032f, 16.714f)
                lineTo(8.823f, 15.343f)
                close()
                moveTo(13.21f, 8.661f)
                curveTo(12.722f, 9.065f, 12.23f, 10.258f, 12.919f, 11.448f)
                lineTo(15.96f, 16.714f)
                curveTo(16.19f, 17.109f, 16.69f, 17.242f, 17.085f, 17.016f)
                curveTo(17.447f, 16.805f, 17.589f, 16.368f, 17.436f, 15.992f)
                lineTo(17.387f, 15.891f)
                lineTo(16.585f, 14.5f)
                horizontalLineTo(17.774f)
                curveTo(18.23f, 14.5f, 18.597f, 14.133f, 18.597f, 13.677f)
                curveTo(18.597f, 13.257f, 18.284f, 12.912f, 17.878f, 12.861f)
                lineTo(17.774f, 12.855f)
                horizontalLineTo(15.633f)
                lineTo(13.44f, 9.057f)
                lineTo(13.21f, 8.661f)
                close()
                moveTo(13.488f, 5.617f)
                curveTo(13.126f, 5.41f, 12.672f, 5.505f, 12.425f, 5.826f)
                lineTo(12.363f, 5.919f)
                lineTo(11.996f, 6.552f)
                lineTo(11.637f, 5.919f)
                curveTo(11.407f, 5.524f, 10.907f, 5.391f, 10.512f, 5.617f)
                curveTo(10.15f, 5.828f, 10.008f, 6.265f, 10.161f, 6.641f)
                lineTo(10.21f, 6.742f)
                lineTo(11.048f, 8.198f)
                lineTo(8.363f, 12.851f)
                horizontalLineTo(6.266f)
                curveTo(5.81f, 12.851f, 5.444f, 13.218f, 5.444f, 13.673f)
                curveTo(5.444f, 14.094f, 5.756f, 14.439f, 6.163f, 14.49f)
                lineTo(6.266f, 14.496f)
                horizontalLineTo(13.746f)
                curveTo(14.087f, 13.856f, 13.685f, 12.947f, 12.936f, 12.858f)
                lineTo(12.814f, 12.851f)
                horizontalLineTo(10.262f)
                lineTo(13.79f, 6.742f)
                curveTo(14.016f, 6.347f, 13.883f, 5.843f, 13.488f, 5.617f)
                close()
            }
        }
        .build()
        return _appStoreFill!!
    }

private var _appStoreFill: ImageVector? = null
