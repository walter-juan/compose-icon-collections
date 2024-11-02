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

public val Simpleicons.Trivago: ImageVector
    get() {
        if (_trivago != null) {
            return _trivago!!
        }
        _trivago = Builder(name = "Trivago", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.811f, 0.0f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, false, -0.134f, 0.042f)
                lineTo(2.831f, 3.18f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, -0.195f, 0.358f)
                verticalLineToRelative(9.285f)
                curveToRelative(0.0f, 0.141f, 0.114f, 0.255f, 0.255f, 0.255f)
                horizontalLineToRelative(5.181f)
                lineToRelative(10.358f, -5.727f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, 0.22f, -0.373f)
                lineTo(18.651f, 1.677f)
                curveToRelative(0.0f, -0.195f, -0.209f, -0.318f, -0.38f, -0.224f)
                lineTo(8.073f, 7.092f)
                lineTo(8.073f, 0.256f)
                curveToRelative(0.0f, -0.152f, -0.126f, -0.259f, -0.262f, -0.256f)
                close()
                moveTo(7.828f, 14.707f)
                lineTo(2.898f, 14.707f)
                curveToRelative(-0.146f, 0.0f, -0.261f, 0.122f, -0.255f, 0.267f)
                curveTo(2.822f, 19.99f, 6.944f, 24.0f, 12.003f, 24.0f)
                curveToRelative(5.059f, 0.0f, 9.18f, -4.01f, 9.36f, -9.025f)
                curveToRelative(0.005f, -0.146f, -0.11f, -0.268f, -0.256f, -0.268f)
                horizontalLineToRelative(-4.932f)
                curveToRelative(-0.131f, 0.0f, -0.244f, 0.107f, -0.255f, 0.238f)
                curveToRelative(-0.159f, 2.025f, -1.852f, 3.618f, -3.917f, 3.618f)
                curveToRelative(-2.478f, 0.0f, -3.481f, -2.105f, -3.481f, -2.105f)
                curveToRelative(-0.32f, -0.603f, -0.413f, -1.19f, -0.439f, -1.518f)
                arcToRelative(0.255f, 0.255f, 0.0f, false, false, -0.255f, -0.233f)
                close()
            }
        }
        .build()
        return _trivago!!
    }

private var _trivago: ImageVector? = null
