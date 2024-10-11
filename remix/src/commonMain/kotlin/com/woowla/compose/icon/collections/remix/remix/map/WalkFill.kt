package com.woowla.compose.icon.collections.remix.remix.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MapGroup

public val MapGroup.WalkFill: ImageVector
    get() {
        if (_walkFill != null) {
            return _walkFill!!
        }
        _walkFill = Builder(name = "WalkFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.617f, 8.712f)
                lineTo(10.822f, 6.384f)
                curveTo(11.174f, 6.127f, 11.609f, 5.985f, 12.065f, 6.001f)
                curveTo(13.176f, 6.028f, 14.152f, 6.757f, 14.492f, 7.82f)
                curveTo(14.678f, 8.404f, 14.848f, 8.798f, 15.002f, 9.002f)
                curveTo(15.914f, 10.215f, 17.365f, 11.0f, 19.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(16.826f, 13.0f, 14.882f, 12.008f, 13.599f, 10.453f)
                lineTo(12.901f, 14.408f)
                lineTo(14.962f, 16.138f)
                lineTo(17.185f, 22.246f)
                lineTo(15.306f, 22.93f)
                lineTo(13.266f, 17.326f)
                lineTo(9.876f, 14.481f)
                curveTo(9.328f, 14.038f, 9.031f, 13.319f, 9.162f, 12.577f)
                lineTo(9.671f, 9.692f)
                lineTo(8.994f, 10.184f)
                lineTo(6.867f, 13.112f)
                lineTo(5.249f, 11.936f)
                lineTo(7.6f, 8.7f)
                lineTo(7.617f, 8.712f)
                close()
                moveTo(13.5f, 5.5f)
                curveTo(12.396f, 5.5f, 11.5f, 4.605f, 11.5f, 3.5f)
                curveTo(11.5f, 2.395f, 12.396f, 1.5f, 13.5f, 1.5f)
                curveTo(14.605f, 1.5f, 15.5f, 2.395f, 15.5f, 3.5f)
                curveTo(15.5f, 4.605f, 14.605f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(10.529f, 18.681f)
                lineTo(7.315f, 22.512f)
                lineTo(5.783f, 21.226f)
                lineTo(8.758f, 17.68f)
                lineTo(9.504f, 15.5f)
                lineTo(11.295f, 17.0f)
                lineTo(10.529f, 18.681f)
                close()
            }
        }
        .build()
        return _walkFill!!
    }

private var _walkFill: ImageVector? = null
