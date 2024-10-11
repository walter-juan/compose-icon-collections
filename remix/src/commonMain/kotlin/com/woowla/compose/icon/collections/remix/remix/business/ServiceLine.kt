package com.woowla.compose.icon.collections.remix.remix.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BusinessGroup

public val BusinessGroup.ServiceLine: ImageVector
    get() {
        if (_serviceLine != null) {
            return _serviceLine!!
        }
        _serviceLine = Builder(name = "ServiceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.161f, 4.469f)
                curveTo(5.585f, 2.045f, 9.447f, 1.936f, 12.001f, 4.141f)
                curveTo(14.553f, 1.936f, 18.415f, 2.045f, 20.839f, 4.469f)
                curveTo(23.258f, 6.888f, 23.372f, 10.741f, 21.178f, 13.295f)
                lineTo(13.414f, 21.086f)
                curveTo(12.669f, 21.831f, 11.481f, 21.865f, 10.695f, 21.187f)
                lineTo(10.586f, 21.086f)
                lineTo(2.821f, 13.295f)
                curveTo(0.628f, 10.741f, 0.742f, 6.888f, 3.161f, 4.469f)
                close()
                moveTo(4.575f, 5.883f)
                curveTo(2.868f, 7.59f, 2.819f, 10.328f, 4.429f, 12.094f)
                lineTo(4.575f, 12.247f)
                lineTo(12.0f, 19.671f)
                lineTo(17.303f, 14.368f)
                lineTo(13.768f, 10.833f)
                lineTo(12.707f, 11.893f)
                curveTo(11.535f, 13.065f, 9.636f, 13.065f, 8.464f, 11.893f)
                curveTo(7.293f, 10.722f, 7.293f, 8.822f, 8.464f, 7.651f)
                lineTo(10.566f, 5.548f)
                curveTo(8.853f, 4.177f, 6.371f, 4.24f, 4.729f, 5.737f)
                lineTo(4.575f, 5.883f)
                close()
                moveTo(13.061f, 8.711f)
                curveTo(13.451f, 8.321f, 14.084f, 8.321f, 14.475f, 8.711f)
                lineTo(18.717f, 12.953f)
                lineTo(19.425f, 12.247f)
                curveTo(21.182f, 10.49f, 21.182f, 7.64f, 19.425f, 5.883f)
                curveTo(17.717f, 4.176f, 14.98f, 4.127f, 13.214f, 5.737f)
                lineTo(13.061f, 5.883f)
                lineTo(9.879f, 9.065f)
                curveTo(9.516f, 9.428f, 9.49f, 9.999f, 9.801f, 10.392f)
                lineTo(9.879f, 10.479f)
                curveTo(10.241f, 10.842f, 10.813f, 10.868f, 11.206f, 10.557f)
                lineTo(11.293f, 10.479f)
                lineTo(13.061f, 8.711f)
                close()
            }
        }
        .build()
        return _serviceLine!!
    }

private var _serviceLine: ImageVector? = null
