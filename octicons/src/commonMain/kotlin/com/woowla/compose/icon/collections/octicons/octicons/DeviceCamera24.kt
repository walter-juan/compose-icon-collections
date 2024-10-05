package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.DeviceCamera24: ImageVector
    get() {
        if (_deviceCamera24 != null) {
            return _deviceCamera24!!
        }
        _deviceCamera24 = Builder(name = "DeviceCamera24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.333f, 5.333f)
                curveToRelative(0.734f, 0.0f, 1.334f, 0.6f, 1.334f, 1.334f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.733f, -0.6f, 1.333f, -1.334f, 1.333f)
                lineTo(2.667f, 20.0f)
                curveToRelative(-0.734f, 0.0f, -1.334f, -0.6f, -1.334f, -1.333f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -0.734f, 0.6f, -1.334f, 1.334f, -1.334f)
                curveTo(2.667f, 4.6f, 3.267f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(5.333f)
                curveToRelative(0.734f, 0.0f, 1.334f, 0.6f, 1.334f, 1.333f)
                horizontalLineToRelative(10.666f)
                close()
                moveTo(15.333f, 17.333f)
                arcTo(4.655f, 4.655f, 0.0f, false, false, 20.0f, 12.667f)
                arcTo(4.655f, 4.655f, 0.0f, false, false, 15.333f, 8.0f)
                arcToRelative(4.655f, 4.655f, 0.0f, false, false, -4.666f, 4.667f)
                arcToRelative(4.655f, 4.655f, 0.0f, false, false, 4.666f, 4.666f)
                close()
                moveTo(18.667f, 12.667f)
                arcTo(3.343f, 3.343f, 0.0f, false, true, 15.333f, 16.0f)
                arcTo(3.352f, 3.352f, 0.0f, false, true, 12.0f, 12.667f)
                arcToRelative(3.352f, 3.352f, 0.0f, false, true, 3.333f, -3.334f)
                arcToRelative(3.352f, 3.352f, 0.0f, false, true, 3.334f, 3.334f)
                close()
                moveTo(9.333f, 8.0f)
                lineTo(9.333f, 6.667f)
                lineTo(4.0f, 6.667f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(5.333f)
                close()
            }
        }
        .build()
        return _deviceCamera24!!
    }

private var _deviceCamera24: ImageVector? = null
