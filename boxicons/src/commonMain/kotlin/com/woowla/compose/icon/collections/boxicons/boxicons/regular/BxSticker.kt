package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxSticker: ImageVector
    get() {
        if (_bxSticker != null) {
            return _bxSticker!!
        }
        _bxSticker = Builder(name = "BxSticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.796f, 9.982f)
                curveTo(20.849f, 5.357f, 16.729f, 2.0f, 12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.729f, 3.357f, 8.849f, 7.982f, 9.796f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, false, 0.908f, -0.272f)
                lineToRelative(10.633f, -10.633f)
                curveToRelative(0.238f, -0.238f, 0.34f, -0.578f, 0.273f, -0.909f)
                close()
                moveTo(11.0f, 18.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, true, 1.365f, -4.471f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 0.978f, -1.186f)
                arcToRelative(8.211f, 8.211f, 0.0f, false, true, 1.184f, -0.977f)
                arcToRelative(8.128f, 8.128f, 0.0f, false, true, 1.36f, -0.738f)
                curveToRelative(0.481f, -0.203f, 0.986f, -0.36f, 1.501f, -0.466f)
                arcToRelative(8.112f, 8.112f, 0.0f, false, true, 2.17f, -0.134f)
                lineToRelative(-8.529f, 8.529f)
                curveToRelative(-0.013f, -0.185f, -0.029f, -0.37f, -0.029f, -0.557f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -4.411f, 3.589f, -8.0f, 8.0f, -8.0f)
                curveToRelative(2.909f, 0.0f, 5.528f, 1.589f, 6.929f, 4.005f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, false, -1.943f, 0.198f)
                curveToRelative(-0.643f, 0.132f, -1.274f, 0.328f, -1.879f, 0.583f)
                arcToRelative(10.15f, 10.15f, 0.0f, false, false, -1.699f, 0.923f)
                curveToRelative(-0.533f, 0.361f, -1.03f, 0.771f, -1.479f, 1.22f)
                reflectiveCurveToRelative(-0.858f, 0.945f, -1.221f, 1.48f)
                curveToRelative(-0.359f, 0.533f, -0.67f, 1.104f, -0.922f, 1.698f)
                arcTo(10.013f, 10.013f, 0.0f, false, false, 9.0f, 18.0f)
                curveToRelative(0.0f, 0.491f, 0.048f, 0.979f, 0.119f, 1.461f)
                curveTo(6.089f, 18.288f, 4.0f, 15.336f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _bxSticker!!
    }

private var _bxSticker: ImageVector? = null
