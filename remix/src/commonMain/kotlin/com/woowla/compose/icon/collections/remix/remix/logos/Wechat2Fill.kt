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

public val LogosGroup.Wechat2Fill: ImageVector
    get() {
        if (_wechat2Fill != null) {
            return _wechat2Fill!!
        }
        _wechat2Fill = Builder(name = "Wechat2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.458f, 18.185f)
                curveTo(3.359f, 16.677f, 2.001f, 14.4f, 2.001f, 11.908f)
                curveTo(2.001f, 7.323f, 6.476f, 3.6f, 12.001f, 3.6f)
                curveTo(17.526f, 3.6f, 22.001f, 7.323f, 22.001f, 11.908f)
                curveTo(22.001f, 16.492f, 17.526f, 20.215f, 12.001f, 20.215f)
                curveTo(10.859f, 20.215f, 9.748f, 20.062f, 8.729f, 19.754f)
                curveTo(8.637f, 19.723f, 8.513f, 19.723f, 8.421f, 19.723f)
                curveTo(8.236f, 19.723f, 8.05f, 19.785f, 7.896f, 19.877f)
                lineTo(5.705f, 21.139f)
                curveTo(5.643f, 21.169f, 5.581f, 21.2f, 5.519f, 21.2f)
                curveTo(5.334f, 21.2f, 5.18f, 21.046f, 5.18f, 20.862f)
                curveTo(5.18f, 20.769f, 5.211f, 20.708f, 5.242f, 20.615f)
                curveTo(5.273f, 20.585f, 5.55f, 19.569f, 5.705f, 18.954f)
                curveTo(5.705f, 18.892f, 5.736f, 18.8f, 5.736f, 18.739f)
                curveTo(5.736f, 18.492f, 5.643f, 18.308f, 5.458f, 18.185f)
                close()
                moveTo(8.668f, 10.512f)
                curveTo(9.385f, 10.512f, 9.953f, 9.943f, 9.953f, 9.226f)
                curveTo(9.953f, 8.508f, 9.385f, 7.94f, 8.668f, 7.94f)
                curveTo(7.95f, 7.94f, 7.383f, 8.508f, 7.383f, 9.226f)
                curveTo(7.383f, 9.943f, 7.95f, 10.512f, 8.668f, 10.512f)
                close()
                moveTo(15.334f, 10.512f)
                curveTo(16.052f, 10.512f, 16.619f, 9.943f, 16.619f, 9.226f)
                curveTo(16.619f, 8.508f, 16.052f, 7.94f, 15.334f, 7.94f)
                curveTo(14.617f, 7.94f, 14.049f, 8.508f, 14.049f, 9.226f)
                curveTo(14.049f, 9.943f, 14.617f, 10.512f, 15.334f, 10.512f)
                close()
            }
        }
        .build()
        return _wechat2Fill!!
    }

private var _wechat2Fill: ImageVector? = null
