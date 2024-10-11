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

public val LogosGroup.GitlabLine: ImageVector
    get() {
        if (_gitlabLine != null) {
            return _gitlabLine!!
        }
        _gitlabLine = Builder(name = "GitlabLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.544f, 2.673f)
                curveTo(5.816f, 2.5f, 6.136f, 2.416f, 6.458f, 2.433f)
                curveTo(6.781f, 2.451f, 7.091f, 2.568f, 7.343f, 2.77f)
                lineTo(7.344f, 2.771f)
                curveTo(7.59f, 2.969f, 7.77f, 3.237f, 7.859f, 3.54f)
                lineTo(9.305f, 7.968f)
                horizontalLineTo(14.694f)
                lineTo(16.141f, 3.54f)
                curveTo(16.23f, 3.237f, 16.409f, 2.969f, 16.656f, 2.771f)
                lineTo(16.66f, 2.767f)
                curveTo(16.913f, 2.568f, 17.221f, 2.451f, 17.542f, 2.434f)
                curveTo(17.864f, 2.417f, 18.183f, 2.5f, 18.455f, 2.672f)
                lineTo(18.457f, 2.673f)
                curveTo(18.731f, 2.847f, 18.943f, 3.103f, 19.062f, 3.405f)
                lineTo(19.066f, 3.415f)
                lineTo(21.539f, 9.866f)
                curveTo(21.962f, 10.971f, 22.014f, 12.184f, 21.687f, 13.321f)
                curveTo(21.359f, 14.457f, 20.671f, 15.457f, 19.726f, 16.169f)
                lineTo(12.995f, 21.233f)
                lineTo(12.995f, 21.234f)
                curveTo(12.707f, 21.451f, 12.355f, 21.569f, 11.994f, 21.569f)
                curveTo(11.633f, 21.569f, 11.282f, 21.451f, 10.994f, 21.234f)
                lineTo(4.263f, 16.168f)
                curveTo(3.321f, 15.456f, 2.635f, 14.457f, 2.31f, 13.322f)
                curveTo(1.984f, 12.187f, 2.036f, 10.977f, 2.457f, 9.874f)
                lineTo(4.937f, 3.405f)
                curveTo(5.057f, 3.103f, 5.27f, 2.847f, 5.544f, 2.673f)
                close()
                moveTo(6.355f, 4.736f)
                lineTo(4.16f, 10.464f)
                curveTo(3.88f, 11.201f, 3.823f, 12.068f, 4.04f, 12.826f)
                curveTo(4.257f, 13.581f, 4.711f, 14.246f, 5.335f, 14.722f)
                lineTo(11.994f, 19.733f)
                lineTo(18.648f, 14.726f)
                curveTo(19.279f, 14.25f, 19.738f, 13.582f, 19.956f, 12.823f)
                curveTo(20.175f, 12.062f, 20.115f, 11.185f, 19.833f, 10.446f)
                lineTo(17.644f, 4.736f)
                lineTo(16.0f, 9.768f)
                horizontalLineTo(8.0f)
                lineTo(6.355f, 4.736f)
                close()
            }
        }
        .build()
        return _gitlabLine!!
    }

private var _gitlabLine: ImageVector? = null
