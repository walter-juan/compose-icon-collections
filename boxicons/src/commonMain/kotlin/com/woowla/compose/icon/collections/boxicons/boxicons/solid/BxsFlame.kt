package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsFlame: ImageVector
    get() {
        if (_bxsFlame != null) {
            return _bxsFlame!!
        }
        _bxsFlame = Builder(name = "BxsFlame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.579f, 2.393f)
                arcToRelative(0.982f, 0.982f, 0.0f, false, false, -1.153f, 0.006f)
                curveTo(9.592f, 3.728f, 4.0f, 8.252f, 4.0f, 14.0f)
                curveToRelative(0.0f, 3.247f, 1.948f, 6.043f, 4.734f, 7.296f)
                arcTo(3.971f, 3.971f, 0.0f, false, true, 8.0f, 19.0f)
                curveToRelative(-0.017f, -3.221f, 3.558f, -6.893f, 3.71f, -7.0f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, true, 0.579f, 0.0f)
                curveToRelative(0.152f, 0.107f, 3.711f, 2.974f, 3.711f, 7.002f)
                curveToRelative(0.0f, 0.854f, -0.275f, 1.643f, -0.733f, 2.294f)
                curveTo(18.052f, 20.043f, 20.0f, 17.248f, 20.0f, 14.005f)
                curveToRelative(0.0f, -5.861f, -5.582f, -10.307f, -7.421f, -11.612f)
                close()
            }
        }
        .build()
        return _bxsFlame!!
    }

private var _bxsFlame: ImageVector? = null
