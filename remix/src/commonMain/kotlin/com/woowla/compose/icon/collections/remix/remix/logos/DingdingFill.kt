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

public val LogosGroup.DingdingFill: ImageVector
    get() {
        if (_dingdingFill != null) {
            return _dingdingFill!!
        }
        _dingdingFill = Builder(name = "DingdingFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.477f, 17.523f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.49f, 11.04f)
                lineTo(16.484f, 11.054f)
                curveTo(16.064f, 11.952f, 14.968f, 13.713f, 14.968f, 13.713f)
                curveTo(14.968f, 13.713f, 14.967f, 13.709f, 14.963f, 13.702f)
                lineTo(14.642f, 14.26f)
                horizontalLineTo(16.186f)
                lineTo(13.238f, 18.179f)
                lineTo(13.907f, 15.513f)
                horizontalLineTo(12.693f)
                lineTo(13.115f, 13.75f)
                curveTo(12.774f, 13.832f, 12.37f, 13.945f, 11.892f, 14.099f)
                curveTo(11.892f, 14.099f, 11.246f, 14.477f, 10.03f, 13.37f)
                curveTo(10.03f, 13.37f, 9.21f, 12.648f, 9.686f, 12.468f)
                curveTo(9.888f, 12.391f, 10.667f, 12.293f, 11.281f, 12.211f)
                curveTo(12.109f, 12.099f, 12.619f, 12.039f, 12.619f, 12.039f)
                curveTo(12.619f, 12.039f, 10.064f, 12.078f, 9.458f, 11.982f)
                curveTo(8.852f, 11.887f, 8.083f, 10.875f, 7.919f, 9.986f)
                curveTo(7.919f, 9.986f, 7.666f, 9.498f, 8.464f, 9.729f)
                curveTo(9.262f, 9.96f, 12.565f, 10.629f, 12.565f, 10.629f)
                curveTo(12.565f, 10.629f, 8.269f, 9.312f, 7.983f, 8.99f)
                curveTo(7.697f, 8.669f, 7.142f, 7.236f, 7.214f, 6.356f)
                curveTo(7.214f, 6.356f, 7.245f, 6.137f, 7.471f, 6.195f)
                curveTo(7.471f, 6.195f, 10.647f, 7.647f, 12.818f, 8.441f)
                curveTo(14.99f, 9.236f, 16.878f, 9.64f, 16.635f, 10.669f)
                curveTo(16.614f, 10.756f, 16.562f, 10.885f, 16.49f, 11.04f)
                close()
            }
        }
        .build()
        return _dingdingFill!!
    }

private var _dingdingFill: ImageVector? = null
