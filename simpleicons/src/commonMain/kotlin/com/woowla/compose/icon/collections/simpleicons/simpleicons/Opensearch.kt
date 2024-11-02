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

public val Simpleicons.Opensearch: ImageVector
    get() {
        if (_opensearch != null) {
            return _opensearch!!
        }
        _opensearch = Builder(name = "Opensearch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.152f, 8.813f)
                arcToRelative(0.848f, 0.848f, 0.0f, false, false, -0.848f, 0.849f)
                curveToRelative(0.0f, 6.982f, -5.66f, 12.642f, -12.642f, 12.642f)
                arcToRelative(0.849f, 0.849f, 0.0f, false, false, 0.0f, 1.697f)
                curveTo(17.58f, 24.0f, 24.0f, 17.58f, 24.0f, 9.661f)
                arcToRelative(0.849f, 0.849f, 0.0f, false, false, -0.849f, -0.849f)
                close()
                moveTo(18.031f, 14.25f)
                curveToRelative(0.816f, -1.331f, 1.605f, -3.106f, 1.45f, -5.59f)
                curveToRelative(-0.322f, -5.147f, -4.983f, -9.051f, -9.385f, -8.628f)
                curveTo(8.372f, 0.197f, 6.602f, 1.602f, 6.76f, 4.118f)
                curveToRelative(0.068f, 1.093f, 0.603f, 1.739f, 1.473f, 2.235f)
                curveToRelative(0.828f, 0.472f, 1.891f, 0.771f, 3.097f, 1.11f)
                curveToRelative(1.456f, 0.41f, 3.145f, 0.87f, 4.444f, 1.827f)
                curveToRelative(1.556f, 1.147f, 2.62f, 2.476f, 2.257f, 4.961f)
                close()
                moveTo(1.469f, 5.25f)
                curveTo(0.654f, 6.581f, -0.135f, 8.356f, 0.02f, 10.84f)
                curveToRelative(0.322f, 5.147f, 4.983f, 9.051f, 9.385f, 8.628f)
                curveToRelative(1.723f, -0.166f, 3.493f, -1.57f, 3.336f, -4.086f)
                curveToRelative(-0.068f, -1.093f, -0.603f, -1.739f, -1.473f, -2.235f)
                curveToRelative(-0.828f, -0.472f, -1.891f, -0.771f, -3.097f, -1.11f)
                curveToRelative(-1.456f, -0.41f, -3.145f, -0.87f, -4.444f, -1.827f)
                curveToRelative(-1.556f, -1.147f, -2.62f, -2.476f, -2.257f, -4.961f)
                close()
            }
        }
        .build()
        return _opensearch!!
    }

private var _opensearch: ImageVector? = null
