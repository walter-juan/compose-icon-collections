package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.EditCircleLine: ImageVector
    get() {
        if (_editCircleLine != null) {
            return _editCircleLine!!
        }
        _editCircleLine = Builder(name = "EditCircleLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.684f, 4.025f)
                curveTo(12.459f, 4.006f, 12.231f, 3.997f, 12.0f, 3.997f)
                curveTo(7.582f, 3.997f, 4.0f, 7.578f, 4.0f, 11.997f)
                curveTo(4.0f, 16.415f, 7.582f, 19.997f, 12.0f, 19.997f)
                curveTo(16.418f, 19.997f, 20.0f, 16.415f, 20.0f, 11.997f)
                curveTo(20.0f, 11.766f, 19.99f, 11.538f, 19.971f, 11.312f)
                curveTo(19.9f, 10.465f, 19.695f, 9.644f, 19.368f, 8.873f)
                lineTo(20.868f, 7.371f)
                curveTo(21.203f, 8.012f, 21.471f, 8.693f, 21.661f, 9.406f)
                curveTo(21.821f, 10.006f, 21.926f, 10.622f, 21.972f, 11.248f)
                curveTo(21.991f, 11.495f, 22.0f, 11.745f, 22.0f, 11.997f)
                curveTo(22.0f, 17.52f, 17.523f, 21.997f, 12.0f, 21.997f)
                curveTo(6.477f, 21.997f, 2.0f, 17.52f, 2.0f, 11.997f)
                curveTo(2.0f, 6.474f, 6.477f, 1.997f, 12.0f, 1.997f)
                curveTo(12.252f, 1.997f, 12.502f, 2.006f, 12.749f, 2.024f)
                curveTo(13.375f, 2.071f, 13.99f, 2.175f, 14.59f, 2.336f)
                curveTo(15.303f, 2.526f, 15.985f, 2.794f, 16.626f, 3.128f)
                lineTo(15.125f, 4.629f)
                curveTo(14.352f, 4.301f, 13.532f, 4.097f, 12.684f, 4.025f)
                close()
                moveTo(20.485f, 2.097f)
                lineTo(21.899f, 3.511f)
                lineTo(12.707f, 12.704f)
                lineTo(11.295f, 12.706f)
                lineTo(11.293f, 11.29f)
                lineTo(20.485f, 2.097f)
                close()
            }
        }
        .build()
        return _editCircleLine!!
    }

private var _editCircleLine: ImageVector? = null
