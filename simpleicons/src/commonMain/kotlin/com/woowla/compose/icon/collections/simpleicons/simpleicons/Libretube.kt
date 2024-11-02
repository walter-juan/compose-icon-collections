package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Libretube: ImageVector
    get() {
        if (_libretube != null) {
            return _libretube!!
        }
        _libretube = Builder(name = "Libretube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.12f, 0.0f)
                curveToRelative(-0.269f, 0.004f, -0.514f, 0.22f, -0.514f, 0.521f)
                verticalLineToRelative(4.998f)
                curveToRelative(0.0f, 0.188f, 0.101f, 0.36f, 0.264f, 0.452f)
                lineToRelative(9.877f, 5.577f)
                curveToRelative(0.352f, 0.199f, 0.352f, 0.706f, 0.0f, 0.905f)
                lineTo(1.87f, 18.03f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, -0.264f, 0.453f)
                verticalLineToRelative(4.997f)
                curveToRelative(0.0f, 0.402f, 0.436f, 0.651f, 0.782f, 0.448f)
                lineTo(22.207f, 12.312f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, false, -0.0f, -0.652f)
                lineTo(2.388f, 0.072f)
                arcTo(0.516f, 0.516f, 0.0f, false, false, 2.12f, 0.0f)
                close()
                moveTo(2.115f, 7.946f)
                curveToRelative(-0.267f, 0.006f, -0.509f, 0.222f, -0.509f, 0.52f)
                verticalLineToRelative(7.056f)
                curveToRelative(0.0f, 0.398f, 0.43f, 0.648f, 0.776f, 0.452f)
                lineToRelative(6.222f, -3.528f)
                curveToRelative(0.351f, -0.199f, 0.351f, -0.705f, 0.0f, -0.904f)
                lineToRelative(-6.222f, -3.528f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, false, -0.267f, -0.068f)
                close()
            }
        }
        .build()
        return _libretube!!
    }

private var _libretube: ImageVector? = null
