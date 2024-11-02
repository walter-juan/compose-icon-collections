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

public val Simpleicons.Nbc: ImageVector
    get() {
        if (_nbc != null) {
            return _nbc!!
        }
        _nbc = Builder(name = "Nbc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 4.606f)
                curveToRelative(-1.406f, 0.007f, -2.567f, 1.208f, -2.416f, 2.785f)
                horizontalLineToRelative(1.08f)
                reflectiveCurveToRelative(0.503f, -0.006f, 0.649f, 0.338f)
                curveToRelative(0.0f, 0.0f, -1.594f, 0.613f, -1.467f, 1.609f)
                lineToRelative(0.992f, 7.328f)
                lineToRelative(3.473f, -8.432f)
                curveToRelative(0.53f, -1.279f, -0.062f, -3.167f, -1.697f, -3.557f)
                arcToRelative(2.55f, 2.55f, 0.0f, false, false, -0.613f, -0.072f)
                close()
                moveTo(9.186f, 4.608f)
                arcToRelative(2.555f, 2.555f, 0.0f, false, false, -0.627f, 0.072f)
                curveToRelative(-1.636f, 0.388f, -2.227f, 2.276f, -1.697f, 3.557f)
                lineToRelative(3.473f, 8.432f)
                lineToRelative(1.242f, -9.158f)
                curveToRelative(0.219f, -1.629f, -0.956f, -2.888f, -2.391f, -2.902f)
                close()
                moveTo(4.293f, 8.31f)
                curveToRelative(-0.572f, 0.021f, -1.13f, 0.247f, -1.559f, 0.658f)
                curveToRelative(-0.803f, 0.774f, -1.428f, 2.879f, 0.371f, 4.156f)
                lineToRelative(6.953f, 4.926f)
                lineToRelative(-3.334f, -8.076f)
                curveToRelative(-0.488f, -1.17f, -1.479f, -1.699f, -2.432f, -1.664f)
                close()
                moveTo(19.564f, 8.31f)
                curveToRelative(-0.908f, 0.02f, -1.825f, 0.553f, -2.289f, 1.664f)
                lineToRelative(-3.332f, 8.076f)
                lineToRelative(6.953f, -4.926f)
                curveToRelative(1.799f, -1.275f, 1.172f, -3.382f, 0.369f, -4.156f)
                curveToRelative(-0.464f, -0.446f, -1.08f, -0.672f, -1.701f, -0.658f)
                close()
                moveTo(21.504f, 14.098f)
                curveToRelative(-0.452f, 0.007f, -0.935f, 0.157f, -1.42f, 0.502f)
                lineToRelative(-6.769f, 4.795f)
                horizontalLineToRelative(8.025f)
                curveToRelative(1.873f, 0.0f, 3.065f, -1.583f, 2.533f, -3.484f)
                curveToRelative(-0.259f, -0.926f, -1.213f, -1.832f, -2.369f, -1.813f)
                close()
                moveTo(2.496f, 14.1f)
                curveTo(1.34f, 14.081f, 0.388f, 14.985f, 0.127f, 15.91f)
                curveToRelative(-0.532f, 1.901f, 0.66f, 3.484f, 2.533f, 3.484f)
                horizontalLineToRelative(8.025f)
                lineTo(3.916f, 14.6f)
                curveToRelative(-0.485f, -0.344f, -0.968f, -0.493f, -1.42f, -0.5f)
                close()
            }
        }
        .build()
        return _nbc!!
    }

private var _nbc: ImageVector? = null
