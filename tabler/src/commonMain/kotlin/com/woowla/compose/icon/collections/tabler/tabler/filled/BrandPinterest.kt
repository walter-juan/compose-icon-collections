package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.BrandPinterest: ImageVector
    get() {
        if (_brandPinterest != null) {
            return _brandPinterest!!
        }
        _brandPinterest = Builder(name = "BrandPinterest", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -8.512f, 18.023f)
                lineToRelative(2.364f, -5.315f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.398f, 0.952f)
                curveToRelative(2.708f, 0.0f, 4.75f, -2.089f, 4.75f, -5.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.64f, 2.041f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.88f, -0.682f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.76f, -1.36f)
                curveToRelative(0.0f, 1.818f, -1.156f, 3.001f, -2.75f, 3.001f)
                curveToRelative(-0.609f, 0.0f, -1.153f, -0.361f, -1.478f, -1.022f)
                lineToRelative(1.142f, -2.572f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.828f, -0.812f)
                lineToRelative(-4.392f, 9.882f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -4.694f, -8.476f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
            }
        }
        .build()
        return _brandPinterest!!
    }

private var _brandPinterest: ImageVector? = null
