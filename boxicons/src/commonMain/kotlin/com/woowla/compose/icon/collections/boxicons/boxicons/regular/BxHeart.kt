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

public val RegularGroup.BxHeart: ImageVector
    get() {
        if (_bxHeart != null) {
            return _bxHeart!!
        }
        _bxHeart = Builder(name = "BxHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.595f)
                arcToRelative(5.904f, 5.904f, 0.0f, false, false, -3.996f, -1.558f)
                arcToRelative(5.942f, 5.942f, 0.0f, false, false, -4.213f, 1.758f)
                curveToRelative(-2.353f, 2.363f, -2.352f, 6.059f, 0.002f, 8.412f)
                lineToRelative(7.332f, 7.332f)
                curveToRelative(0.17f, 0.299f, 0.498f, 0.492f, 0.875f, 0.492f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, 0.792f, -0.409f)
                lineToRelative(7.415f, -7.415f)
                curveToRelative(2.354f, -2.354f, 2.354f, -6.049f, -0.002f, -8.416f)
                arcToRelative(5.938f, 5.938f, 0.0f, false, false, -4.209f, -1.754f)
                arcTo(5.906f, 5.906f, 0.0f, false, false, 12.0f, 4.595f)
                close()
                moveTo(18.791f, 6.205f)
                curveToRelative(1.563f, 1.571f, 1.564f, 4.025f, 0.002f, 5.588f)
                lineTo(12.0f, 18.586f)
                lineToRelative(-6.793f, -6.793f)
                curveToRelative(-1.562f, -1.563f, -1.561f, -4.017f, -0.002f, -5.584f)
                curveToRelative(0.76f, -0.756f, 1.754f, -1.172f, 2.799f, -1.172f)
                reflectiveCurveToRelative(2.035f, 0.416f, 2.789f, 1.17f)
                lineToRelative(0.5f, 0.5f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, 1.414f, 0.0f)
                lineToRelative(0.5f, -0.5f)
                curveToRelative(1.512f, -1.509f, 4.074f, -1.505f, 5.584f, -0.002f)
                close()
            }
        }
        .build()
        return _bxHeart!!
    }

private var _bxHeart: ImageVector? = null
