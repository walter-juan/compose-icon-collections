package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlStripe: ImageVector
    get() {
        if (_bxlStripe != null) {
            return _bxlStripe!!
        }
        _bxlStripe = Builder(name = "BxlStripe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.479f, 9.883f)
                curveToRelative(-1.626f, -0.604f, -2.512f, -1.067f, -2.512f, -1.803f)
                curveToRelative(0.0f, -0.622f, 0.511f, -0.977f, 1.423f, -0.977f)
                curveToRelative(1.667f, 0.0f, 3.379f, 0.642f, 4.558f, 1.22f)
                lineToRelative(0.666f, -4.111f)
                curveToRelative(-0.935f, -0.446f, -2.847f, -1.177f, -5.49f, -1.177f)
                curveToRelative(-1.87f, 0.0f, -3.425f, 0.489f, -4.536f, 1.401f)
                curveToRelative(-1.155f, 0.954f, -1.757f, 2.334f, -1.757f, 4.0f)
                curveToRelative(0.0f, 3.023f, 1.847f, 4.312f, 4.847f, 5.403f)
                curveToRelative(1.936f, 0.688f, 2.579f, 1.178f, 2.579f, 1.934f)
                curveToRelative(0.0f, 0.732f, -0.629f, 1.155f, -1.762f, 1.155f)
                curveToRelative(-1.403f, 0.0f, -3.716f, -0.689f, -5.231f, -1.578f)
                lineToRelative(-0.674f, 4.157f)
                curveToRelative(1.304f, 0.732f, 3.705f, 1.488f, 6.197f, 1.488f)
                curveToRelative(1.976f, 0.0f, 3.624f, -0.467f, 4.735f, -1.356f)
                curveToRelative(1.245f, -0.977f, 1.89f, -2.422f, 1.89f, -4.289f)
                curveToRelative(0.0f, -3.091f, -1.889f, -4.38f, -4.935f, -5.468f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _bxlStripe!!
    }

private var _bxlStripe: ImageVector? = null
