package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CupStraw: ImageVector
    get() {
        if (_cupStraw != null) {
            return _cupStraw!!
        }
        _cupStraw = Builder(name = "CupStraw", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.902f, 0.334f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.28f, 0.65f)
                lineToRelative(-2.254f, 0.902f)
                lineToRelative(-0.4f, 1.927f)
                curveToRelative(0.376f, 0.095f, 0.715f, 0.215f, 0.972f, 0.367f)
                curveToRelative(0.228f, 0.135f, 0.56f, 0.396f, 0.56f, 0.82f)
                quadToRelative(0.0f, 0.069f, -0.011f, 0.132f)
                lineToRelative(-0.962f, 9.068f)
                arcToRelative(1.28f, 1.28f, 0.0f, false, true, -0.524f, 0.93f)
                curveToRelative(-0.488f, 0.34f, -1.494f, 0.87f, -3.01f, 0.87f)
                reflectiveCurveToRelative(-2.522f, -0.53f, -3.01f, -0.87f)
                arcToRelative(1.28f, 1.28f, 0.0f, false, true, -0.524f, -0.93f)
                lineTo(3.51f, 5.132f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.5f, 5.0f)
                curveToRelative(0.0f, -0.424f, 0.332f, -0.685f, 0.56f, -0.82f)
                curveToRelative(0.262f, -0.154f, 0.607f, -0.276f, 0.99f, -0.372f)
                curveTo(5.824f, 3.614f, 6.867f, 3.5f, 8.0f, 3.5f)
                curveToRelative(0.712f, 0.0f, 1.389f, 0.045f, 1.985f, 0.127f)
                lineToRelative(0.464f, -2.215f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.303f, -0.356f)
                lineToRelative(2.5f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.65f, 0.278f)
                moveTo(9.768f, 4.607f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 8.0f, 4.5f)
                curveToRelative(-1.076f, 0.0f, -2.033f, 0.11f, -2.707f, 0.278f)
                arcTo(3.3f, 3.3f, 0.0f, false, false, 4.645f, 5.0f)
                curveToRelative(0.146f, 0.073f, 0.362f, 0.15f, 0.648f, 0.222f)
                curveTo(5.967f, 5.39f, 6.924f, 5.5f, 8.0f, 5.5f)
                curveToRelative(0.571f, 0.0f, 1.109f, -0.03f, 1.588f, -0.085f)
                close()
                moveTo(10.06f, 6.363f)
                curveTo(9.445f, 6.45f, 8.742f, 6.5f, 8.0f, 6.5f)
                curveToRelative(-1.133f, 0.0f, -2.176f, -0.114f, -2.95f, -0.308f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.435f, -0.127f)
                lineToRelative(0.838f, 8.03f)
                curveToRelative(0.013f, 0.121f, 0.06f, 0.186f, 0.102f, 0.215f)
                curveToRelative(0.357f, 0.249f, 1.168f, 0.69f, 2.438f, 0.69f)
                reflectiveCurveToRelative(2.081f, -0.441f, 2.438f, -0.69f)
                curveToRelative(0.042f, -0.029f, 0.09f, -0.094f, 0.102f, -0.215f)
                lineToRelative(0.852f, -8.03f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.435f, 0.127f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -0.89f, 0.17f)
                close()
                moveTo(4.467f, 4.884f)
                reflectiveCurveToRelative(0.003f, 0.002f, 0.005f, 0.006f)
                close()
                moveTo(11.533f, 4.884f)
                lineTo(11.528f, 4.89f)
                close()
                moveTo(11.354f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.604f, -0.21f)
                lineToRelative(-0.099f, 0.445f)
                lineToRelative(0.055f, -0.013f)
                curveToRelative(0.286f, -0.072f, 0.502f, -0.149f, 0.648f, -0.222f)
            }
        }
        .build()
        return _cupStraw!!
    }

private var _cupStraw: ImageVector? = null
